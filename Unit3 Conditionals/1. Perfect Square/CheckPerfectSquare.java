public class CheckPerfectSquare{
    private int SquaredNumber;
    CheckPerfectSquare(int num){
      SquaredNumber = num;
    }
  
    public boolean isPerfectSquare(){
      if(Math.floor(Math.sqrt(SquaredNumber)) == Math.sqrt(SquaredNumber)){
        return true;
      }
      return false;
    }
  }