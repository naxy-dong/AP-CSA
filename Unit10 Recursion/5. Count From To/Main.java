class Main {
    public static void main(String[] args) {
      System.out.println("countFromTo(0,5): ");
      countFromTo(0,5);
      System.out.println();
      System.out.println("countFromTo(2,11): ");
      countFromTo(2,11);
      System.out.println();
    }
    public static void countFromTo(int from, int to)
    {
     if(to >= from){
       System.out.println(from);
       countFromTo(from+1, to);
     }
    }  
  }