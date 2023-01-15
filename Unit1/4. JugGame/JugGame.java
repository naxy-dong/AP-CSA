import java.util.Scanner;

public class JugGame{
  private int jug1;
  private int jug2;
  private int jugLimit1;
  private int jugLimit2;
  private boolean gameEnded;
  //constructor
  public JugGame(){
    jug1 = 0;
    jug2 = 0;
    jugLimit1 = 5;
    jugLimit2 = 6;
    gameEnded = false;
  }
  //methods
  public void runGame(){
    //ask the question
    Scanner Input = new Scanner(System.in);
    int methodNum;
    int jugNum;
    System.out.println("Choose what you want to do with the jugs. Enter 1 if you want to fill the jug with water. Enter 2 if you want to empty the jug. Enter 3 if you want to fill the jug from the other jug");
    methodNum = Input.nextInt();
    System.out.println("Choose a jug to perform the action");
    jugNum = Input.nextInt();

    if(methodNum == 1){
      fillJug(jugNum);
    }
    if(methodNum == 2){
      emptyJug(jugNum);
    }
    if(methodNum == 3){
      fillJugwithOtherJug(jugNum);
    }

    display();

    if(jug2 == 2){
      System.out.println("Congratulations, you have successfully solved the puzzle");
    }
  }
  public void fillJug(int JugNum){
    if(JugNum == 1){
      jug1 = jugLimit1;
    }
    else{
      jug2 = jugLimit2;
    }
  }
  public void emptyJug(int JugNum){
    if(JugNum == 1){
      jug1 = 0;
    }
    else{
      jug2 = 0;
    }
  }
  public void fillJugwithOtherJug(int JugNum){
    if(JugNum == 1){
    }
    else{
      jug2 = 0;
    }
  }
  public void display(){
    System.out.println("Jug1 has " + jug1 + " gallons, and jug 2 has " + jug2 + " gallons");
  }
}