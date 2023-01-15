import java.util.ArrayList;

class SortUtil{
  private static int swaps;

  public static int getSwaps(){
    return swaps;
  }
  public static ArrayList<Integer> copyIntegerList(ArrayList<Integer> al)
  {
    ArrayList<Integer> out = new ArrayList<Integer>();
    for (int i=0; i<al.size(); i++)
    {
      out.add(al.get(i));
    }
    return out;
  }

  public static boolean isSorted(ArrayList<Integer> al)
  {
    boolean islarger=true;
    for (int i = 0; i < al.size()-1; i++)
    {
      if (al.get(i)>al.get(i+1))
      {
        islarger = false;
        break;
      }
    }
    return islarger;
  }

  public static ArrayList<Integer> randomIntegerList(int length, Integer maxValue)
  {
    ArrayList<Integer> hi = new ArrayList<Integer>();
    for (int i=0;i<length;i++)
    {
      Integer num = (int)(Math.random()*(maxValue+1));
      hi.add(num);
    }
    return hi;
  }

  public static boolean sameSum(ArrayList<Integer> a, ArrayList<Integer> b)
  {
    int sum1 = 0;
    int sum2 = 0;
    for (int i = 0; i<a.size(); i++)
    {
      sum1 += a.get(i);
    }
    for (int i = 0; i<b.size(); i++)
    {
      sum2 += b.get(i);
    }
    if (sum1==sum2)
      return true;
    return false;
  }

  public static void swap(ArrayList<Integer> al, int i, int j)
  {
    swaps++;
    int num = al.get(i);
    al.set(i,al.get(j));
    al.set(j,num);
  }

  public static void bubbleSort(ArrayList<Integer> al)
  {
    swaps = 0;
    while (!isSorted(al))
    {
      for (int i=0; i<al.size()-1;i++)
      {
        if (al.get(i)>al.get(i+1))
        {
          swap(al,i,i+1);
        }
      }
    }
  }

  public static void selectionSort(ArrayList<Integer> al)
  {
    swaps = 0;
    for (int i=0; i<al.size();i++)
    {
      swap(al,i, getMinIndex(al, i));
    }
  }

  public static int getMinIndex(ArrayList<Integer> al, int startIndex)
  {
    int minIndex = startIndex;
    for(int i = startIndex; i < al.size(); i++){
      if(al.get(i) < al.get(minIndex)){
        minIndex = i;
      }
    }
    return minIndex;
  }

  public static void insertionSort(ArrayList<Integer> al){
    swaps = 0;
    for(int i = 1; i<al.size(); i++){
      for(int j = i; j >= 1; j--){
        if(al.get(j).compareTo(al.get(j-1)) < 0){
          swap(al, j, j-1);
        }
      }
    }
  }
}