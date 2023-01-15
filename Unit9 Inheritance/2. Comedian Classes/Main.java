class Main {
    public static void main(String[] args) {
      Performer p = new Performer("Mr. F","The Great Mr. F");
      Comedian c = new Comedian("Ms. C","The Great Ms. C");
      System.out.println("Performer's perform():");
      p.perform();
      System.out.println("Comedian's perform():");
      c.perform();
    }
  }