class Main {
    public static void main(String[] args) {
      //explain the rules
      System.out.println("Hello, welcome to the JugGame. \nYou There are 2 jugs. Jug number one holds 5 gallons of water. Jug number two holds 6 gallons.\nThere are no measuring lines on the jugs.There’s a tap with limitless water that you can use to fill either of the jugs at any time.\nThe jugs have no water when the game start. Your goal is to put exactly 2 gallons of water into the six gallon jug.");
      JugGame j = new JugGame();
      j.runGame();
    }
  }