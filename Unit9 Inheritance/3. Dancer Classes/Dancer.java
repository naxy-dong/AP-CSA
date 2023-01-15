public class Dancer extends Performer 
{
  public Dancer(String n, String sn)
  {
    super(n,sn);
  }
  
  public void perform()
  {
    //How could you add performer's perform()?
    super.perform();
    System.out.println("Dancing on the stage!");
  }
}