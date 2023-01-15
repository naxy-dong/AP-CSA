class Main {
    public static void main(String[] args) {
      Time t1 = new Time(23,59,59);
      t1.printTime();
      t1.increment();
      t1.printTime();
  
      Time t2 = new Time();
      t2.printTime();
      t2.reset(12, 32, 59);
      t2.printTime();
      t2.increment();
      t2.printTime();
  
      t2.reset(0, 0, 0);
      System.out.println(t2.checkEqual(t1));
      t2.increment();
      System.out.println(t2.checkEqual(t1));
  
      System.out.println(t1.checkEarly(t2));
      System.out.println(t2.checkEarly(t1));
    }
  }