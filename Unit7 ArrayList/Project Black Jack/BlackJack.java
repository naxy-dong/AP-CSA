public class BlackJack{
  private Deck d = new Deck(true);
  private Deck playerDeck = new Deck(false);
  private Deck computerDeck = new Deck(false);
  private boolean playerStayed = false;
  private boolean computerStayed = false;
  private boolean gameEnded = false;

  public BlackJack(){
    for(int i = 0; i < 2; i++){
      playerDeck.transferCard(d);
      computerDeck.transferCard(d);
    }
    //save for debugging purposes
    // System.out.println("*********player deck********\n " + playerDeck.getDeck());
    // System.out.println("****************Computer deck:***********\n " + computerDeck.getDeck());
  }

  public Deck getPlayerDeck() {
    return playerDeck;
  }
  public Deck getComputerDeck() {
    return computerDeck;
  }
  public boolean getPlayerStayed(){
    return playerStayed;
  }
  public void playerStay() {
    playerStayed = true;
  }

  //card is added to the player's deck
  public void playerHit() {
    playerDeck.transferCard(d);
  }
  
  //ai that runs dealer's side of the game
  public void AI(){
    if(computerStayed == false){
      int computerScore = computerDeck.calculateHand();
      if(computerScore >= 21){
        System.out.println("***Computer stayed***");
        computerStayed= true;
      }
      else if(computerScore >= 15 && computerScore <= 21){
        if(Math.random() > 0.5){
          System.out.println("***Computer stayed***");
          computerStayed= true;
        }
        else{
          System.out.println("***Computer hit***");
          computerDeck.transferCard(d);
        }
      }
      else{
        System.out.println("***Computer hit***");
        computerDeck.transferCard(d);
      }
    }
  }

  //if both players stay, checks which won
  public void compareHands(){
    if(computerStayed && playerStayed){
      System.out.println("Computer deck:" + computerDeck.getDeck());
      System.out.println("Computer deck value " + computerDeck.calculateHand());
      int playerScore = playerDeck.calculateHand();
      int computerScore = computerDeck.calculateHand();
      if(computerScore > 21 || 21 - playerScore < 21 - computerScore){
        System.out.println("You win");
      }
      else if(playerScore > 21 ||  21 - playerScore > 21 - computerScore){
        System.out.println("You lose");
      }
      else{
        System.out.println("It's a tie");
      }
      gameEnded = true;
    }
  }

  //returns game status
  public boolean getGameStatus(){
    return gameEnded;
  }
}