public class TwoDice{
    private Die d1;
    private Die d2;
  
    public TwoDice(Die die1, Die die2){
      d1 = die1;
      d2 = die2;
    }
  
    public int TwoDiceRolls(){
      return d1.roll() + d2.roll();
    }
  }