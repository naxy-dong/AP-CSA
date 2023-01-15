import java.util.Scanner;
public class Average{
  private double average;
  private double[] doubleArray;

  public Average(int numElement){
    doubleArray = new double[numElement];
    Scanner jin = new Scanner(System.in);
    for(int i = 0; i< numElement; i++){
      doubleArray[i] = jin.nextDouble();
    }
  }

  public double calcAverage(){
    double avg = 0;
    for(int i = 0; i< doubleArray.length; i++){
      avg += doubleArray[i];
    }
    average = (double)(avg/doubleArray.length);
    return average;
  }

  public int calcAboveCount(){
    int aboveAvgCount=0;
    for(int i = 0; i<doubleArray.length; i++){
      if(average < doubleArray[i]){
        aboveAvgCount++;
      }
    }
    return aboveAvgCount;
  }
}