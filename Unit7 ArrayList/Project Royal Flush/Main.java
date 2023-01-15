import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Eleven e = new Eleven();
    String userInput;
    Scanner jn = new Scanner(System.in);
    System.out.println("Type the numbers of any two cards that add up to 11\n ---OR---\nType 'JQK' to remove Jack, Queen, and King");

    while(!e.gameEnded()){
      userInput = jn.nextLine();
      if(userInput.equals("JQK")) {
        e.removeJQK();
        //looks for j, q, k on the table
        //if (^) - remove them      
      }
      else{
        String s1 = "";
        String s2 = "";
        s1 = userInput;
        System.out.println("Type the second number");
        userInput = jn.nextLine();
        s2 = userInput;
        if(e.addUpToEleven(s1, s2)){
          e.removeEleven(s1, s2);
        }
      }
      e.replaceCards();
    }
  }

}