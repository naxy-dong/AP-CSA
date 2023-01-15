class Main {
    public static void main(String[] args) {
      System.out.println("recursiveGCD(12,18) = "+recursiveGCD(12,18));
      System.out.println("recursiveGCD(7,13) = "+recursiveGCD(7,13));
      System.out.println("recursiveGCD(5040,1001) = "+recursiveGCD(5040,1001));
    }
    public static int recursiveGCD(int x, int y)
    {
     if(x==y){
       return x;
     }
     else if(x>y){
       return recursiveGCD(x-y, y);
     }
     else{
       return recursiveGCD(x, y-x);
     }
    }
  }