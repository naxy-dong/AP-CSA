public class Rectangle extends Quadrilateral{
    private double area;
  
    public Rectangle(double l1, double l2){
      super(l1,l1,l2,l2);
      calculateArea(l1, l2);
    }
  
    private void calculateArea(double side1, double side2){
      area = side1*side2;
    }
  
    public double getArea(){
      return area;
    }
  
    public String toString(){
      return super.toString() + " with an area of " + area + " unit^2";
    }
  }