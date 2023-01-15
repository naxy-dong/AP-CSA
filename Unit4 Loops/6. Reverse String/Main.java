class Main {
    public static void main(String[] args) {
      String str= "ABCDE";
      String result = "";
      for(int i = str.length()-1; i>=0; i--){
        result += str.substring(i, i+1);
      }
      System.out.println(result);
    }
  }