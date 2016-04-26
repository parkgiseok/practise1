package quiz;
//copyright by codefights.com
//한 줄에 버그가 있다. 고쳐라!
/*
Find the largest number from the given three integers
[input] integer a
[input] integer b
[input] integer c
[output] integer
max of a,b and c
배열에서 가장 큰 정수 찾기
 */
public class Test022 {
  public static void main(String[] args) {
    int[] MaxOfThree = {1,2,3};
      if (MaxOfThree[0] > MaxOfThree[1]) {
        if (MaxOfThree[0] > MaxOfThree[2]) {
          System.out.println(MaxOfThree[0]);
        }  // return MaxOfThree[1];
      }
      if (MaxOfThree[1] > MaxOfThree[2]) {
        System.out.println(MaxOfThree[1]);
      }
      System.out.println(MaxOfThree[2]);
    }
}
