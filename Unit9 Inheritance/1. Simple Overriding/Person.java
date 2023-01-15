public class Person
{
   public String name;
   private String hobby;
   
   public Person(String n, String h)
   {
     this.name = n;
     this.hobby = h;
   }
   
   public void greeting()
   {
       System.out.println("Hi, I'm "+this.name+". My hobby is "+this.hobby+".");
   }
 }
