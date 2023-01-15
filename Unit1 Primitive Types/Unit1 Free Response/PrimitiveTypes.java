public class PrimitiveTypes{
    public static void messageForJava(){
      System.out.println("############\n#  I\"love\" #\n#   Java!  #\n############");
    }
    public static void quotientAndRemainder(int dividend, int divisor){
      System.out.println(dividend % divisor);
    }

    public static double convertToCelsius(int fahrenheit){
      int celsius;
      celsius = (fahrenheit - 32) * 5/9;
      return celsius;
    }
  }