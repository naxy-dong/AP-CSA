class Main {
    public static void main(String[] args) {
      int Elements = 4;
      System.out.println("Please enter " + Elements + " numbers.");
      Average avg = new Average(Elements);
      System.out.println("Your average is " + avg.calcAverage());
      System.out.println("There are " + avg.calcAboveCount() + " numbers that is above the average");
    }
  }