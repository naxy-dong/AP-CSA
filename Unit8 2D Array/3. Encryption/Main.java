class Main {
    public static void main(String[] args) {
      String str = "java is fun!!";
      int row = (int)Math.floor(Math.sqrt(str.length()));
      int col = row+1;
      String[][] matrix= new String[row][col];
      System.out.println("row:" + row + "\ncol:" + col);
      //fills in the matrix
      for(int i = 0; i < row; i++){
        for(int j = 0; j < col; j++){
          if(i*col+j < str.length()){
            matrix[i][j] = str.substring(i*col+j, i*col+j+1);
          }
          else{
            matrix[i][j] = "";
          }
        }
      }
      printRowMajor(matrix);
      printColumnMajor(matrix);
    }
  
  
    public static void printRowMajor(String[][] grid){
      System.out.println("Row major order");
      for(String[] row : grid){
        for(String letter : row){
          System.out.print(letter);
        }
        System.out.println("");
      }
    }
    public static void printColumnMajor(String[][] grid){
      System.out.print("Encrypted: ");  
      for(int j = 0;  j< grid[0].length ; j++){
        for(int i = 0; i < grid.length ; i++){
          System.out.print(grid[i][j]);
        }
      }
    }
  }