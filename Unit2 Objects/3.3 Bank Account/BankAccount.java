public class BankAccount 
{
   private String password;
   private double balance;
   private String name;
   //Empty Constructor Sets password to null and balance to 0.0;
   public BankAccount()
   {
      name = null;
      password = null;
      balance = 0.0;
   }
   //Two parameter constructor sets password and balance
   public BankAccount(String n,String pw, double bal)
   {
      password = pw;
      balance = bal;
      name = n;
   }
   public void setName(String n){
     name = n;
   }
   //deposit adds money to the balance
   public void deposit(double depositAmount)
   {
      balance += depositAmount;
   }
   
   //withdrawal subtracts from the balance
   public void withdrawal(double withdrawalAmount)
   { 
      balance -= withdrawalAmount;
   }
   
   //print Name and balance
   public void printAccountInfo()
   {
     System.out.println(name + ":" + balance);
   }
   
   //make a toString method instead
   public String toString(){
     return name + ":" + Double.toString(balance);
   }
 }