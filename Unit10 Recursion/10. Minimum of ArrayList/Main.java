import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
     //Make a list of size 'size' with random values from 0 to size -1
    int size = 10;
    ArrayList<Integer> intList = new ArrayList<>();
    int sign = 1;
    for (int i = 0; i < size; i++)
    { 
      //sign *= -1;
      intList.add((int)(Math.random()*(10*size))*(sign));
    }
    System.out.println("intList = " + intList);
    System.out.println("recursiveMin(intList) = "+recursiveMin(intList));
  }
  public static int recursiveMin(ArrayList<Integer> al)
  {
    int arLength = al.size()-1;
    if(arLength == 1)
      return al.get(0);
    else{
    return Math.min(al.remove(arLength), recursiveMin(al));
    }
  }
}