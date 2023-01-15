class Main 
{
  public static void main(String[] args) 
  {
    // All these lines until the print statements set variables for the doubles and booleans that will be entered into the print statements. They are not necessay however they make the flow of reading the code easier.

    APLine line1 = new APLine(5,4,-17);
    //created the line with a=4, b=4, c=17
    double slope1 = line1.getSlope(); 
    //sets the slope to slope1
    boolean onLine1 = line1.isOnLine(5,-2);
    //return true becuase 5(5)+4(-2)-17=0


    APLine line2 = new APLine(-25,40,30); //makes line
    double slope2 = line2.getSlope(); //gets slope and 
    boolean onLine2 = line2.isOnLine(5,-2);
    //returns false bc -25(5)+40(-2)+30=/0

    //just a 3rd example, does the same
    APLine line3 = new APLine(16,-10,5);
    double slope3 = line3.getSlope();
    boolean onLine3 = line3.isOnLine(10,-3);

    //All of these lines are the print statements that use the variables above to convey information about the lines

    //prints out the line using toString(), and the 
    //slope and whether or not the point is on the line
    System.out.println("Line 1: " + line1);
    System.out.println("Slope of Line1: " + slope1);
    System.out.println("(5,-2) is on Line1: " + onLine1);

    System.out.println();

    //prints out the line using toString(), and the 
    //slope and whether or not the point is on the line
    System.out.println("Line 2: " + line2);
    System.out.println("Slope of Line2: " + slope2);
    System.out.println("(5,-2) is on Line2: " + onLine2);

    System.out.println();

    //just a 3rd example
    System.out.println("Line 3: " + line3);
    System.out.println("Slope of Line3: " + slope3);
    System.out.println("(10,-3) is on Line3: " + onLine3);
  }
}