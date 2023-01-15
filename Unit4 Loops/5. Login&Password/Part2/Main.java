class Main {
    //LoginsAndPasswords2 has logins in the following formats:
     //for you to see: login0 password a123
     //login1 and login2 have the format: single lowercase character followed by three integer digits (from 0 to 9).
     //login3 and login4 have the format: two lowercase characters followed by three integer digits (0 to 9)
     //login5 have the format: three lower case characters followed by three integer digits (0 to 9)
     //login6 and login7 and login8 have the format: four lower case characters followed by three integer digits (0 to 9)
     public static void main(String[] args)
     {
       PasswordGetter pg = new PasswordGetter();
  
        String login = "login0";
        String password = pg.guessStringw1letters("login0");
        boolean gotIt = LoginsAndPasswords2.correctIdAndPassword(login,password);
        System.out.println(login+" and "+password+ " gotIt = "+gotIt);
  
        password = pg.guessStringw1letters("login1");
        login = "login1";
        gotIt = LoginsAndPasswords2.correctIdAndPassword(login,password);
        System.out.println("\ngotIt = "+gotIt+", login = "+login+" password = "+password);
  
        password = pg.guessStringw1letters("login2");
        login = "login2";
        gotIt = LoginsAndPasswords2.correctIdAndPassword(login,password);
        System.out.println("\ngotIt = "+gotIt+", login = "+login+" password = "+password);
  
        password = pg.guessStringw2letters("login3");
        login = "login3";
        gotIt = LoginsAndPasswords2.correctIdAndPassword(login,password);
        System.out.println("\ngotIt = "+gotIt+", login = "+login+" password = "+password);
  
        password = pg.guessStringw2letters("login4");
        login = "login4";
        gotIt = LoginsAndPasswords2.correctIdAndPassword(login,password);
        System.out.println("\ngotIt = "+gotIt+", login = "+login+" password = "+password);
  
        password = pg.guessStringw3letters("login5");
        login = "login5";
        gotIt = LoginsAndPasswords2.correctIdAndPassword(login,password);
        System.out.println("\ngotIt = "+gotIt+", login = "+login+" password = "+password);
  
        password = pg.guessStringw4letters("login6");
        login = "login6";
        gotIt = LoginsAndPasswords2.correctIdAndPassword(login,password);
        System.out.println("\ngotIt = "+gotIt+", login = "+login+" password = "+password);
  
        password = pg.guessStringw4letters("login7");
        login = "login7";
        gotIt = LoginsAndPasswords2.correctIdAndPassword(login,password);
        System.out.println("\ngotIt = "+gotIt+", login = "+login+" password = "+password);
  
        password = pg.guessStringw4letters("login8");
        login = "login8";
        gotIt = LoginsAndPasswords2.correctIdAndPassword(login,password);
        System.out.println("\ngotIt = "+gotIt+", login = "+login+" password = "+password);
     }
  
  }