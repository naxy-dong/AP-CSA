public class ActivatedCard extends Metrocard
{
   private boolean active;

   public ActivatedCard()
   {
      System.out.println("ActivatedCard constructor");
      active = true;
   }
   
   //Accessors
   public boolean isActive()                    
   {
      return active;
   }
   
   //Class Member Methods
   public void fillCard()
   {
      System.out.println("ActivatedCard fillCard()");
      active = true;
   }
   
   public void fillCard(int howMuch)
   {
      System.out.println("ActivatedCard fillCard(int howMuch)");
      this.fillCard();
   }
   
   public void deactivate()
   {
      active = false;
   }
   
   public boolean swipeCard()
   {
      System.out.println("ActivatedCard swipeCard()");
      if(!active)
         return false;

      return true;
   }
   
   public boolean swipeCard(double fare)
   {
      System.out.println("ActivatedCard swipeCard(howMuch)");
      return this.swipeCard();
   }
}
