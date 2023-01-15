class Main {
    public static void main(String[] args) {
      int arr[] = {0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,24,36,38,40};
      System.out.println("recBinarySearch(arr,0,arr.length,24) = "+recBinarySearch(arr,0,arr.length,1));
    }
    public static int recBinarySearch(int intArray[], int lowPosition, int highPosition, int target)
    {
      int midPosition;
  
      if (lowPosition > highPosition) {
        //what do we do if lowPosition is greater than highPosition?
        return -1;
      } else {
        midPosition = (lowPosition + highPosition)/2;
        if (intArray[midPosition] < target){
          return recBinarySearch(intArray, midPosition, highPosition, target);
        }
          //What do we do if the middle value is less than target?
        if (intArray[midPosition] > target){
          return recBinarySearch(intArray, lowPosition, midPosition, target);
        }
          //What do we do if the middle value is greater than target
        if(intArray[midPosition] == target){
          return midPosition;
        }
        //What do we do if the middle value is equal to target    
      }
      return midPosition;
    }
  }
  