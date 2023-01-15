class Main {
    public static void main(String[] args) {
      Person p = new Person("Mr F", "grading TicTacToe");
      LoudPerson lp = new LoudPerson("Ms. L","playing tuba");
      System.out.println("Person greeting:");
      p.greeting();;
      System.out.println("LoudPerson greeting:");
      lp.greeting();
    }
  }