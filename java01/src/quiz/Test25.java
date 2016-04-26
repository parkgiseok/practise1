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
public class Test25 {
  static String getMonthName(int mo) {
    mo -= 1;
    String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
        "Aug", "Sep", "Oct", "Nov", "Dec"};
    if (mo >= 0) {  // if (mo < months.length) {
      return months[mo];
    } else {
      return "invalid month";
    }
  }
  public static void main(String[] args) {
    System.out.println(getMonthName(1)); // 결과는 Jan이어야 함.
    System.out.println(getMonthName(0)); // 결과는 invalid month이어야 함.
  }
}
