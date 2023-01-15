public class ArrayManipulator
{
  private int [] list;

  //Constructor: create a reference to a new array of the
  //specified length, with each element initialized to 0
  public ArrayManipulator(int numElements)
  {
      list = new int[numElements];
      for(int i = 0; i < list.length; i++){
        list[i]= (int)(Math.random()*10+1);
      }
    //your code here
  }
  //returns the index of the middle index in list
  //if the length is even, getMiddleIndex() should return //the index of the earlier middle element
  public int getMiddleIndex()
  {
    //Your code here
    return (int)(list.length/2);
  }

  //returns the average of the first middle and last 
  //elements of the list 
  //The middle element should be the element returned by
  //getMiddleIndex()
  //Precondition: list.length >= 3 
  public double getAvg()
  {
    //your code here
    return (double)((list[0]+list[list.length-1]+list[getMiddleIndex()])/3);
  }
}