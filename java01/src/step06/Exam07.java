/* 주제: 가변 개수의 파라미터 선언 순서  */
package step06;

public class Exam07 {
  
  // 가변 개수 파라미터는 반드시 마지막에 선언해야 한다.
  // static int plus(int... a, String s) { // 컴파일 오류!!
  static int plus(String s, int... a) { 
    // 파라미터 값 꺼내기 -> 배열처럼 사용한다.
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
