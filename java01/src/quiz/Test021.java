package quiz;
//copyright by codefights.com
//한 줄에 버그가 있다. 고쳐라!
/*
Given a number and a range, find the largest integer
within the given range that's divisible by the given number.
[input] integer left
the left bound of the given range
[input] integer right
the right bound of the given range, left <= right
[input] integer divisor
a non-zero integer
[output] integer
maximal integer in the range [left, right] which is divisible
by divisor or -1 if there in no such number
 */
public class Test021 {
  public static void main(String[] args) {
		int[] values = {2, 17, 4};
			for (int i = values[1]; i >= values[0]; i--) {
				// for (int i = values[0]; i <= values[1]; i--) {
				if (i % values[2] == 0) {
					System.out.println(i);
					break;
				} else if (i > values[1]) {
					System.out.println("-1");
				}
			}
	}
}
