public class SingleRideCard extends ActivatedCard
{
   public SingleRideCard()
   {
      System.out.println("SingleRide Card constructor");
   }
   
   public boolean swipeCard()
   {
      System.out.println("SingleRide Card swipeCard()");
      
      boolean success = super.swipeCard();
      deactivate();
      return success;
   }
}