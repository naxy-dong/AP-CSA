import java.util.Scanner;

public class IncrementNumber{
  public void increment(){
    int digit5;
    int digit4;
    int digit3;
    int digit2;
    int digit1;
    int num;

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a 5 digit number");
    num = input.nextInt();
    
    digit5 = num%10;
    num /=10;
    digit4 = num%10;
    num /= 10;
    digit3 = num%10;
    num /= 10;
    digit2 = num%10;
    num /= 10;
    digit1 = num%10;
    num /= 10;
    
    if(++digit5 == 10){
      digit5 = 0;
    }
    if(++digit4 == 10){
      digit4 = 0;
    }
    if(++digit3 == 10){
      digit3 = 0;
    }
    if(++digit2 == 10){
      digit2 = 0;
    }
    if(++digit1 == 10){
      digit1 = 0;
    }
    System.out.print(digit1);
    System.out.print(digit2);
    System.out.print(digit3);
    System.out.print(digit4);
    System.out.println(digit5);
  }
}
