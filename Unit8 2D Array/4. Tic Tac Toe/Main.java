class Main {
    /** First Goal: create a TicTacToe object (t0?) 
     * create two HumanPlayer objects (player1 and player2?) 
     * and have two players play each-other using Scanner for input
     * You will use getPlayer(), makeMove(), switchPlayer() and winner() 
     * Play until there is a winner or a tie.  
     * Announce the winner or the tie.
     * 
     * If you get that, then have RandomPlayer vs HumanPlayer
     * 
     * Last try RandomPlayer vs RandomPlayer
     * 
     * Extra credit: try to make an AIPlayer
     * 
     * Extra credit: try to make a GUI - swing, JavaFX, html, Android
     */
   
     public static void main(String[] args)
     {
       TicTacToe t = new TicTacToe();
       HumanPlayer player1= new HumanPlayer(t);
       HumanPlayer player2= new HumanPlayer(t);
   
       RandomPlayer rplayer1 = new RandomPlayer(t);
       RandomPlayer rplayer2 = new RandomPlayer(t);
       //(human vs human)
       // do{
       //   player1.makeMove();
       //   t.switchPlayer();
       //   player2.makeMove();
       //   t.switchPlayer();
       // }
       // while(t.winner().equals("undetermined"));
   
       //(human vs computer)
       // do{
       //   player1.makeMove();
       //   t.switchPlayer();
       //   rplayer1.makeMove();
       //   t.switchPlayer();
       // }
       // while(t.winner().equals("undetermined"));
   
       //(computer vs computer)
       do{
         rplayer1.makeMove();
         t.switchPlayer();
         rplayer2.makeMove();
         t.switchPlayer();
       }
       while(t.winner().equals("undetermined"));
   
       System.out.println("GAME OVER:\n" + t.getBoard());
       if(t.winner().equals("tie")){
         System.out.println("the game is a tie");
       }
       else{
         System.out.println("player with " + t.winner() + " won. Congrats");
       }
     }
   }