public class Person {
    // visibility 
    public static int numberOfPeople = 0;  // static variable to the class
    public int numberOfPeopleButNonstatic = 0; // non static varaible test
    public int age;    //instance variable  -- belongs to object
    public String name;

    // Constructor -- initialize variable
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        numberOfPeople++;
    }

    // getters
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    //setters
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}