class Main {
    public static void main(String[] args) {
      int[] testArray = {0,82,82,0,0,14,8,8,42,42,42,80,2,4,6,6,4};
  
      System.out.println("test array: "+ArrayAlgorithms.print(testArray));
      System.out.println("\n******findMaxandMin********");
      System.out.println("findMax:"+ArrayAlgorithms.findMax(testArray));
      System.out.println("findMin:"+ArrayAlgorithms.findMin(testArray));
  
      System.out.println("\n******searchItem********");
      System.out.println("searchItem:"+ArrayAlgorithms.searchItem(testArray, 12));
      System.out.println("searchItem:"+ArrayAlgorithms.searchItem(testArray, 0));
  
      System.out.println("\n******computation********");
      System.out.println("computeSum:"+ArrayAlgorithms.computeSum(testArray));
      System.out.println("computeAverage:"+ArrayAlgorithms.computeAverage(testArray));
      System.out.println("computeMode:"+ArrayAlgorithms.computeMode(testArray));
  
      System.out.println("\n*******Properties******");
      System.out.println("ifAllEven:"+ArrayAlgorithms.ifAllEven(testArray));
      System.out.println("ifContainSquareNum:"+ArrayAlgorithms.ifContainSquareNum(testArray));
      System.out.println("DuplicateExist:"+ArrayAlgorithms.DuplicateExist(testArray));
      System.out.println("consecutivePair:"+ArrayAlgorithms.consecutivePair(testArray));
  
      System.out.println("\n*******Manipulating******");
      System.out.println("rotateElement right:"+ArrayAlgorithms.rotateElement(testArray,true));
      System.out.println("rotateElement right:"+ArrayAlgorithms.rotateElement(testArray,true));
      System.out.println("reverseArray:"+ArrayAlgorithms.reverseArray(testArray));
      System.out.println("rotateElement left:"+ArrayAlgorithms.rotateElement(testArray,false));
      
    }
  }