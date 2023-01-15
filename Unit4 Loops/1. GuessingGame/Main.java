import java.util.Scanner;

public class Main 
{
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
   // Choose a random number from 0-100 
    int randomNum = (int)(Math.random() * 101);
    System.out.println("The secret number is " + randomNum);
    

   // Ask the user to guess a number from 0 to 100 
   // Get the first guess using scan.nextInt();
   int guess = scan.nextInt();

   // Loop while the guess does not equal the random number,
    while(guess != randomNum){
     // If the guess is less than the random number, print out "Too low!"
      if(guess < randomNum){
        System.out.println("Too Low");
      }
     // If the guess is greater than the random number, print out "Too high!"
      if(guess > randomNum){
        System.out.println("Too High");
      }
     // Get a new guess (save it into the same variable)
      guess = scan.nextInt();
    }

  // Print out something like "You got it!"
    System.out.println("You got it!");

  }
}