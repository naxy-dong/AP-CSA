import java.util.Scanner;

public class CalcAverage{
  public void calculateAverage(){
    double num1;
    double num2;
    double num3;
    double average;

    Scanner input = new Scanner(System.in);
    System.out.println("Enter 1st Number");
    num1 = input.nextDouble();
    System.out.println("Enter 2nd Number");
    num2 = input.nextDouble();
    System.out.println("Enter 3rd Number");
    num3 = input.nextDouble();

    average = (num1 + num2 + num3)/3;
    System.out.println("The average is " + average);
  }
}
