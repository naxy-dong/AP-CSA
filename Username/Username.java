import java.util.ArrayList;
import java.util.Arrays;
public class Username{

  // The list of possible user names, based on a user’s first and last names and initialized by the constructor.

  private ArrayList<String> possibleNames;
  
  /** Constructs a UserName object as described in part (a).

  * Precondition: firstName and lastName have length greater than 0

  * and contain only uppercase and lowercase letters.

  */

  public Username(String firstName, String lastName)
  {
    possibleNames = new ArrayList<String>();
    for(int i = 1; i <= firstName.length(); i++){
      possibleNames.add(lastName + firstName.substring(0,i));
    }
    System.out.println(possibleNames+"\n");
  }

  

  /** Returns true if arr contains name, and false otherwise. */

  public boolean isUsed(String name, String[] arr)
  {
    for(String n : arr){
      if(n.equals(name)){
        return true;
      }
    }
    return false;
  }

  /** Removes strings from possibleNames that are found in usedNames as described in part (b).

  */

  public void setAvailableUserNames(String[] usedNames)
  {
    
    System.out.println("Used String:" + Arrays.toString(usedNames));
    for(int i =0; i < possibleNames.size(); i++){
      if(isUsed(possibleNames.get(i), usedNames)){
        possibleNames.remove(i);
        i--;
      }
    }
    
  }
  /**
    return the possibleNames variable
  */
  public ArrayList<String> getPossibleNames()
  {
    return possibleNames;
  }
}