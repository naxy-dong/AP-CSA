import java.util.Random;

public class Thing

{
   //You'll need to add attributes here.
   private String name;
   
   /** Constructs a new Thing named myName*/
   public Thing(String myName)
   {
     name = myName;
   }
    
    
   /** Returns this Thing’s name*/
   public String getName()
   {
     return name;
   }
   
   /** Sets this Thing’s name to newName*/   
   public void setName(String newName)
   {
     double rNum;
     int value;
     rNum = Math.random()*newName.length();
     value = (int)rNum;
     name = newName.substring(0,value) + newName.substring(value+1);
   }
   
   /** Returns a message as described in part (b)*/   
   public void printMessage()
   {
     System.out.println(name + "_is_great");
   }
}