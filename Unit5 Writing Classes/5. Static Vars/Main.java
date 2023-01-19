public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(19, "Naxy");    //person1 is object
        Person person2 = new Person(16, "Diego");   //person2 is object
        // Person person3 = new Person(16, "Diego");   //Creating 2 more people
        // Person person4 = new Person(16, "Diego");   //Creating 2 more people

        System.out.println(person1.name);
        System.out.println(person1.age);

        System.out.println(person2.name);
        System.out.println(person2.age);

        System.out.println(person1.numberOfPeople);
        System.out.println(person2.numberOfPeople);

        System.out.println(person2.numberOfPeopleButNonstatic);
        System.out.println(person2.numberOfPeopleButNonstatic);


        /*************** ARRAYS ***************/
        //2 ways declaring an array
        int[] arr1 = new int[10];           
        int[] arr2 = {8,2,4,6,7,8};
    }
}