import java.util.Scanner;

public class GuessingGame{
  private double number;
  private int guessLimit;
  private int guessTries;
  //this is a constructor, so it has to have the same name with the class itself
  public GuessingGame(){ 
    number = Math.floor(Math.random() * 10) + 1;
    guessLimit = 4;
    guessTries = 0;
  }

  public void runGame(){
    Scanner jIn = new Scanner(System.in);
    int guess;
    
    do{
      System.out.println("Choose a between 1 and 10 (or choose 0 to exit).");
      guess = jIn.nextInt();

      if(guess == number){
        System.out.println("Nice, you guessed it.");
      }
      if(guess == 0){
        System.out.println("Aww, don't give up, try again.");
      }
      if(++guessTries > guessLimit){
        System.out.println("You ran out of tries :(");
      }

    } while(guess != number && guess != 0 && guessTries <= guessLimit);
    playAgain();
  }

  public void playAgain(){
    Scanner jIn2 = new Scanner(System.in);
    System.out.println("Do you want to try again(Y/N)");
    String ans = jIn2.nextLine();
    
    if(ans == "Y"){
      runGame();
    }
    else if(ans == "N"){ 
      System.out.println("Goodbye, come back next time");
    }
    else{
      System.out.println("Please insert a valid input");
      playAgain();
    }
  }
}