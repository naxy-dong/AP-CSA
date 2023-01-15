public class Ticket 
{
  static int serialNumber = 100; //unique ticket id number
  private int serial;
  
  public Ticket()
  {
    serial = getNextSerialNumber();
  }

  //Default ticket price (might be overridden)
  public double getPrice()
  {
    return 50.00;
  }

  //returns a string with serial number and price
  public String toString()
  {
    return "Number: "+serial+"\nPrice: "+getPrice();
  }
  //returns a new unique serial number
  private static int getNextSerialNumber() 
  {
    serialNumber++;
    return serialNumber;
  }
}

