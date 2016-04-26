package quiz;
//copyright by codefights.com
//한 줄에 버그가 있다. 고쳐라!
/*
Reverse an array
Example
myReverse([1, 3, 2]) = [2, 3, 1]
[input] array.integer input
[output] array.integer
배열 숫자들 뒤집기
 */
public class Test26 {
  public static void main(String[] args) {
		int[] myReverse = {9,8,7,6,5,4,3,2,1};

		for (int i = 0; i * 2 < myReverse.length; i++) {
			int tmp = myReverse[i];
			myReverse[i] = myReverse[myReverse.length - i - 1];
			//input[i] = input[input.length - i];
			myReverse[myReverse.length - i - 1] = tmp;
		}
		for (int tmp : myReverse) {
			System.out.print(tmp + ",");
		  }
	}
}
