class Main {
    public static void main(String[] args) {
      Metrocard card = new ReducedFareCard();
      System.out.println(card.getBalance());
      card.fillCard(100);
      card.swipeCard(40);
      System.out.println(card.getBalance()+"\n");
  
      ActivatedCard card1 = new ActivatedCard();
      Metrocard card2 = new ActivatedCard();
      card1.fillCard();
      card1.swipeCard();
      card2.fillCard(100);
      card2.swipeCard(40);
      System.out.println(card1.getBalance());
      System.out.println(card2.getBalance()+"\n");
  
      SingleRideCard card3 = new SingleRideCard();
      System.out.println(card3.swipeCard());
      System.out.println(card3.getBalance());
      System.out.println(card3.swipeCard()+"\n");
  
      StudentCard card4 = new StudentCard();
      System.out.println(card4.getAllotment());
      card4.swipeCard();
      System.out.println(card4.getAllotment());
    }
  }