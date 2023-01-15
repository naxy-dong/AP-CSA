public class Triangle
{
   //Instance Variables
   private int side1;
   private int side2;
   private int side3;
   //Constructor - sets the values for the instance variables 
   public Triangle(int s1, int s2, int s3)
   {
      if(s1 + s2 <= s3 || s1 + s3 <= s2 || s2 + s3 <= s1){
        System.out.println("Invalid Triangle");
      }
      else{
        side1 = s1;
        side2 = s2;
        side3 = s3;
      }
   }

   //Add two methods to get and return the length and the width
   public int getSide1(){
     return side1;
   }
   public int getSide2(){
     return side2;
   }
   public int getSide3(){
     return side3;
   }

   //Add two methods to set the length and the width
   public void setSide1(int s1){
     side1 = s1;
   }
   public void setSide2(int s2){
     side2 = s2;
   }
   public void setSide3(int s3){
     side3 = s3;
   }

   //This returns the area
   public int area()
   { 
    //  double value3 = (double)Math.sin(side3);
    //  double value2 = (double)side2;
    //  double value1 = (double)side1;
    //  return 1/2 * value1 * value2 * value3;
   }

   //Add a method to find the perimeter 
   public int perimeter(){
     return side1 + side2 + side3;
   }
}