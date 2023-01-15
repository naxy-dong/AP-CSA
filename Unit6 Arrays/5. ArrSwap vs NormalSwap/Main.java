class Main {
    public static void main(String[] args) {
      int a = 10, b = 20;
      System.out.println("before swap(10,20) a = "+a+" b = "+b);
      swap(a,b);
      System.out.println("after swap(10,20) a = "+a+" b = "+b);
      int[] intAr = {10,20};
      System.out.println("before swap(0,1,intAr)  intAr = {"+print(intAr)+"}");
      swap(0,1,intAr);
      System.out.println("after swap(0,1,intAr)  intAr = {"+print(intAr)+"}");
      print(intAr);
      swap(intAr[0], intAr[1]);
      System.out.println("after swap(intAr[0], intAr[1])  intAr = {"+print(intAr)+"}");
      print(intAr);
    }
    public static void swap(int a, int b)
    {
      int temp = a;
      a = b;
      b= temp;
    }
    public static void swap(int i, int j, int[] intAr)
    {
      int temp = intAr[i];
      intAr[i] = intAr[j];
      intAr[j]= temp;
    }
    public static String print(int[] intAr)
    {
      String retVal = "";
      for (int value:intAr)
      {
        retVal += value + " ";
      }
      return retVal;
    }
  }