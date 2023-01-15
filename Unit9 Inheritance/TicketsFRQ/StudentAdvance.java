//Authors: Yu Xiang Dong
//class description: This is the studentAdvance class
class StudentAdvance extends Advance{
    public StudentAdvance(int daysPurchased){
      super(daysPurchased); 
    }
    public double getPrice(){
      return super.getPrice()/2;
    }
    public String toString(){
      String output = super.toString();
      output += "\n(Student ID is required)";
      return output;
    }
  }