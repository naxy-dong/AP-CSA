class Main {
    public static void main(String[] args) {
      //Create four students (with fake emails) 
      Student s1 = new Student("John","John4399@gmail.com");
      Student s2 = new Student("Joe","Joe1010@gmail.com");
      Student s3 = new Student("Dick","Dick96@gmail.com");
      Student s4 = new Student("David", "David123@gmail.com");
      //print out the student info for each student
      s1.print();
      s2.print();
      s3.print();
      s4.print();
      //change the of emails to their nycstudents.net email
      s1.setEmail("John4399@nycstudents.net");
      s2.setEmail("Joe1010@nycstudents.net");
      s3.setEmail("Dick96@nycstudents.net");
      s4.setEmail("David123@nycstudents.net");
      //change the names so they have the format first name, last name
      s1.setName("John Doe");
      s2.setName("Joe Nani");
      s3.setName("Dick Thunder");
      s4.setName("David Truman");
      //test out the toString() method
    }
  }