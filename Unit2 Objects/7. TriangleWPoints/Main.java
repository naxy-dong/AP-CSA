class Main {
  public static void main(String[] args) {
    Point p1 = new Point(0.0, 3.0);
    Point p2 = new Point(3.0, 0.0);
    Point p3 = new Point(-1.0,-1.0);
    Triangle t1 = new Triangle(p1,p2,p3);
    System.out.println("perimeter = " + t1.perimeter());
    t1.setPoint3(0.0,0.0);
    System.out.println("New point 3 = " + t1.getPoint3());
    System.out.println("perimeter = " + t1.perimeter());
  }
}