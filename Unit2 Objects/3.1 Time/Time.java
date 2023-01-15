public class Time
{
   private int hrs;
   private int mins;
   private int secs;
   
   //initialize everything to zero
   public Time()
   {
     hrs = 0;
     mins = 0;
     secs = 0;
   }
   
   //initialzie to h, m and s
   public Time(int h, int m, int s)
   {
     hrs = h;
     mins = m;
     secs = s;
   }
   
   public int getHrs(){
     return hrs;
   }

   public int getMins(){
     return mins;
   }

   public int getSecs(){
     return secs;
   }
   //reset time
   public void reset(int h, int m, int s)
   {
     hrs = h;
     mins = m;
     secs = s;
   }
   
   //Advances time by 1 second - Tricky!  Let me know if you need a hint!
   public void increment()
   {
     if(++secs == 60){
       secs = 0;
       if(++mins == 60){
         mins = 0;
         if(++hrs == 24){
           hrs = 0;
         }
       }
     }
   }
   public void printTime(){
     System.out.println(hrs + ":" + mins + ":" + secs);
   }

   public boolean checkEqual(Time t){
     if(t.getHrs()== hrs && t.getMins()== mins&& t.getSecs() == secs){
        return true;
     }
     return false;
   }

   public boolean checkEarly(Time t){//check if the time is earlier than the input time.
     if(this.checkEqual(t) == true){
       return false;
     }
     if(t.getHrs() > hrs){
       return true;
     }
     else if(t.getHrs() == hrs){
       if(t.getMins() > mins){
         return true;
       }
       else if(t.getMins() == mins){
         if(t.getSecs() > secs){
           return true;
         }
       }
     }
     return false;
   }
 }