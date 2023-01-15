/** A class for running and testing Die
  * All three constructors will be tested.  
  * Create a Die using each of the constructors.
  * print the value for a roll for each of the Die.
  * */
  class Main {
    public static void main(String[] args) {
      Die d1 = new Die();
      System.out.println(d1.roll());
      Die d2 = new Die(18);
      System.out.println(d2.roll());
      Die d3 = new Die(2,32);
      System.out.println(d3.roll());
    }
  }