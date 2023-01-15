class Main {
    public static void main(String[] args) {
      //Create four accounts 
      BankAccount b1 = new BankAccount("Joe","123", 10.0);
      BankAccount b2 = new BankAccount("John","1234", 20.0);
      BankAccount b3 = new BankAccount("Dick","12345", 30.0);
      BankAccount b4 = new BankAccount("David","123456", 40.0);
      //print out the account info for each customer
      b1.printAccountInfo();
      b2.printAccountInfo();
      b3.printAccountInfo();
      b4.printAccountInfo();
      //add to the balance of two of the customers
      b1.deposit(12);
      b2.deposit(21);
      //check their new balance
      b1.printAccountInfo();
      b2.printAccountInfo();
      //withdraw money from two of the accounts
      b3.withdrawal(12);
      b4.withdrawal(21);
      //check the new balance
      b3.printAccountInfo();
      b4.printAccountInfo();
      //update the name to a customer and check the new name.
      b2.setName("Doe");
      b2.printAccountInfo();
      //test out the toString() method
      b2.toString();
    }
  }