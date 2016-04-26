/*
출처: codefights.com

주어진 숫자에 짝수가 몇 개인지 세어라.
예)
1010 => 2
123 => 1

한 줄에 버그가 있다. 고쳐라!

*/
package quiz;
public class Test01 {
  public static void main(String[] args) {
    int n = 1238694636;

    int result = 0;
    while(n != 0) {
      if ((n % 2) == 0) {
        result++;
      }
      n /= 10;  // n %= 10;
    }

    System.out.println(result);
  }
}
