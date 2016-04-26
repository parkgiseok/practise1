package quiz;
//출처: codefights.com
//한 줄에 버그가 있다. 고쳐라!
/*
Year is leap if its number is divisible by 4 and isn't divisible by 100
or if its number is divisible by 400. Determine if a given year is leap or not.
[input] integer year
number of the year
[output] boolean
true if the given year is leap, false otherwise
 */
public class Test018 {
  public static void main(String[] args) {
    int leapYear = 1000;
    boolean found = false;

      if (leapYear % 4 == 0 && leapYear % 100 == 0 || leapYear % 400 == 0) {
        //   if (year % 4 == 0 && year % 100 != 0 || year % 400 != 0) {
        found = true;

      }
      System.out.println(found);
    }
}
