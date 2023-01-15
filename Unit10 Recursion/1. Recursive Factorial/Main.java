class Main {
    public static void main(String[] args) {
      System.out.println("factorial(3) = "+factorial(3));
      System.out.println("factorial(10) = "+factorial(10));
      System.out.println("factorial(100) = "+factorial(100));
    }
    public static int factorial(int n)
    {
      if(n!=1){
        return n*factorial(n-1);
      }
      else{
            return n;
      }
  
    }
  }