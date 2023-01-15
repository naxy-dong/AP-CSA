class Main {
    public static void main(String[] args) {
      int value =0;
      int numRounds = 4;
      for(int i = 0; i<numRounds; i++){
        int randomNum = -1;
        while(randomNum != value){
          randomNum = (int)(Math.random() * 10);
          System.outz.print(randomNum);
        }
        System.out.println();
      }
    }
  }