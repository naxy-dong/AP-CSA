class Main 
{
  public static void main(String[] args) 
  {
    //confirms that isLeapYear() works
    //Returns true or false if the year is a leap
    System.out.println("Is 1700 a leap year?  " + APCalendar.isLeapYear(1700));
    System.out.println("Is 2001 a leap year?  " + APCalendar.isLeapYear(2001));
    System.out.println("Is 1984 a leap year?  " + APCalendar.isLeapYear(1984));
    System.out.println("Is 12384 a leap year? " + APCalendar.isLeapYear(12384));

    System.out.println("");

    //Shows numberOfLeapYears() works
    //Returns the number of leap years between year1 and year2
    System.out.println("How many leap years between 1700 and 1800? " + APCalendar.numberOfLeapYears(1700,1800));
    System.out.println("How many leap years between 1900 and 2000? " + APCalendar.numberOfLeapYears(1900,2000));
    System.out.println("How many leap years between 1000 and 2000? " + APCalendar.numberOfLeapYears(1000,2000));

    System.out.println("");

    //Shows dayOfYear() works. 
    //returns the day of the year that that date is
    System.out.println("What day of the year is 12/31/1700? " + APCalendar.dayOfYear(12,31,1700));
    System.out.println("What day of the year is 12/31/2001? " + APCalendar.dayOfYear(12,31,2001));
    System.out.println("What day of the year is 12/31/1984? " + APCalendar.dayOfYear(12,31,1984));
    System.out.println("What day of the year is 2/1/1984?   " + APCalendar.dayOfYear(2,1,1984));
    System.out.println("What day of the year is 1/1/20132?  " + APCalendar.dayOfYear(1,1,20132));


    System.out.println("");

    //shows that firstDayOfYear() works
    //return what day of week 0=Sunday to 6=Saturday that 1/1 is in the given year
    System.out.println("What week day is the first day of the year in 2000?  " + APCalendar.firstDayOfYear(2000));
    System.out.println("What week day is the first day of the year in 2019?  " + APCalendar.firstDayOfYear(2019));
    System.out.println("What week day is the first day of the year in 2020?  " + APCalendar.firstDayOfYear(2020));
    System.out.println("What week day is the first day of the year in 2021?  " + APCalendar.firstDayOfYear(2021));

    System.out.println("");

    //Shows that dayOfWeek() works
    //Using same logic as above finds what day of the week from 0-6 that any day of any year is
    System.out.println("What day of the week is 1/4/1970?   " + APCalendar.dayOfWeek(1,4,1970));
    System.out.println("What day of the week is 2/20/1865?  " + APCalendar.dayOfWeek(2,20,1865));
    System.out.println("What day of the week is 3/14/2000?  " + APCalendar.dayOfWeek(3,14,2000));
    System.out.println("What day of the week is 8/28/2021?  " + APCalendar.dayOfWeek(8,28,2021));
    System.out.println("What day of the week is 12/23/2020? " + APCalendar.dayOfWeek(12,23,2020));

  }
}