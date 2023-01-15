//Authors(s): Clara Presser
//class desciption: 
public class Advance extends Ticket{
    private double cost;
  
    public Advance(int numDays)
    {
      super();
      if (numDays >= 10)
      {
        cost=30.00;
      }
      else
      {
        cost=40.00;
      }
    }
  
    public double getPrice()
    {
      return(cost);
    }
  
    public String toString()
    {
      return super.toString();
    }
  }