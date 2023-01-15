public class Dog {
    private String dogName;
    private int dogAge;
  
    public Dog(String name){
      dogName = name;
      dogAge = 1;
    }
    
    public void bark(){
      System.out.println("Woof.");
    }
  
    public void age(){
      dogAge += 1;
    }
  
    public void info(){
      System.out.println(dogName + " is now " + dogAge + " years old.");
    }
  }