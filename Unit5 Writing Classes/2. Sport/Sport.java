public class Sport
{
  private String name;
  private int numAtheletes;

  public Sport(String n, int num)
  {
    name = n;
    numAtheletes = num;
  }

  public String getName()
  {
    return name;
  }

  public int getNumAtheletes()
  {
    return numAtheletes;
  }
  //Add your toString() method here
  public String toString(){
    return "There are " + numAtheletes + " people in " + name;
  }
}