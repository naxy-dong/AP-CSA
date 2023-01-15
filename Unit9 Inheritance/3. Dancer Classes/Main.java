class Main {
    public static void main(String[] args) {
      Performer p = new Performer("Rex","The Great Rex");
      Dancer d = new Dancer("Mr. F","The Dancing Mr. F");
      BalletDancer b = new BalletDancer("Ms. B","The Ballet Dancing MS. B");
      System.out.println("Performer's perform():");
      p.perform();
      System.out.println("Dancer's perform():");
      d.perform();
      System.out.println("Ballet Dancer's perform():");
      b.perform();
    }
  }