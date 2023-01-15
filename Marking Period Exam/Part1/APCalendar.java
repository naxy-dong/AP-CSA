public class APCalendar
{

/** Returns true if year is a leap year and false otherwise. */
public static boolean isLeapYear(int year)
{ 
  if (year%400==0)
    return true;
  else if (year%100==0)
    return false;
  else if (year%4==0)
    return true;
  else
    return false;
}

/** Returns the number of leap years between year1 and year2, inclusive.
* Precondition: 0 <= year1 <= year2
*/

public static int numberOfLeapYears(int year1, int year2)
{ 
  int numLeap=0;
  for (int i = year1; i<=year2; i++)
  {
    if (isLeapYear(i))
    {
      numLeap++;
    }
  }

  return numLeap;
}

/** Returns n, where month, day, and year specify the nth day of the year.
* Returns 1 for January 1 (month = 1, day = 1) of any year.
* Precondition: The date represented by month, day, year is a valid date.
*/
public static int dayOfYear(int month, int day, int year)
{ 
  int[] months = {0,31,28,31,30,31,30,31,31,30,31,30,31};
  int days = 0;
  for (int i = 0; i < month; i++)
  {
    days += months[i];
  }
  if (isLeapYear(year) && month>2)
  {
    days++;
  }
  return days+day;
}

/** Returns the value representing the day of the week for the first day of year,
* where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday.
*/
public static int firstDayOfYear(int year)
{
  int lastTwo = year%100-1;
  if (lastTwo<0) { lastTwo = 0;}
  int firstTwo = year/100;
  int f = (1 + ((13*11-1)/5) + lastTwo + (lastTwo/4) + (firstTwo/4) - 2*firstTwo);
  return Math.abs(f%7);
}


/** Returns the value representing the day of the week for the given date
* (month, day, year), where 0 denotes Sunday, 1 denotes Monday, ...,
* and 6 denotes Saturday.
* Precondition: The date represented by month, day, year is a valid date.
*/
public static int dayOfWeek(int month, int day, int year)
{ 
  int startDay = firstDayOfYear(year);
  int dayOfYear = dayOfYear(month,day,year);
  int leftover = (dayOfYear-1)%7; 
  return (startDay+leftover)%7;
}
}