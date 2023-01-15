import java.util.ArrayList;

public class Comedian extends Performer
{
  private ArrayList<String> jokes;

  public Comedian(String n, String sn)
  {
    super(n,sn);
  }

  public void writeJokes()
  {
    //Add some jokes to your ArrayList
    jokes = new ArrayList<String>() ;
    jokes.add("I saw giraffe has a short neck.. oh dear");
    jokes.add("bearly bear");
    jokes.add("nanideska");
  }
  //Add perform here.  But first run the code as
  //is...  Why doesn't it print anything for Ms C?
  public void perform()
  {
    writeJokes();
    //Tell all (or pick a random one) the jokes in the ArrayList jokes
    System.out.println(jokes.get((int)(Math.random()*jokes.size())));
  }
}