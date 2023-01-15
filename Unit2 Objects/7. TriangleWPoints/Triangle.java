

public class Triangle
{
   //Instance Variables
   private Point point1;
   private Point point2;
   private Point point3;
   private double length1;
   private double length2;
   private double length3;
   //Constructor - sets the values for the instance variables 
   public Triangle(Point point1, Point point2, Point point3)
   {
     this.point1 = point1;
     this.point2 = point2;
     this.point3 = point3;
     length1 = (double)(Math.sqrt(Math.pow(this.point1.getX() - this.point2.getX(),2) + Math.pow(this.point1.getY() - this.point2.getY(),2)));
     
     length2 = (double)(Math.sqrt(Math.pow(this.point1.getX() - this.point3.getX(),2) + Math.pow(this.point1.getY() - this.point3.getY(),2)));

     length3 = (double)(Math.sqrt(Math.pow(this.point3.getX() - this.point2.getX(),2) + Math.pow(this.point3.getY() - this.point2.getY(),2)));
   }

   //Add two methods to get and return the length and the width
   public String getPoint1(){
     return this.point1.toString();
   }
   public String getPoint2(){
     return this.point2.toString();
   }
   public String getPoint3(){
     return this.point3.toString();
   }

   //Add two methods to set the length and the width
   public void setPoint1(double x, double y){
     this.point1.setX(x);
     this.point1.setY(y);
   }
   public void setPoint2(double x, double y){
     this.point2.setX(x);
     this.point2.setY(y);
   }
   public void setPoint3(double x, double y){
     this.point3.setX(x);
     this.point3.setY(y);
   }

  public double distance(Point p1, Point p2)
   {
      return Math.sqrt(Math.pow(p2.getY()-p1.getY(),2) + Math.pow(p2.getX()-p1.getX(),2));
   } 
   
   public double perimeter()
   {
      return distance(this.point1,this.point2) + distance(this.point2,this.point3) + distance(this.point3,this.point1);
   }
     
   public String toString()
   {
      return "(" + this.point1 +","+this.point2+","+this.point3+")\n";
   }
   
}