package quiz;
//copyright by codefights.com
//한 줄에 버그가 있다. 고쳐라!
/*
Map the given integer to a month.
Example
getMonthName(1) = "Jan"
getMonthName(0) = "invalid month"
[input] integer mo
a non-negative integer
[output] string
a 3 letter abbreviation of month number mo or "invalid month"
if the month doesn't exist
정수값 써서 몇 월인지 출력하기
 */
public class Test025 {
  	public static void main(String[] args) {
  		int getMonthName = 1;
  		// int getMonthName1 = 0;
  		getMonthName -= 1;
  		String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
  							  "Aug", "Sep", "Oct", "Nov", "Dec"};
  			if (getMonthName >= 0) {
  				// if (mo < months.length) {
  				System.out.println(months[getMonthName]);
  			} else {
  				System.out.println("invalid month");
  			}
  	}
  }
