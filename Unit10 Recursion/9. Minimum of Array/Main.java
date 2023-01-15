class Main {
    public static void main(String args[])
      {
          int intAr[] = {8, 42, 77, 66, -50, 10, 32, 1};
          System.out.println("findminAr(intAr,n) = "+findMinAr(intAr, intAr.length));
      }
      public static int findMinAr(int[] intAr, int n)
      {
        if(n==1)
          return intAr[0];
        return Math.min(intAr[n-1],findMinAr(intAr, n-1));
      }
  }