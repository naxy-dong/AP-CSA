import java.util.ArrayList;
import java.util.Collections;
class Main {
  public static void main(String[] args) {
    //Make two lists
    ArrayList<Integer> list1 = randomIntegerList(10,100);
    ArrayList<Integer> list2 = randomIntegerList(10,100);
    //sort them - (yes... we have a sort we can use from java.util.Collections)
    Collections.sort(list1);
    Collections.sort(list2);
    System.out.println("Two lists to be merged iteratively: ");
    System.out.println(list1);
    System.out.println(list2);
    System.out.println(Math.min(list1.get(0),list2.get(0)));
    ArrayList<Integer> mergedList = mergeSortedLists(list1, list2);
    System.out.println("Merged Lists: ");
    System.out.println(mergedList);
    list1 = randomIntegerList(10,100);
    list2 = randomIntegerList(10,100);
    //sort them - (yes... we have a sort we can use from java.util.Collections)
    Collections.sort(list1);
    Collections.sort(list2);
    System.out.println("Two lists to be merged recursively: ");
    System.out.println(list1);
    System.out.println(list2);
    mergedList = recursiveMergeSortedLists(list1, list2);
    System.out.println("Merged Lists: ");
    System.out.println(mergedList);
   }

   
   /**
    mergeSortedLists
    Precondition: both lists are sorted and non-empty
    returns a sorted list created from both lists.
    */
    public static ArrayList<Integer> mergeSortedLists(ArrayList<Integer> list1, ArrayList<Integer> list2)
    {
      ArrayList retList = new ArrayList<Integer>();
      //get the first element of each list and insert the minimum.  
      //Continue unitl all elements from both lists are in the return list
      while(list1.size()!=0 && list2.size() != 0){
        if(list1.get(0) >= list2.get(0))
          retList.add(list2.remove(0));
        else 
          retList.add(list1.remove(0));
      }
      while(list1.size()!=0){
          retList.add(list1.remove(0));
      }
      while(list2.size()!=0){
          retList.add(list2.remove(0));
      }
      return retList;
    }

/**
    recursvieMergeSortedLists
    Precondition: both lists are sorted and non-empty
    returns a sorted list created from both lists.
    */
    public static ArrayList<Integer> recursiveMergeSortedLists(ArrayList<Integer> list1, ArrayList<Integer> list2)
    {
      ArrayList retList = new ArrayList<Integer>();
      //get the first element of each list and insert the minimum.  
      //Continue unitl all elements from both lists are in the return list
      if(list1.size() == 0) return list2;
      if(list2.size() == 0) return list1;

      if(list1.get(0) < list2.get(0))
        retList.add(list1.remove(0));
      else
        retList.add(list2.remove(0));

      retList.addAll(recursiveMergeSortedLists(list1,list2));

      return retList;
    }
  /**
   * Creates an ArrayList of type Integer of length arrayLength with the range 0.0..maxVal
   * @param listLength the number of elements of the array
   * @param maxVal each element of the ArrayList has a value in the range 0..maxVal
   * @return an ArrayList of type Integer of length arrayLength
   */
  public static ArrayList<Integer> randomIntegerList(int listLength, Integer maxVal)
  {
     ArrayList<Integer> retAL = new ArrayList<>();
     for (int i = 0; i < listLength; i++)
     {
        Integer tempVal = (int) (Math.random() *(maxVal+1));
        retAL.add(tempVal);
     }
     return retAL;
  }
}