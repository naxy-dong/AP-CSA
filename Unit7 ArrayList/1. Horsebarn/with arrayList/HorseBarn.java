import java.util.ArrayList;
/** From the AP Java A 2012 Free Response Question - 
 * A good problem for practicing arrays of objects.
 */
 
public class HorseBarn
{
   private ArrayList<Horse> spaces;
   
   /** Constructor that takes the number of stalls
    * @param numStalls - the number of stalls in the barn
    */
   public HorseBarn(int numStalls)
   {
     spaces = new ArrayList<Horse>();
     for(int i = 0; i < numStalls; i++){
       spaces.add(null);
     }
   }
   /** Set space[i] to the reference Horse
    * precondition: spaces.length > i 
    */
    public void setSpaces(int i, Horse h)
    {
      if(spaces != null)
        spaces.set(i,h);
      else
        System.out.println("Write the constructor for HorseBarn!");
    }
   /** Returns the index of the space that contains the horse with the specified name.
    * * Precondition: No two horses in the barn have the same name.
    * @param name the name of the horse to find
    * @return the index of the space containing the horse with the specified name;
    * -1 if no horse with the specified name is in the barn.
    */
   public int findHorseSpace(String name)
   {
     for(int i = 0; i< spaces.size(); i++){
       if(spaces.get(i)!=null && spaces.get(i).getName().equals(name)){
         return i;
       }
     }
     return -1;
   }
   
    /** Consolidates the barn by moving horses so that the horses are
    *  in adjacent spaces, starting at index 0, with no empty space
    *  between any two horses.
    * Postcondition: The order of the horses is the same as before
    *  the consolidation.
    */
   public void consolidate()
   {
      ArrayList<Horse> spaces2 = new ArrayList<Horse>();
      for(int i = 0; i < spaces.size(); i++){
        spaces2.add(null);
      }
      int index = 0;
      for(int i = 0; i< spaces.size(); i++){
        if(spaces.get(i) != null){
          spaces2.set(index, spaces.get(i));
          index++;
        }
      }
      spaces = spaces2;
   }
   
   /** Returns a String that shows the contents of the spaces
     * array.  Keep in mind that Horse already has a toString.
     * @return a string that shows the contents of the array spaces.
     * prints null if the space is null.  Prints the horse info.
     */
   public String toString()
   {
     String result = "";
     
     for(Horse h: spaces){
       result += h + "\n";
     }
     
     return result;
   }
}