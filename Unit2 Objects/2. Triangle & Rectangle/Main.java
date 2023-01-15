class Main {
    public static void main(String[] args) {
      Rectangle r1 = new Rectangle(5,10);
       System.out.println("area of r1 ="+r1.area());
       //Construct two rectangles r2 and r3 with different dimensions.
       Rectangle r2 = new Rectangle(4,6);
       //r3 should be a square
       Rectangle r3 = new Rectangle(5);
       //use area() to print the areas of r2 and r3
       System.out.println("area of r2 ="+r2.area());
       System.out.println("area of r3 ="+r3.area());
      //use perimeter() to print the perimeters of r2 and r3
       System.out.println("perimeter of r2 ="+r2.perimeter());
       System.out.println("perimeter of r3 ="+r3.perimeter());
      //use your “getters” to print the length and width of r2 and r3
       System.out.println("length ="+r2.length() + "width =" + r2.width());
       System.out.println("width ="+r3.width() + "width =" + r3.width());
      //use your “setters” to change the dimensions of r2
        r2.setLength(2);
        r2.setWidth(3);
      //check that the dimensions are changed\
      System.out.println("length ="+r2.length() + "width =" + r2.width());


      /************** Triangle ************ */

      Triangle t1 = new Triangle(1,1,1);
      System.out.println("Perimeter of t1:" + t1.perimeter());
      System.out.println("Area of t1:" + t1.area());
    }
  }