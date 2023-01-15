import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    int[] arr = {9,7,5,8,3,2,1,10,6,4};
    insertionSort(arr);
    System.out.println(Arrays.toString(arr));
  }
  public static void insertionSort(int array[]) {
    for (int j = 1; j < array.length; j++) {
        int current = array[j];
        int i = j-1;
        while ((i > -1) && (array[i] > current)) {
            array[i+1] = array[i];
            i--;
        }
        array[i+1] = current;
    }
  }
}