import java.util.Scanner;
  //A random player that represents the computer and will automatically play the game.
  public class RandomPlayer
  {
    private TicTacToe t;
    //constructor that initialize the TicTacToe
    public RandomPlayer(TicTacToe t)
    {
      this.t = t;
    }
    //make a move randomly on the board
    public void makeMove()
    {
      if(t.winner().equals("undetermined")){
        //retrieve information
        System.out.print("\ncurrent board:\n" + t.getBoard());
  
        //writing on the board
        //going to make a very inefficient recursion
        findAMove();
      }
    }
    //precondition: there is a spot available, otherwise INFINITE loop!
    public void findAMove(){
      int rowIndex, colIndex;
      rowIndex = (int)(Math.floor(Math.random()*3));
      colIndex = (int)(Math.floor(Math.random()*3));
      if(t.getBoard().get(rowIndex,colIndex).equals("-")){
        t.getBoard().set(rowIndex,colIndex, t.getPlayer());
      }
      else{
        findAMove();
      }
    }
  }