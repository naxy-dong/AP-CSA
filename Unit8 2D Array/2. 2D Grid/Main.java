class Main {
    public static void main(String[] args) {
      String[][] grid = {{"A","B","C","D","E"},
                        {"F","G","H","I","J"},
                        {"K","L","M","N","O"},
                        {"P","Q","R","S","T"}};
      System.out.println("Row major order");
      for(String[] row : grid){
        for(String letter : row){
          System.out.print(letter);
        }
        System.out.println("");
      }
      System.out.println("Column major order");  
      for(int j = 0;  j< grid[0].length ; j++){
        for(int i = 0; i < grid.length ; i++){
          System.out.print(grid[i][j]);
        }
        System.out.println("");
      }
    }
  }