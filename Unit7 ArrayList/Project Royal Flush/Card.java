//11: Jack; 12: Queen; 13: King      for suit
//1: Clubs; 2: Diamonds; 3: Hearts; 4: Spades 

class Card {
    private int suit;
    private int number;
  
    //card constructor
    public Card(int suit, int number){
      this.suit = suit;
      this.number = number;
    }
  
    //accessor for suit
    //return the suit number
    public int getSuit(){
      return suit;
    }
  
    //sets the suit
    //precondition suit must be between 1-4
    public void setSuit(int suit){
      this.suit = suit;
    } 
  
    //accessor for number
    public int getNumber(){
      return number;
    }
  
    //sets number
    //precondition suit must be between 1-13
    public void setNumber(int number){
      this.number = number;
    }
  
    //string converter
    public String toString(){
      return convert(this);
    }
  
    //convert card to string
    public String convert(Card c) {
      int s = c.getSuit();
      int n = c.getNumber();
      String cardSuit = "";
      String cardNum = "";
  
      //find num
      switch(n) {
        case 1: cardNum = "A";
        break;
        case 11: cardNum = "J";
        break;
        case 12: cardNum = "Q";
        break;
        case 13: cardNum = "K";
        break;
        default: cardNum = Integer.toString(n);
      }
   
      //find suit
      switch(s) {
        case 1: cardSuit = "♣";
        break;
        case 2: cardSuit = "♢";
        break;
        case 3: cardSuit = "♡";
        break;
        case 4: cardSuit = "♠";
        break;
      }
  
      //return card of suit (Ace of Spades, etc)
      return cardNum + cardSuit;
    }
  }