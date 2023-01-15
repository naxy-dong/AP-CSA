//This is the Quadrilateral class, this is a subclass of super class shape

//9.1 Creating Superclasses and Subclasses - name the super (parent) class and the sub (child) class
public class Quadrilateral extends Shape{
    private double length1;
    private double length2;
    private double length3;
    private double length4;
    private double perimeter;
    //the use of super class
    public Quadrilateral(double l1,double l2,double l3, double l4){
      super(4);//quadrilateral has 4 sides
      length1=l1;
      length2=l2;
      length3=l3;
      length4=l4;
      calculatePerimeter();
    }
    //This method calculates the perimeter of the triangle
    private void calculatePerimeter(){
      perimeter = length1 + length2 + length3 + length4;
    }
    //Returns the perimeter attribute
    public double getPerimeter(){
      return perimeter;
    }
    //toString with addition of perimeter
    public String toString(){
      return super.toString() + " and the perimeter is " + getPerimeter() + " units";
    }
  }