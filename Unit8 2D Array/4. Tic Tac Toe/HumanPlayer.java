import java.util.Scanner;
/** class HumanPlayer manages the moves for making a move */

public class HumanPlayer
{
  private TicTacToe t;
  public HumanPlayer(TicTacToe t)
  {
    this.t = t;
  }
  /**
   * makeMove reads in two integers using Scanner and places either an 'X'
   * or a 'Y' onto the board.  If the spot is not open, it makes
   * the player try again until he/she enters a correct move
   */
  public void makeMove()
  {
    if(t.winner().equals("undetermined")){
      //retrieve information
      System.out.print("\ncurrent board:\n" + t.getBoard());
      int rowIndex;
      int colIndex;
      Scanner jn = new Scanner(System.in);
      System.out.println("Enter the row(0-2)");
      rowIndex = jn.nextInt();
      System.out.println("Enter the column(0-2)");
      colIndex = jn.nextInt();

      //writing on the board
      if(t.getBoard().get(rowIndex,colIndex).equals("-")){
        t.getBoard().set(rowIndex,colIndex, t.getPlayer());
      }
      else{
        System.out.println("spot is already taken");
        makeMove();
      }
    }
  }
}