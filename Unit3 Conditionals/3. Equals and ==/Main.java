class Main {
    public static void main(String[] args) {
      Point p1 = new Point(0.0,0.0);
      Point p2 = new Point(0.0,3.0);
      Point p3 = new Point(3.0,4.0);
  
      Point copyp1 = new Point(0.0,0.0);
      Point copyp2 = new Point(0.0,3.0);
      Point copyp3 = new Point(3.0,4.0);
  
      Triangle t1 = new Triangle(p1,p2,p3);
      
      Triangle copyt1 = new Triangle(copyp1,copyp2,copyp3);
  
      System.out.println("t1 = "+t1);
      
      System.out.println("p1.equals(p2) is "+p1.equals(p2));
      System.out.println("p1 == p2 is "+(p1 == p2));
  
      System.out.println("t1.equals(t2) is " +  t1.equals(copyt1));
  
      System.out.println("t1 == t2 is " + (copyt1 == t1));
    }
  }