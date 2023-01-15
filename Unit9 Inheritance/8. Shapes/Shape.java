//This is the parent class of all shapes
public class Shape{
    private int sides;
    //constructor Shape initialize the sides
    public Shape(int s){
      sides = s;
    }
    //the toString method prints out how many sides it has.
    public String toString(){
      return "This shape has " + sides + " sides";
    }
  }