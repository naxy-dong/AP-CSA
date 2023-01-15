public class APLine
{
  int a, b, c; 
  //instance variables
  //in the equation they are ax + by + c = 0 
  //aka the coefficients and constant :)
  // Precondition can not = 0

  //constuctor
  public APLine(int a, int b, int c)
  {
    //sets values
    this.a = a;
    this.b = b;
    this.c = c;
  }

  //return double slope
  public double getSlope()
  {
    //must cast to double since they are ints :)
    return -(double)a/(double)b;
  }

  //returns boolean if point is on line
  public boolean isOnLine(int x, int y)
  {
    int num = a*x + b*y + c;
    if (num == 0)
    {
      return true;
    }
    else
      return false;
  }

  // return string of equation
  public String toString()
  {
    return a + "x + " + b + "y + " + c + " = 0";
  }
}