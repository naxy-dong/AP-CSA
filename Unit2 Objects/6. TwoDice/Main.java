class Main {
  public static void main(String[] args) {
    Die die1 = new Die(18);
    Die die2 = new Die(18);
    TwoDice td1 = new TwoDice(die1, die2);
    System.out.println(td1.TwoDiceRolls());
    System.out.println(td1.TwoDiceRolls());
    System.out.println(td1.TwoDiceRolls());
    System.out.println(td1.TwoDiceRolls());

    for(int i = 0; i<10; i++){
      System.out.println("Roll number " + i + " is " + td1.TwoDiceRolls());
    }
  }
}