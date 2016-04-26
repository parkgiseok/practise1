package quiz;
//copyright by codefights.com
//한 줄에 버그가 있다. 고쳐라!
/*
Find the largest digit of the given number.
[input] integer n
non-negative integer
[output] integer
largest digit of n
정수값에서 가장 큰 한자리 수를 찾아라
 */
public class Test023 {
  public static void main(String[] args) {
		int maxDigit = 736;
		int result = 0;
			while (maxDigit > 0) {  // while (n >= 0) {
				result = Math.max(result, maxDigit % 10);
				maxDigit /= 10;
			}
			System.out.println(result);
	}
}
