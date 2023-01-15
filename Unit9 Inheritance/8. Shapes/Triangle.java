//This is the triangle class, this is a subclass of super class shape

public class Triangle extends Shape{
    private double length1;
    private double length2;
    private double length3;
    private double perimeter;
    //the use of superclass
    public Triangle(double l1,double l2,double l3){
      super(3);//triangle has 3 sides
      length1=l1;
      length2=l2;
      length3=l3;
      calculatePerimeter();
    }
    //This method calculates the perimeter of the triangle
    private void calculatePerimeter(){
      perimeter = length1 + length2 + length3;
    }
    //Returns the perimeter attribute
    public double getPerimeter(){
      return perimeter;
    }
  
    public String toString(){
      return super.toString() + " and the perimeter is " + getPerimeter() + " units";
    }
  }