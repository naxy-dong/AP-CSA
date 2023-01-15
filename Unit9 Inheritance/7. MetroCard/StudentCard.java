public class StudentCard extends ActivatedCard
{
   private int allotment;
   
   public StudentCard()
   {
      System.out.println("Student Card Constructor");
      allotment = 3;
   }
   
   public int getAllotment()                 
   {
      return allotment;
   }
   
   public void fillCard()
   {
      System.out.println("Student Card fillCard()");
      super.fillCard();
      allotment = 3;
   }
   
   public boolean swipeCard()
   {
      System.out.println("Student Card swipeCard()");
      allotment--;

      boolean success = super.swipeCard();

      if (allotment <= 0)
         deactivate();
         
      return success;
   }
}