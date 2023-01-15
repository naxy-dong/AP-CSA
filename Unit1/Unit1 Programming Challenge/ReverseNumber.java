import java.util.Scanner;

public class ReverseNumber{
  public void printReverse(){
    int num;
    int digit1;
    int digit2;
    int digit3;

    Scanner in = new Scanner(System.in);
    System.out.println("Enter a 3 digits number");
    num = in.nextInt();

    digit1 = num%10;
    num = num/10;
    digit2 = num%10;
    num = num/10;
    digit3 = num%10;

    System.out.print(digit1);
    System.out.print(digit2);
    System.out.println(digit3);
  }
}