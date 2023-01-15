public class Palindrome{
    public boolean checkPalindrome(String str){
      for(int i=0; i < str.length()/2; i++){
        if(!str.substring(i, i+1).equals(str.substring(str.length()-i-1, str.length()-i))){
          return false;
        }
      }
      return true;
    }
  
    public void insertWord(String str){
      if(checkPalindrome(str)){
        System.out.println("Yes, " + str + " is a palindrome");
      }
      else{
        System.out.println("No, " + str + " is not a palindrome");
      }
    }
  
    public void insertSentence(String str){
      String trimmedstr = str.replaceAll(" ", "").toLowerCase();
      if(checkPalindrome(trimmedstr)){
        System.out.println("Yes, " + str + " is a palindrome");
      }
      else{
        System.out.println("No, " + str + " is not a palindrome");
      }
    }
  }