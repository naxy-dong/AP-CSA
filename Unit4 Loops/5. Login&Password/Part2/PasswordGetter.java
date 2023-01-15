public class PasswordGetter
{
   //LoginsAndPasswords2 has logins in the following formats:
   //for you to see: login0 password a123
   //login1 and login2 have the format: single lowercase character followed by three integer digits (from 0 to 9).
   //login3 and login4 have the format: two lowercase characters followed by three integer digits (0 to 9)
   //login5 and login6 have the format: three lower casse characters followed by three integer digits (0 to 9)
   //login7 and login8 have the format: four lower casse characters followed by three integer digits (0 to 9)
   public String guessStringw1letters(String login){
    String letter ="a";
    
    for(int i = 97; i < 97+26; i++){
      letter =Character.toString((char)i);
      for(int j = 0; j < 1000; j++){
        int guess = j;
        String number = String.format("%03d",guess);
        String password = letter + number;
        if(LoginsAndPasswords2.correctIdAndPassword(login,password)){
          return password;
        }
      }
    }
    return "";
  }

  public String guessStringw2letters(String login){
    String letter ="";
    for(int l = 0; l< 2; l++){
      letter += "a";
    }
    for(int k = 97; k < 97+26; k++){
      letter = letter.substring(0, 1) + Character.toString((char)k);
      for(int i = 97; i < 97+26; i++){
        letter = Character.toString((char)i) + letter.substring(1);
        for(int j = 0; j < 1000; j++){
          int guess = j;
          String number = String.format("%03d",guess);
          String password = letter + number;
          if(LoginsAndPasswords2.correctIdAndPassword(login,password)){
            return password;
          }
        }
      }
    }
    return "";
  } 

  public String guessStringw3letters(String login){
    String letter ="";
    for(int l = 0; l< 3; l++){
      letter += "a";
    }
    for(int m = 97; m < 97+26; m++){
      letter = letter.substring(0, 2) + Character.toString((char)m);
      for(int k = 97; k < 97+26; k++){
        letter = letter.substring(0, 1) + Character.toString((char)k) + letter.substring(2);
        for(int i = 97; i < 97+26; i++){
          letter = Character.toString((char)i) + letter.substring(1);
          for(int j = 0; j < 1000; j++){
            int guess = j;
            String number = String.format("%03d",guess);
            String password = letter + number;
            if(LoginsAndPasswords2.correctIdAndPassword(login,password)){
              return password;
            }
          }
        }
      }
    }

    return "";
  } 

  public String guessStringw4letters(String login){
    String letter ="";
    for(int l = 0; l< 4; l++){
      letter += "a";
    }
    for(int n = 97; n < 97+26; n++){
      letter = letter.substring(0, 3) + Character.toString((char)n);
      for(int m = 97; m < 97+26; m++){
        letter = letter.substring(0, 2) + Character.toString((char)m) + letter.substring(3);
        for(int k = 97; k < 97+26; k++){
          letter = letter.substring(0, 1) + Character.toString((char)k) + letter.substring(2);
          for(int i = 97; i < 97+26; i++){
            letter = Character.toString((char)i) + letter.substring(1);
            for(int j = 0; j < 1000; j++){
              int guess = j;
              String number = String.format("%03d",guess);
              String password = letter + number;
              if(LoginsAndPasswords2.correctIdAndPassword(login,password)){
                return password;
              }
            }
          }
        }
      }
    }


    return "";
  } 
}