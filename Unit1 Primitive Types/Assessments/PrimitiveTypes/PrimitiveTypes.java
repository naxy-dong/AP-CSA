public class PrimitiveTypes
{
  /** Displays an example of a string literal that
   *  uses escape  characters to display the single
   *  quote the double quote, the new line and the tab.
   */
   public static void stringLiterals()
   {
     String stringLiterals = "\t\"This quote is inside a double quote \n and with a tab and and new line\"\n";
     System.out.println(stringLiterals);
   }
 
  /** Displays the three primitive types and
   *  their ranges used in the AP® Java A course.
   */  
   public static void primitiveTypes()
   { 
     System.out.println("The range of an integer is " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
     System.out.println("The range of an double is " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
     System.out.println("The range of an float is " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
   }
 
  /** Displays the five arithmetic operators.
   *  Gives examples of division and modulo.
   *  Gives an example of order of operations.
   */
   public static void arithmeticOperators()
   {
     int result;
     result = 3 + 5;
     System.out.println("3 + 5 = " + result);
     result = 10 - 5;
     System.out.println("10 - 5 = " + result);
     result = 3 * 3;
     System.out.println("3 * 3 = " + result);
     result = 12 / 3;
     System.out.println("12 / 3 = " + result);
     result = 12 % 5;
     System.out.println("12 % 5 = " + result);
     result = 12 + 5 * 6;
     System.out.println("Order of operation: 12 + 5 * 6 = " + result);
     result = (12 + 5) * 6;
     System.out.println("Order of operation: (12 + 5) * 6 = " + result);
   }
 
  /** Displays and explains the five compound assignment operators.
   *  Displays and explains the increment and decrement
   *  for both prefix and postfix form.
   */
  public static void compoundAssignmentOperators()
  {
    int num;
    System.out.println("The compound assignment is a way to do arithmetic faster in java");
    num = 3;
    num += 5;
    System.out.println("3 += 5 ==> " + num);
    num = 10;
    num -= 5;
    System.out.println("10 -= 5 ==> " + num);
    num = 3;
    num *= 3;
    System.out.println("3 *= 3 ==> " + num);
    num = 12;
    num /= 3;
    System.out.println("12 /= 3 ==> " + num);
    num = 12;
    num %=5;
    System.out.println("12 %= 5 ==> " + num);
    
    System.out.println("Prefix adds the number BEFORE the command is executed");
    System.out.println("num is currently " + num + ". And the result after the prefix ++num is " + ++num);
    System.out.println("Postfix adds the number AFTER the command is executed");
    System.out.println("num is currently " + num + ". And the result after the prefix num++ is " + num++);
    System.out.println("now after the command is executed, the number is " + num);
  }
 
   /** Displays and explains casting between two different data types.
    *  Displays important examples regarding precision. 
    *  Displays how proper correct rounding can be implemented.
    */
    public static void castingVariables()
    {
      double doublenum;
      int intnum;
      doublenum = 4.2;
      intnum = 5;

      System.out.println("double number before converting to integer is " + doublenum);
      System.out.println("double number after converting to integer is " + (int)doublenum);

      System.out.println("integer number before converting to double is " + intnum);
      System.out.println("integer number after converting to double is " + (double)intnum);

      double PI = 3.1415;
      System.out.println("\nPrecision is the number of places in a number. For example, although 4.00 and 4.000 are the same value, they have different number of decimal places\n");

      System.out.println("To round a decimal to certain number of decimal places you use the formula (double) Math.round(decimal * 10^number) / 10^number");

      System.out.println("Normal Math.round output of 3.1415 = " + Math.round(PI));
      System.out.println("Output with formula = " + (double)Math.round(PI*100)/100);
    } 
}
