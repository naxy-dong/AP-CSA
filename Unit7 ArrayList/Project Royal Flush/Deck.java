import java.util.ArrayList;

class Deck {
  private ArrayList<Card> deck = new ArrayList<Card>();
  /*
    //constructor for the deck
  */
  public Deck(boolean fullDeck) {
    if(fullDeck){
      //for loop for suits
      for (int i=1; i<=4; i++) {
        //for loop for numbers
        for (int j=1; j<=13; j++){
          deck.add(new Card(i,j));
        }
      }
    }
    deck = shuffleDeck(deck);
  }

  /*
    //accessor for decks
    //return itself
  */
  public ArrayList<Card> getDeck(){
    return deck;
  }

  /*
    //sets 'this' to the deck parameter
  */
 
  public void setDeck(ArrayList<Card> d){
    deck = d;
  }
  /*
     //accessor for card
    //precondition: deck.size() >= 1
  */
 
  public Card getCard(){
    return deck.get(0);
  }
  /*
    //accessor for deck size
  */
  
  public int getSize(){
    return deck.size();
  }
  
  //adds card to deck
  public void addCard(Card c){
    deck.add(c);
  }

  //find the number and return the index
  //return -1 if card is non existent
  public int findCard(int number){
    //loop through the 
    for(int i = 0; i < deck.size(); i++){
      if(deck.get(i).getNumber() == number){
        return i;
      }
    }
    return -1;
  }

  //remove the first card of the deck
  //precondition: deck.size != 0
  public void removeFirstCard(){
    deck.remove(0);
  }

  //removes card from deck
  public void removeCard(int num){
    deck.remove(findCard(num));
  }

  //transfers card
  //precondition d.size() == 0
  public void transferCard(Deck d){
    deck.add(d.getCard());
    d.removeFirstCard();
  }

  //shuffles deck
  public ArrayList<Card> shuffleDeck(ArrayList<Card> deck){
    ArrayList<Card> temp = new ArrayList<Card>();
    while(deck.size() != 0){
      int index =(int)(Math.floor(Math.random() * deck.size()));
      Card removedCard = deck.remove(index);
      temp.add(removedCard);
    }
    return temp;
  } 
}