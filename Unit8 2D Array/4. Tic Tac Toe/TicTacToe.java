/**
 * A class for managing all the rules of TicTacToe and keeping track of the
 * current player, who, the number of 'moves,' who is the winner and clearing
 * the board when it's time to switch players.
 */
public class TicTacToe {
    /**
     * a 3x3 board for tic tac toe Note: it's a board of type char Something new for
     * us.
     */
    private Board board;
  
    /**
     * curPlayer can be the character "X" or "O" starts as an "X" and gets swapped
     */
    private String  player = "X";
  
    /**
     * This Constructor is more for testing.
     * 
     * @param b The Board object keeps track of the "X" and "O" placement and the
     *          dimensions of the board
     */
    public TicTacToe(Board b) {
      board = b;
    }
  
    /**
     * Default Constructor sets all spots to "-";
     */
    public TicTacToe() {
      board = new Board(3,3);
      clearBoard();
    }
  
    /**
     * Resets the board to start over when it's time start a new game
     */
    public void clearBoard() {
      int height = board.getHeight();
      int width = board.getWidth();
      for(int row = 0; row < height; row++){
        for(int col = 0; col < width; col++){
          board.set(row, col, "-");
        }
      }
    }
  
    /**
     * Check if each item in the rows, columns and diagonals to to see if they equal
     * the current player
     */
    public String winner() 
    {
      //rows
      for(int row = 0; row < board.getHeight(); row++){
        if(board.get(row, 0).equals(board.get(row, 1))&& board.get(row, 1).equals(board.get(row, 2)) && !board.get(row, 0).equals("-")){
          return board.get(row, 0);
        }
      }
      //Column
      for(int col = 0; col < board.getWidth(); col++){
        if(board.get(0, col).equals(board.get(1, col))&&board.get(1, col).equals(board.get(2, col))&& !board.get(0, col).equals("-")){
          return board.get(0, col);
        }
      }
      //diagonals
      if(board.get(0, 0).equals(board.get(1, 1))&&board.get(1, 1).equals(board.get(2, 2)) && !board.get(0, 0).equals("-")){
        return board.get(0, 0);
      }
      if(board.get(2, 0).equals(board.get(1, 1))&&board.get(1, 1).equals(board.get(0, 2)) && !board.get(2, 0).equals("-")){
        return board.get(2, 0);
      }
      if(noAvailableSpotLeft()){
        return "tie";
      }
      return "undetermined";
    }
    /**
    *
    *
    */
    public boolean noAvailableSpotLeft(){
      for(int row = 0; row < board.getHeight(); row++){
        for(int col = 0; col < board.getWidth(); col++){
          if(board.get(row,col).equals("-")){
            return false;
          }
        }
      }
      return true;
    }
    /**
     * gets the current board and all it's data
     */
    public Board getBoard() 
    {
      return board;
    }
  
    /**
     * get the current player - can be either "X" or "Y"
     */
    public String getPlayer() 
    {
      return player;
    }
  
    /**
     * Swaps between "X" and "O"
     */
    public void switchPlayer() {
      if(player.equals("X")){
        player = "O";
      }
      else{
        player = "X";
      }
    }
  
    //no use for the program
    public String toString() 
    {
      return "";
    }
  }
  