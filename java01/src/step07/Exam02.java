/* 주제: 클래스 공용 변수 사용 */
package step07;
public class Exam02 {

  public static void main(String[] args) {
    // 1) 클래스 공용 변수 사용전
    // => 2 * 3 + 6 - 7 = ?
    int a = Calculator.multiple(2, 3);
    a = Calculator.plus(a, 6);
    a = Calculator.minus(a, 7);
    System.out.println(a);

    // 2) 클래스 공용 변수 사용 후
    Calculator2.result = 2; // 사용 전 초기화
    Calculator2.multiple(3);
    Calculator2.plus(6);
    Calculator2.minus(7);
    System.out.println(Calculator2.result);

  }
}

/*

 */
