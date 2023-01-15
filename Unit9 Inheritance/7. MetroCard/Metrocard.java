public class Metrocard
{
   private double balance;
   
   public Metrocard()
   {
      balance = 0;
      System.out.println("Metrocard constructor");
   }
   
   public Metrocard(double initialBalance)
   {
      System.out.println("Metrocard constructor(initialBalance)");
      balance = initialBalance;
   }
   
   //Accessors
   public double getBalance()                         
   {
      return balance;
   }
   
   //Class Member Methods
   public void fillCard(double howMuch)
   {
      System.out.println("Metrocard fillCard()");
      balance += howMuch;
   }
   
   public boolean swipeCard(double fare)
   {
      System.out.println("Metrocard swipeCard()");
      if (balance <= fare)
         return false;
   
      balance -= fare;
      return true;
   }
}
