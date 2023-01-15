//https://mathworld.wolfram.com/CollatzProblem.html

class Main {
    public static void main(String[] args) {
      int length = 1;
      int number = 5;
      System.out.println(number);
      while(number != 1){
        if(number % 2 == 0){
          number = number/2;
        }
        else{
          number = 3* number +1;
        }
        System.out.println(number);
        length++;
      }
      System.out.println(length);
    }
  }