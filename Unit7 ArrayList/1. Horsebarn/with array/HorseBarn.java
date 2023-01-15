/** From the AP Java A 2012 Free Response Question - 
 * A good problem for practicing arrays of objects.
 */
 
 public class HorseBarn
 {
    private Horse[] spaces;
 
    /** Constructor that takes the number of stalls
     * @param numStalls - the number of stalls in the barn
     */
    public HorseBarn(int numStalls)
    {
      spaces = new Horse[numStalls];
    }
    /** Set space[i] to the reference Horse
     * precondition: spaces.length > i 
     */
     public void setSpaces(int i, Horse h)
     {
       if (spaces != null)
          this.spaces[i] = h;
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
      for(int i = 0; i< spaces.length; i++){
        if(spaces[i]!=null && spaces[i].getName().equals(name)){
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
       Horse[] spaces2 = new Horse[spaces.length];
       int index = 0;
       for(int i = 0; i< spaces.length; i++){
         if(spaces[i] != null){
           spaces2[index] = spaces[i];
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