//Be sure to add Java Docs documentation and fix the indentation

//A class that represents a Plot taht contains a type and yield.
public class Plot
{
  //type of crop
  private String cropType;
  //yield of crop
  private int cropYield;
  /**
  *constructor for plot class
  *init crop and yield attribute
  */
  public Plot(String crop, int yield)
  {
    cropType = crop;
    cropYield = yield;
  }
  /**
  * this function returns the crop attribute
  *
  */
  public String getCropType()
  {
    return cropType;
  }
  /**
  * this function returns the yield attribute of the crop
  *
  */
  public int getCropYield()
  {
    return cropYield;
  }

  /**
  * this function returns the yield attribute of the crop
  *
  */
  public String toString()
  {
    return cropType + " : " + cropYield;
  }
}   