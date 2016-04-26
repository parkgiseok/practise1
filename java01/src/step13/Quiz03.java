/* 주어진 수의 약수를 모두 출력하시오
72  --> 1, 2, 3, 4, 6, 8, 9, 12, 18, 24, 36, 72
*/
package step13;
public class Quiz03{
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);

    for (int i = 1; i <= a; i++) {
      if (a % i == 0) {
        System.out.println(i);
      }
    }
  }
}
