import java.util.Arrays;
//Be sure to add any Java Docs that are missing and fix the indentation

//A class that simulating a ExperimentalFarm;
public class ExperimentalFarm
{
  private Plot[][] farmPlots;
  /** 
  *constructor 
  *initialized farmPlots to @param p
  */
  public ExperimentalFarm(Plot[][] p)
  {
    farmPlots = p;
  }

  /** Returns the plot with the highest yield for a given crop type, as described in part (a). */
  public Plot getHighestYield(String c)
  {
    int highest=0, targetRow = -1, targetCol = -1;
    for(int row = 0; row < farmPlots.length; row++){
      for(int col = 0; col < farmPlots[0].length; col++){
        if(farmPlots[row][col].getCropType().equals(c)&& farmPlots[row][col].getCropYield() > highest){
          highest =farmPlots[row][col].getCropYield();
          targetRow = row;
          targetCol = col;
        }
      }
    }
    if(targetRow == -1){
      return null;
    }
    else{
      return farmPlots[targetRow][targetCol];
    }
  }

  /** Returns true if all plots in a given column in the two-dimensional array farmPlots
  * contain the same type of crop, or false otherwise, as described in part (b).
  */
  public boolean sameCrop(int col)
  {
    String targetPlot = farmPlots[0][col].getCropType();
    for(int row = 0; row < farmPlots.length; row++){
      if(!farmPlots[row][col].getCropType().equals(targetPlot)){
        return false;
      }
    }
    return true;
  }

  /** return string containing all data from farmplots
  */
  public String toString()
  {
    return Arrays.deepToString(farmPlots);
  }
}