/* 주제: 연산자 우선순위 */
package step04;

public class Exam12 {
  public static void main(String[] args) {
    int v1 = 3 + 4 * 5;
    System.out.println(v1);  // 23

    int v2 = (3 + 4) * 5;
    System.out.println(v2);  // 35

    /* 연산자 우선순위
    1 : ()
    2 : *, /, %
    3 : +, -
    */


  }
}
