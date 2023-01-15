class Main {
    public static void main(String[] args) {
      String[] a = { "four", "score", "and", "seven", "years", "ago" };
      String[] b = {"to", "be", "or", "not", "to", "be", "hamlet"};
      print(swapPairs(a));
      print(swapPairs(b));
    }
  
    public static String[] swapPairs(String[] array){
      for(int i = 0; i < array.length/2; i++){
        String temp = array[2*i];
        array[2*i]=array[2*i+1];
        array[2*i+1]=temp;
      }
      return array;
    }
  
    public static void print(String[] array){
      for(int i = 0; i < array.length; i++){
        System.out.print(array[i]+",");
      }
      System.out.print("\n");
    }
  }