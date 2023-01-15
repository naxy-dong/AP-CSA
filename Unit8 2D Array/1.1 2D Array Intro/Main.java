import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    int[][] array2d = new int[5][7];

    for(int i=0; i<array2d.length; i++){
      for(int j =0; j < array2d[0].length;j++){
        array2d[i][j] = (int) (Math.random()*10);
      }
    }
    System.out.println(Arrays.deepToString(array2d));

    int sum;
    int[] rowSum = new int[5];
    for(int i=0; i<array2d.length; i++){
      sum = 0;
      for(int j =0; j < array2d[0].length;j++){
        sum += array2d[i][j];
      }
      rowSum[i] = sum;
    }
    System.out.println(Arrays.toString(rowSum));

    int[] columnSum = new int[7];
    for(int i=0; i<array2d[0].length; i++){
      sum = 0;
      for(int j =0; j <array2d.length;j++){
        sum += array2d[j][i];
      }
      columnSum[i] = sum;
    }
    System.out.println(Arrays.toString(columnSum));
  }
}