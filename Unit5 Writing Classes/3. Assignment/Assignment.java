public class Assignment 
{
  //increment by one each time a new assignment is created
  private static int nextAssignmentID = 1;
  private String name;
  private int pointValue;
  private int assignmentID;
  
  //Make a two parameter constructor that gives the
  //assignment a unique assignment ID
  //and then increments nextAssignmentID
  public Assignment(String initName, int initValue){
    name = initName;
    pointValue = initValue;
    assignmentID = nextAssignmentID;
    nextAssignmentID++;
  }
  //Make the method getPercent
  //should it be static or non-static?
  public double getPercent(int value){
    return (double)value/100;
  }
  //Make the method  getNumAssignments
  //should it be static or non-static?
  public static int getNumAssignments(){
    return nextAssignmentID;
  }
}
