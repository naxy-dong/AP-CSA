import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner jIn = new Scanner(System.in);
    System.out.println("Enter your 2 digit lottery number.");
    int input = jIn.nextInt();
    Lottery l = new Lottery(input);
    l.report();
  }
}