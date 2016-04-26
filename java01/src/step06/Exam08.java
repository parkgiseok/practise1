/* 주제: 가변 개수의 파라미터 선언을 여러개 할 수 있는가? */
package step06;

public class Exam08 {
  
  // 다음과 같이 가변 개수 파라미터를 여러 개 선언할 수 없다.
  // static int plus(int... a, boolean... s) {  // 컴파일 오류!
  static int plus(String s, int... a) {
    int sum = 0;
    for (int v : a) {
      sum += v;
    }
    return sum;
  }
  
  public static void main(String[] args) {
    System.out.println(plus("문자열"));
    System.out.println(plus("문자열",10));
    System.out.println(plus("문자열",10, 20));
    System.out.println(plus("문자열",10, 20, 30));



  }
}
