public class Lottery{
    private int digit1;
    private int digit2;
    private int secretDigit1;
    private int secretDigit2;
    private int prize;
    
    public Lottery(int userInput){
      if(userInput < 10){
        digit1 = 0;
        digit2 = userInput;
      }
      else{
        digit1 = userInput/10;
        digit2 = userInput%10;
      }
      generateNumber();
    }
  
    public void generateNumber(){
      secretDigit1 = (int) (Math.random() * 10);
      secretDigit2 = (int) (Math.random() * 10);
      System.out.println("" + secretDigit1 + secretDigit2);
    }
  
    public int calculatePrice(){
      prize = 0;
  
      if(secretDigit1 == digit1 && secretDigit2 == digit2){
        prize = 10;
      }
      else if(secretDigit1 == digit2 && secretDigit2 == digit1){
        prize = 3;
      }
      else if(secretDigit1 == digit1 || secretDigit2 == digit2 || secretDigit1 == digit2 || secretDigit2 == digit1){
        prize = 1;
      }
      return prize;
    }
  
    public void report(){
      calculatePrice();
      System.out.println("Your input is " + digit1 + digit2 + " and the lottery number is " + secretDigit1 + secretDigit2 + ". You are prize is $" + prize + ".");
    }
  }