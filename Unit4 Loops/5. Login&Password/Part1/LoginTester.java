public class LoginTester{
    public String guess6digits(String login){
      for(int i = 0; i< 1000000; i++){
        int guess = i;
        String password = String.format("%06d",guess);
        if(LoginsAndPasswords.correctIdAndPassword(login,password)){
          return password;
        }
      }
      return "";
    }
    public String guess8digits(String login){
      for(int i = 0; i< 100000000; i++){
        int guess = i;
        String password = String.format("%08d",guess);
        if(LoginsAndPasswords.correctIdAndPassword(login,password)){
          return password;
        }
      }
      return "";
    }
  }