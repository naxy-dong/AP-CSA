public class SpinnerGame
{
  /** Precondition: min < max
  * Simulates a spin of a spinner by returning a random integer
  * between min and max, inclusive.
  */
  public int spin(int min, int max)
  { 
    return (int)(Math.random()*(max-min+1) + min);
  }

  public void playRound()
  {
    int playerSpin;
    int computerSpin;
    int score = 0;
    playerSpin = spin(1,10);
    computerSpin = spin(2,8);
    //playerSpin = 0;
    //computerSpin = 0;
    System.out.print("Player spin:" + playerSpin);
    System.out.println("\tComputer spin:" + computerSpin);
    if(playerSpin > computerSpin){
      score = Math.abs(playerSpin - computerSpin);
      System.out.println("You gained " + score + " points");
    }
    else if(computerSpin > playerSpin){
      score = Math.abs(playerSpin - computerSpin);
      System.out.println("You lose -" + score + " points");
    }
    else{
      playerSpin = spin(1,10);
      computerSpin = spin(2,8);
      //playerSpin = 0;
      //computerSpin = 0;
      System.out.print("Player spin:" + playerSpin);
      System.out.println("\tComputer spin:" + computerSpin);
      if(playerSpin > computerSpin){
        System.out.println("You gained 1 points");
      }
      else if(computerSpin > playerSpin){
        System.out.println("You lose -1 points");
      }
      else{
        System.out.println("Tie, 0 points");
      }
    }
  }
}
