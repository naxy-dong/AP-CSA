public class ArrayAlgorithms {
    // find highest num
    public static int findMax(int[] array) {
      int highest = array[0];
      for (int num : array) {
        if (num > highest) {
          highest = num;
        }
      }
      return highest;
    }
    // find lowest num
    public static int findMin(int[] array) {
      int lowest = array[0];
      for (int num : array) {
        if (num < lowest) {
          lowest = num;
        }
      }
      return lowest;
    }
   // computes the sum
    public static int computeSum(int[] array) {
      int sum = 0;
      for (int num : array) {
        sum += num;
      }
      return sum;
    }
    // computes the average
    public static double computeAverage(int[] array) {
      return (double) (computeSum(array) / array.length);
    }
    // computes the mode
    public static String computeMode(int[] array) {
      int maxValue = 0;
      int maxCount = 0;
      int[] modeArray = new int[0];
      for (int i = 0; i < array.length; ++i) {
        int count = 0;
        for (int j = 0; j < array.length; ++j) {
          if (array[j] == array[i]){
            ++count;
          }
        }
  
        if (count > maxCount) {
          maxCount = count;
        }
      }
      for (int i = 0; i < array.length; ++i) {
        int count = 0;
        for (int j = 0; j < array.length; ++j) {
          if (array[j] == array[i]){
            ++count;
          }
        }
        if (count == maxCount) {
          if(!itemExist(modeArray, array[i])){
            modeArray = appendArray(array[i],modeArray);
          }
        }
      }
      return print(modeArray);
    }
    /* helper function for mode */
    private static int[] appendArray(int val, int[] array){
      int[] newArray = new int[array.length+1];
      for(int i = 0; i<array.length; i++){
        newArray[i] = array[i];
      }
      newArray[newArray.length-1] = val; 
      return newArray;
    }
    // checks if it's all even
    public static boolean ifAllEven(int[] array){
      for(int i = 0; i < array.length; i++){
        if(array[i]%2!=0){
          return false;
        }
      }
      return true;
    }
    // checks if it contains the sum
    public static boolean ifContainSquareNum(int[] array){
      double number;
      for(int i = 0; i < array.length; i++){
        number = Math.sqrt(array[i]);
        if(number - Math.floor(number) == 0){
          return true;
        }
      }
      return false;
    }
  
    // find specific item
    public static String searchItem(int[] array, int target) {
      for (int i = 0; i < array.length; i++) {
        if (array[i] == target) {
          return target + " is at index " + i;
        }
      }
      return target + " is not in the list";
    }
    // find specific item
    public static boolean itemExist(int[] array, int target) {
      for (int i = 0; i < array.length; i++) {
        if (array[i] == target) {
          return true;
        }
      }
      return false;
    }
    //check if there is duplicate
    public static boolean DuplicateExist(int[] array) {
      for (int i = 0; i < array.length; ++i) {
        int count = 0;
        for (int j = 0; j < array.length; ++j) {
          if (array[j] == array[i]){
            ++count;
          }
        }
        if (count > 1) {
          return true;
        }
      }
      return false;
    }
  
    public static String consecutivePair(int[] arr){
        int[] temp=new int[arr.length];
        int index=0;
        for(int i=0;i<arr.length-1;i++){
           if(Math.abs(arr[i]-arr[i+1])==1){
              temp[index]=i;
              index++;
           }
        }
        if(index==arr.length)
           return print(temp);
        int[] pair=new int[index];
        for(int i=0;i<index;i++){
           pair[i]=temp[i];
        }
        return print(pair);
     }
  
    //rotate the array right or left 
    public static String rotateElement(int[] array, boolean right){
      if(right){
        for(int i = 0; i< array.length; i++){
          swapElement(0,i, array);
        }
      }
      else{
        for(int i = array.length-2; i >= 0; i--){
          swapElement(array.length-1,i, array);
        }
      }
  
      return print(array);
    }
    //reverse the array
    public static String reverseArray(int[] array){
      for(int i = 0; i < array.length/2; i++){
        swapElement(array.length-1-i,i, array);
      }
  
      return print(array);
    }
    private static int[] swapElement(int i, int j, int[] array){
      array[i] ^= array[j];
      array[j] ^= array[i];
      array[i] ^= array[j];
      return array;
    }
  
    public static String print(int[] array) {
      if(array.length == 0)
        return "empty";
      String arrayOutput = "{" + array[0];
      for(int i = 1; i<array.length; i++){
        arrayOutput += ","+array[i];
      }
      arrayOutput += "}";
      return arrayOutput;
    }
  }
  
  
  
  
    // private static int[] deleteItem(int index, int[] array){
    //   int[] newArray = new int[array.length-1];
    //   boolean indexFound = false;
    //   for(int i = 0; i<newArray.length; i++){
    //     if(i == index){
    //       indexFound = true;
    //     }
    //     else if(indexFound){
    //       newArray[i] = array[i+1];
    //     }
    //     else{
    //       newArray[i] = array[i];
    //     }
    //   }
    //   return newArray;
    // }
  
    // private static int[] eliminateDuplicates(int[] array){
    //   for(int i = 0; i<array.length; i++){
    //     for(int j = i; j<array.length; j++){
    //       if(i != j && array[i] == array[j]){
    //         array = deleteItem(j--, array);
    //         System.out.println(print(array));
    //       }
    //     }
    //   }
    //   return array;
    // }