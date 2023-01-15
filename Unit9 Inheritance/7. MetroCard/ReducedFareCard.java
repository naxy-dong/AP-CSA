public class ReducedFareCard extends Metrocard
{
   public ReducedFareCard()
   {
      System.out.println("ReducedFareCard constructor");
   }
   
   public ReducedFareCard(double initialBalance)
   {
      super(initialBalance);
      System.out.println("ReducedFareCard constructor(initialBalance)");
   }
   
   //Class Member Variables
   public boolean swipeCard(double fare)
   {
      System.out.println("ReducedFareCard swipeCard()");
      return super.swipeCard(fare / 2.0);
   }
}