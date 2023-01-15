public class Point
{
  private double x;
  private double y;
  
  public Point(double setX, double setY)
  {
      x = setX;
      y = setY;
  }
   
   public void setX(double setX) 
   { 
       x = setX;
   }
   
   public void setY(double setY)
   {
       y = setY;
   }
   
   public double getX()
   {
      return x;
   }
   
   public double getY()
   {
       return y;
   }
   
   public boolean equals(Point point){
     if(x == point.getX() && y == point.getY()){
       return true;
     }
     return false;
   }

   public String toString()
   {
      return "("+getX()+","+getY()+")";
   }
}