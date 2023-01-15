public class Eleven{
    private Deck fullDeck;
    private Deck elevenDeck;
    public Eleven(){
      fullDeck = new Deck(true);
      elevenDeck = new Deck(false);
      
      //print cards (call after shuffle. print first 9 cards to console)
      for (int i=0; i<9; i++) {
        elevenDeck.transferCard(fullDeck);
      }
      System.out.println(elevenDeck.getDeck());
    }
    //checks if 2 cards addUptoEleven
    public boolean addUpToEleven(String s1, String s2){
      if(convertToNum(s1)+ convertToNum(s2) == 11){
        return true;
      }
      System.out.println("Does not add up to 11");
      return false;
    }
    //remove the 2 cards that add up to 11
    public void removeEleven(String s1, String s2){
      //check if cards are present
      int num1 = convertToNum(s1);
      int num2 = convertToNum(s2);
      int index1 = elevenDeck.findCard(num1);
      int index2 = elevenDeck.findCard(num2);
      
      if(index1 == -1 || index2 == -1){
        System.out.println("Cards not in deck, please try a different combination.");
      }
      else{
        elevenDeck.removeCard(num1);
        elevenDeck.removeCard(num2);
      }
    }
  
    public boolean haveJQKinDeck(){
      //checks for j,q,k
      int j = elevenDeck.findCard(11);
      int q = elevenDeck.findCard(12);
      int k = elevenDeck.findCard(13);
      //if it isn't there
      if (j == -1 || q == -1 || k == -1) {
        return false;
      }
      else{
        return true;
      }
    }
    //find and remove jqk
    public void removeJQK() {
      if(haveJQKinDeck()){
        //removes them
        elevenDeck.removeCard(11);
        elevenDeck.removeCard(12);
        elevenDeck.removeCard(13);
      }
      else{
        System.out.println("Cards not in deck, please try a different combination.");
      }
    }
    
    //replace all missing cards until it has 9 cards on the board
    public void replaceCards(){
      while(elevenDeck.getSize() != 9 && fullDeck.getSize() != 0){
        elevenDeck.transferCard(fullDeck);
      }
      System.out.println(elevenDeck.getDeck());
    }
  
    public int convertToNum(String s){
      int num;
      switch(s) {
        case "A": num = 1;
        break;
        case "J": num = 11;
        break;
        case "Q": num = 12;
        break;
        case "K": num = 13;
        break;
        default: num = Integer.parseInt(s);
      }
      return num;
    }
  
    public boolean gameEnded(){
      if(fullDeck.getSize() == 0){
        System.out.println("you win");
        return true;
      }
      if(!have11combination() && !haveJQKinDeck()){
        System.out.println("you lose");
        return true;
      }
      return false;
    }
  
    public boolean have11combination(){
      for(int i = 0; i < elevenDeck.getSize(); i++){
        for(int j = i+1; j < elevenDeck.getSize(); j++){
          if(elevenDeck.getDeck().get(i).getNumber() + elevenDeck.getDeck().get(j).getNumber() == 11){
            return true;
          }
        }
      }
      return false;
    }
  }