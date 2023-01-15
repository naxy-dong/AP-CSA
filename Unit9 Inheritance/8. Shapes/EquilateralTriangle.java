public class EquilateralTriangle extends Triangle{
    private double area;
  
    public EquilateralTriangle(double side){
      super(side, side, side);
      calculateArea(side);
    }
  
    private void calculateArea(double side){
      area = Math.sqrt(3)*Math.pow(side, 2)/4;
    }
  
    public double getArea(){
      return area;
    }
  
    public String toString(){
      return super.toString() + " with an area of " + getArea() + " unit^2";
    }
  }