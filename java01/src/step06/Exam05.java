/* 주제: class 문법을 이용하여 여러 개의 메서드를 묶기 */
package step06;
public class Exam05 {
  static int plus(int a, int b) {
    return a + b;
  }
  static int minus(int a, int b) {
    return a - b;
  }
  static int multiple(int a, int b) {
    return a * b;
  }
  static int divide(int a, int b) {
    return a / b;
  }

  public static void main(String[] args) {
    System.out.println(plus(10, 20));
    System.out.println(minus(10, 20));
    System.out.println(multiple(10, 5));
    System.out.println(divide(10, 2));

  }
}
