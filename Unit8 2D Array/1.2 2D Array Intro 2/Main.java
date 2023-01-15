import java.util.Arrays;
class Main {
  public static void main(String[] args)
  {
    //These represent scores of Test0, Test1, Test2 and Test3
    int[] student0 = {100, 85, 95, 96};
    int[] student1 = {99, 100, 100, 95};
    int[] student2 = {92, 100, 99, 100};
    int[] student3 = {100, 95, 97, 99};
    int[] student4 = {100, 100, 100, 70};
    int[] student5 = {100, 98, 99, 98};
    int[] student6 = {100, 95, 100, 93};
    
    //Declare a 2D array grades and use initializer lists to
    // fill its rows with student0, student1, ..., student6
    int[][] gradeArray = {student0, student1, student2, student3, student4, student5, student6};

    System.out.println(getRowIndex(97, gradeArray));
    System.out.println(getColumnIndex(95, gradeArray));
    System.out.println(Arrays.toString(getColumn(2, gradeArray)));
    System.out.println(Arrays.toString(getRow(4, gradeArray)));
  }       
  //Write a static method getRowIndex(int value)
  public static int getRowIndex(int value, int[][] gradeArray){
    for(int i = 0; i < gradeArray.length; i++){
      for(int j = 0; j < gradeArray[0].length; j++){
        if(value == gradeArray[i][j]){
          return i;
        }
      }
    }
    return -1;
  }
  //Write a static method getColumnIndex(int value)
  public static int getColumnIndex(int value, int[][] gradeArray){
    for(int i = 0; i < gradeArray.length; i++){
      for(int j = 0; j < gradeArray[0].length; j++){
        if(value == gradeArray[i][j]){
          return j;
        }
      }
    }
    return -1;
  }
  //Write a static method getRow(int rowIndex) that returns the array at rowIndex
  public static int[] getRow(int rowIndex, int[][] gradeArray){
    int[] rowArr = new int[gradeArray[0].length];
    for(int j = 0; j < gradeArray[rowIndex].length; j++){
      rowArr[j] = gradeArray[rowIndex][j];
    }
    return rowArr;
  }
  //Write a static method getColumn(int index) that returns an 
  //array that represents the values at columnIndex  
  public static int[] getColumn(int columnIndex, int[][] gradeArray){
    int[] columnArr = new int[gradeArray.length];
    for(int j = 0; j < gradeArray.length; j++){
      columnArr[j] = gradeArray[j][columnIndex];
    }
    return columnArr;
  }
}