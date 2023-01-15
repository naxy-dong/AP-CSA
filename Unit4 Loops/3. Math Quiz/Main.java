import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner jIn = new Scanner(System.in);
    int number1;
    int number2;
    int answer;
    int input = -1;

    number1 = (int)(Math.random()*10 + 1);
    number2 = (int)(Math.random()*10 + 1);
    answer = number1 + number2;

    while (input != answer){
      System.out.println("What's is " + number1 + " + " + number2 + "?");
      input = jIn.nextInt();
      if(input != answer){
        System.out.println("Wrong Answer. Try Again");
      }
    }
    System.out.println("Yes, " + answer + " is the correct answer.");
  }
}