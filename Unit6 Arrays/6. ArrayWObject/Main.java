class Main {
    public static void main(String[] args) {
      Triangle[] triAr = new Triangle[100];
      for (int i = 0; i < triAr.length; i++) {
        // Make three random points (here we have 0 to 5 for both x and y)
        Point p1 = new Point((int) (Math.random() * 6), (int) (Math.random() * 6));
        Point p2 = new Point((int) (Math.random() * 6), (int) (Math.random() * 6));
        Point p3 = new Point((int) (Math.random() * 6), (int) (Math.random() * 6));
  
        // Construct a new Triangle from the points and put them into the array.
        triAr[i] = new Triangle(p1, p2, p3);
      }
      // You don't have to print all of them... Just
      for (Triangle tri : triAr) {
        System.out.println(tri);
      }
      // Count the right triangles
      int count = 0;
      for (Triangle tri : triAr) {
        if (tri.isRight()) {
          count++;
        }
      }
      System.out.println(count);
      Fraction f = new Fraction(count,triAr.length);
      System.out.println(f);
      // Find the average perimeter.
      double sum = 0;
      for (Triangle tri : triAr) {
        sum += tri.perimeter();
      }
      double average = sum / triAr.length;
      System.out.println(average);
      // Do something similar with Fraction?
      int greaterThanAverageCount = 0;
      for (Triangle tri : triAr) {
        if (tri.perimeter() > average) {
          greaterThanAverageCount++;
        }
      }
      System.out.println(greaterThanAverageCount);
      Fraction f1 = new Fraction(greaterThanAverageCount,triAr.length);
      System.out.println(f1);
  
  
  
  
      Fraction[] frAr = new Fraction[100];
      for (int i = 0; i < frAr.length; i++) {
        frAr[i] = new Fraction((int)Math.floor(Math.random()*10), (int)Math.floor(Math.random()*10));
        System.out.println(frAr[i]);
      }
      int greater1count = 0;
      for(int j =0; j< frAr.length; j++){
        if(frAr[j].getValue() > 1){
          greater1count++;
        }
      }
      System.out.println(greater1count);
    }
  }
  