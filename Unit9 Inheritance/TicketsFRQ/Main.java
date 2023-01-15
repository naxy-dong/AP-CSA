//Author(s): Brandon Zhang
//Class description:
class Main {
    public static void main(String[] args) {
      Advance ticket1 = new Advance(4);      
      Advance ticket2 = new Advance(15);
  
      StudentAdvance ticket3 = new StudentAdvance(5);
      StudentAdvance ticket4 = new StudentAdvance(20);
  
      Walkup ticket5 = new Walkup();
  
      Ticket[] tickets = new Ticket[] {ticket1, ticket2, ticket3, ticket4, ticket5};
          
      System.out.println("\n-------\n");
  
      for (Ticket t: tickets) {
        System.out.println(t.toString());
        System.out.println("\n-------\n");
      }
    }
  }