public class Rectangle
{
   //Instance Variables
   private int length;
   private int width;
   //Constructor - sets the values for the instance variables   
   public Rectangle(int len, int wid)
   {   
      length = len;
      width = wid;
   }
   //Add a constructor for a square
   public Rectangle(int side){
     length = side;
     width = side;
   }

   //Add two methods to get and return the length and the width
   public int length(){
     return length;
   }
   public int width(){
     return width;
   }


   //Add two methods to set the length and the width
   public void setLength(int len){
     length = len;
   }

   public void setWidth(int wid){
     width = wid;
   }

   //This returns the area
   public int area()
   { 
     return length * width;
   }

   //Add a method to find the perimeter 
   public int perimeter(){
     return (length + width)*2;
   }
}