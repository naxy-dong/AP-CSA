import java.util.ArrayList;

class Main {
  public static void main(String[] args) 
  {
    double startTime;
    double endTime;
    SortUtil su = new SortUtil();
    ArrayList<Integer> nums = su.randomIntegerList(100,100);
    ArrayList<Integer> nums2 = su.copyIntegerList(nums);
    ArrayList<Integer> nums3 = su.copyIntegerList(nums);
    // System.out.println("nums= " + nums);
    // System.out.println("nums2= " + nums2);
    // System.out.println("nums3= " + nums3);

    startTime= System.currentTimeMillis();
    su.bubbleSort(nums);
    endTime = System.currentTimeMillis();
    System.out.println("nums after bubble sort= " + nums + " \nIt took " + (endTime- startTime) + " milliseconds and it took " + su.getSwaps() + " swaps");

    startTime= System.currentTimeMillis();
    su.selectionSort(nums2);
    endTime = System.currentTimeMillis();
    System.out.println("nums2 after selection sort= " + nums2 + "\nIt took " + (endTime- startTime) + " milliseconds and it took " + su.getSwaps() + " swaps");

    startTime= System.currentTimeMillis();
    su.insertionSort(nums3);
    endTime = System.currentTimeMillis();
    System.out.println("nums3 after insertion sort= " + nums3 + "\nIt took " + (endTime- startTime) + " milliseconds and it took " + su.getSwaps() + " swaps");
  }
}