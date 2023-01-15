class Main {
    public static void main(String[] args) {
      System.out.println("\n****Showcase of Shape.java****");
      Shape shape = new Shape(8);
      System.out.println("Shape toString method: " + shape + "\n");
  
      System.out.println("\n****Showcase of Quadrilateral.java****");
      Quadrilateral shape1 = new Quadrilateral(1, 4, 3, 2);
      System.out.println("Quadrilateral getPerimeter method: " + shape1.getPerimeter());
      System.out.println("Quadrilateral toString method: " + shape1 + "\n");
      
      System.out.println("\n****Showcase of Triangle.java****");
      Triangle shape2 = new Triangle(6,8,13);
      System.out.println("Triangle getPerimeter method: " + shape2.getPerimeter());
      System.out.println("Triangle toString method: " + shape2 + "\n");
  
      System.out.println("\n****Showcase of EquilateralTriangle.java****");
      EquilateralTriangle shape3 = new EquilateralTriangle(5);
      System.out.println("EquilateralTriangle getPerimeter method: " + shape3.getPerimeter());
      System.out.println("EquilateralTriangle getArea method: " + shape3.getArea());
      System.out.println("EquilateralTriangle toString method: " + shape3 + "\n");
  
      System.out.println("\n****Showcase of Rectangle.java****");
      Rectangle shape4 = new Rectangle(10,20);
      System.out.println("Rectangle getPerimeter method: " + shape4.getPerimeter());
      System.out.println("Rectangle getArea method: " + shape4.getArea());
      System.out.println("Rectangle toString method: " + shape4 + "\n");
  
      System.out.println("\n****Showcase of Square.java****");
      Square shape5 = new Square(20);
      System.out.println("Square getPerimeter method: " + shape5.getPerimeter());
      System.out.println("Square getArea method: " + shape5.getArea());
      System.out.println("Square toString method: " + shape5 + "\n");
  
      System.out.println("\n****Showcase of inheritance hierachies(square is rectangle)****");
      Rectangle shape6 = new Square(20);
      System.out.println("Rectangle getPerimeter method: " + shape6.getPerimeter());
      System.out.println("Rectangle getArea method: " + shape6.getArea());
      System.out.println("Rectangle toString method: " + shape6 + "\n");
    }
  }