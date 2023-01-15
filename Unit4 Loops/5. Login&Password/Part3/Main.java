import java.util.Scanner; 
import java.io.File;

class Main {
  public static void main(String[] args) throws Exception {
    // Create a File instance for passwords
    java.io.File passwordFile = new File("password.txt");
    // Create a File instance for common passwords
    java.io.File topPasswordList = new File("topPasswordList.txt");


    // Create a Scanner for the passwordFile
    Scanner input = new Scanner(passwordFile);
    String teacherpassword[] = new String[25];
    String teacherlogin[] = new String[25];
    // Read data from a file
    int i=0;
    while (input.hasNext()) {
      String password = input.next();
      teacherlogin[i] = password.substring(0, password.indexOf(":"));
      teacherpassword[i] = password.substring(password.indexOf(":")+1);;
      i++;
    }
    // for(int j=0; j<teacherpassword.length;j++){
    //   System.out.println(teacherpassword[j]);
    // }
    // for(int j=0; j<teacherlogin.length;j++){
    //   System.out.println(teacherlogin[j]);
    // }
    // Close the file
    input.close();
    String popularPassword[] = new String[87];
    i = 0;
    //Switch to the other file
    input = new Scanner(topPasswordList);
    // Read data from a file
    while (input.hasNext()) {
      String password = input.next();
      popularPassword[i] = password;
      i++;
    }
    // for(int j=0; j<popularPassword.length;j++){
    //   System.out.println(popularPassword[j]);
    // }
    // Close the file
    input.close();

    MessageDigestMethod mdm = new MessageDigestMethod();
    for(int k = 0; k < teacherpassword.length; k++){
      for(int m = 0; m < popularPassword.length; m++){
        if(teacherpassword[k].equals(MessageDigestMethod.messageDigestMD5(popularPassword[m]))){
          System.out.println(teacherlogin[k] + "\'s password is " + popularPassword[m]);
        }
      }
    }
    
  }
}