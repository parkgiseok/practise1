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
public class Test17 {
  static int maximalEven(int[] inputArray) {
    int answer = inputArray[0];
    for (int i = 0; i < inputArray.length; i++) {
      if (inputArray[i] > answer) {
        //   if (inputArray[i] % 2 == 0 && inputArray[i] > answer) {
        answer = inputArray[i];
      }
    }
    return answer;
  }
  public static void main(String[] args) {
    System.out.println(maximalEven(new int[]{7, 2, 10, 11, 15, 17, 1, 0, 5}));
    //expected output
    //17
  }
}
