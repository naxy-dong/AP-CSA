/** Die  is a java class for simulating  various sided die
  * Three constructors: 
  * 1. no parameter constructor makes a standard six-sided die
  * 2. a constructor with one parameter for number of sides.
  * 3. a constructor with two parameters: one for number of sides and one for minimum value
  */

  public class Die
  {
   /* instance variables not shown */
    private int minval;
    private int numsides;
    /** Standard six sided die numbered 1 to 6 */
    public Die()
    { 
      numsides = 6;
      minval = 1;
    }
  
    /** Can be any size. Assume size bigger than 1. minValue defaults to 1
      * The values of the die are the consecutive integers starting at minValue.
      * @param sides Sets this Die's sides.
      */
    public Die(int sides)
    {
      numsides = sides;
      minval = 1;
    }
  
  
    /** Can be any size. Assume size bigger than 2. minValue can be any integer.  
      * The values of the die are the consecutive integers starting with minValue
      * @param sides Sets this Die's sides.
      * @param minValue The min value followed by consecutive integers.
      */
    public Die(int sides, int minValue)
    {
      numsides = sides;
      minval = minValue;
    }
  
    /** roll() is a random value from minValue to minValue + sides - 1.
      * @return rollValue which is 
      * the random integer from minValue to minValue + sides -1.
      * */
    public int roll()
    {
      return (int)(Math.random() * numsides+minval);
    }
  }