package quiz;

//출처: codefights.com
//한 줄에 버그가 있다. 고쳐라!
/*
Given first two elements of an arithmetic progression, find its n-th element.
[input] integer element1
1st element of the arithmetic progression
[input] integer element2
2nd element of the arithmetic progression
[input] integer n
positive integer
[output] integer
n-th element of the arithmetic progression
첫 번째와 두 번째 수가 등차수열, 세 번째 수의 값을 구하라
 */
public class Test09 {
  public static void main(String[] args) {
    int[] arithmeticProgression = {2, 5, 5}; // 2, 5, 8, 11, 14
    int result = (arithmeticProgression[0] +
                  (arithmeticProgression[1] - arithmeticProgression[0])
                  * (arithmeticProgression[2] - 1));
    System.out.println(result);
  }
}
