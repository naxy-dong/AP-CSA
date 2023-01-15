import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    BlackJack bj = new BlackJack();
    Scanner j = new Scanner(System.in);
    
    //game starts - user and dealer get dealt two cards each, one face up and one face down

    while (bj.getGameStatus() == false) {
      // System.out.println("Computer deck:" + bj.getComputerDeck().getDeck());
      // System.out.println("Computer deck value " + bj.getComputerDeck().calculateHand());
      if(bj.getPlayerStayed() == false){
        System.out.println("Player deck:" + bj.getPlayerDeck().getDeck());
        System.out.println("Player deck value is " + bj.getPlayerDeck().calculateHand());// debugging purpose
        System.out.println("Would you like to hit (type H) or stay (type S)?");
        String hs = j.nextLine();
        if (hs.equals("H")) {
          bj.playerHit();
        }
        if(hs.equals("S")){
          bj.playerStay();
        }
      }
      
      bj.AI();
      bj.compareHands();
    }
  }
}
