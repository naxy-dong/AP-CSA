class Main {
    public static void main(String[] args) {
      int[] ar = {10,20,30,40,50};
      traverseArray(ar,0);
      System.out.println("");
      traverseArrayReverse(ar, 0);
    }
    public static void traverseArray(int[] data,int index)
    {
      System.out.print(data[index]+" ");
      if (index < data.length-1) {
        traverseArray(data, index+1);
      }
    }
    /*public static void traverseArrayReverse(int[] data,int index) {
      System.out.print(data[index]+" ");
      if (index > 0) {
        traverseArrayReverse(data, index-1);
      }
    }*/
    public static void traverseArrayReverse(int[] data,int index) {
      if (index < data.length-1) {
        traverseArrayReverse(data, index+1);
      }
      System.out.print(data[index]+" ");
    }
  }