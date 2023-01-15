public class Triangle
{
   private Point p1;
   private Point p2;
   private Point p3;
   
   public Triangle(Point p1,Point p2, Point p3)
   {
     this.p1 = p1;
     this.p2 = p2;
     this.p3 = p3;
   }
   
   
   //Getters (aka accessors)
   public Point getP1()
   {
      return this.p1;
   }
   public Point getP2()
   {
      return this.p2;
   }
   
   public Point getP3()
   {
      return this.p3;
   }
   
   //Setters (aka mutators)
   public void setP1(Point p1)
   {
      this.p1 = p1;
   }
   public void setP2(Point p2)
   {
      this.p2 = p2;
   }
   public void setP3(Point p3)
   {
      this.p3 = p3;
   }
   
   //Use distance from Point class to find the perimeter   
   public double perimeter()
   {
      return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
   }
   
   // Method to test for a right-angled triangle.
   public boolean isRight () {
      double side1 = p1.distance(p2);
      double side2 = p2.distance(p3);
      double side3 = p3.distance(p1);
      if (((side1*side1) == ((side2*side2) + (side3*side3))) ||
          ((side2*side2) == ((side1*side1) + (side3*side3))) ||
          ((side3*side3) == ((side1*side1) + (side2*side2))))
         return true;
      else
         return false;
   }
     
   public String toString()
   {
      return "(" + p1 +","+p2+","+p3+")";
   }
}