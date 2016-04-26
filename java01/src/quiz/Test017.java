package quiz;
//출처: codefights.com
//한 줄에 버그가 있다. 고쳐라!
/*
Pick-out the largest even number from an array of integers
Example
maximalEven([4, 3, 6, 8, 2, 4]) = 8
[input] array.integer inputArray
an array of positive integers, it's guaranteed
that inputArray contains at least one even integer
[output] integer
maximal even element of inputArray
*/
public class Test017 {
  public static void main(String[] args) {
		int[] maximalEven = {7, 2, 10, 11, 15, 17, 19, 0, 5};  // 17
		int answer = maximalEven[0];

			for (int i = 0; i < maximalEven.length; i++) {
				if (maximalEven[i] > answer) {
					//   if (inputArray[i] % 2 == 0 && inputArray[i] > answer) {
					answer = maximalEven[i];
				}
			}
			System.out.println(answer);
	  }
}
