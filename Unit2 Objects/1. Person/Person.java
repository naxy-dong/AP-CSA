import java.util.Scanner;

public class Person{
  private String personName;
  private int personAge;
  private String hairColor;
  private String occupation;

  //0 parameter constructor
  public Person(){
    personAge = 18;
    hairColor = "Black";
    personName = "Dummy";
    occupation = "Constructor";
  }

  //1 parameter constructor
  public Person(String name){
    personAge = 18;
    hairColor = "Black";
    personName = name;
    occupation = "Constructor";
  }
  
  //4 parameter constructor 
  public Person(String name, int age, String hair, String job){
    personName = name;
    personAge = age;
    hairColor = hair; 
    occupation = job;
  }
  
  public void introduce(){
    System.out.println("Hi, my name is " + personName + " and I'm " + personAge + " years old. I have " + hairColor + " hair. And I'm currently working as a "+ occupation + ".");
    System.out.println();
  }

  public void walk()
  {
    System.out.println("Your human went for a walk.");
    System.out.println();
  }

  public void eat()
  {
    System.out.println("Your human ate some food.");
    System.out.println();
  }
}