package quiz;
// 출처: codefights.com
// 한 줄에 버그가 있다. 고쳐라!
/*
Given an integer n, find the number of trailing zeros
in the decimal representation of n!
(the exclamation mark means factorial).
Example
for n = 10 output should be 2
[input] integer n
a positive integer
[output] integer
*/
public class Test07 {
  public static void main(String[] args) {
    int factorialTrailingZeros = 10;
    int result = 0;

    for (int i = 5; i <= factorialTrailingZeros; i += 5)
    {
      int num = i;
      while (num % 5 == 0)
      {
        num /= 5;
        result++;
      }
    }
    System.out.println(result);
  }
}
