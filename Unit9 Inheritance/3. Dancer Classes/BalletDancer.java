public class BalletDancer extends Dancer
{
  public BalletDancer(String n, String sn)
  {
    super(n,sn);
  }
  public void jete()
  {
    System.out.println("Leaping...");
  }
  public void pirouette()
  {
    System.out.println("Spinning...");
  }
  public void perform()
  {
    super.perform();
    jete();
    pirouette();
  }
}