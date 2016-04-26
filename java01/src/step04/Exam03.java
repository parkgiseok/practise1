/* 주제: 논리 연산자 사용 */
package step04;

public class Exam03 {
  public static void main(String[] args) {
    // AND 연산자 : 두 개의 피연산자가 모두 true일때 결과는 true이다.
    System.out.printf("true && true ? %b\n", true && true);
    System.out.printf("true && false ? %b\n", true && false);
    System.out.printf("false && true ? %b\n", false && true);
    System.out.printf("false && false ? %b\n", false && false);
    System.out.println("--------------------------------------");
    // 하나라도 false면 false

    // OR 연산자 : 두 개의 피연사자 중 한 개라도 true이면 결과는 true이다.
    System.out.printf("true || true ? %b\n", true || true);
    System.out.printf("true || false ? %b\n", true || false);
    System.out.printf("false || true ? %b\n", false || true);
    System.out.printf("false || false ? %b\n", false || false);
    // 하나라도 true면 true

/*
true && true ? true
true && false ? false
false && true ? false
false && false ? false
--------------------------------------
true || true ? true
true || false ? true
false || true ? true
false || false ? false
*/
  }
}
