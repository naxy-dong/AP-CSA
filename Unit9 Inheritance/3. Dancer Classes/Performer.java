public class Performer
{
  private String name;
  private String stageName;

  public Performer()
  { 
    name = "";
    stageName = "";
  }
  public Performer(String n, String sn)
  {
   name = n;
   stageName = sn;
  }

  public String getName()
  {
    return "";
  }

  public String getStageName()
  {
    return "";
  }
  public void practice()
  {
    System.out.println("Honing my craft!");
  }
  public void perform()
  {
     System.out.println("Hello! I'm \""+stageName+"\" performing for an audience!");
  }
}