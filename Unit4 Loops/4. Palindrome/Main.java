class Main {
    public static void main(String[] args) {
      Palindrome palindrome = new Palindrome();
      
      palindrome.insertWord("mom");
      palindrome.insertWord("racecar");
      palindrome.insertWord("4123");
  
      palindrome.insertSentence("A nut for a jar of tuna");
      palindrome.insertSentence("Was it a car or a cat I saw");
    }
  }