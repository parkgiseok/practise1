/* 주제: 스태틱 변수에 접근 */
package step12;

public class Exam02 {
  static int staticValue = 10;

  public void instanceMethod() {
    // 스태틱 변수는 클래스 이름으로 접근할 수 있다.
    Exam01.staticValue = 1000; // OK!

    // 만약 메서드가 스태틱 변수와 같은 클래스에 있다면,
    // 클래스명 생략 가능
    staticValue = 2000; // ok!!
  }

  static {
    Exam01.staticValue = 3000;  // ok!!
    staticValue = 4000; // ok!!
  }

  public static void main(String[] args) {
    Exam01.staticValue = 5000;  // ok!!
    staticValue = 6000; // ok!!

    System.out.println(staticValue);
    System.out.println(Exam01.staticValue);


  }
}
/*
스태틱 블록 실행 순서
1) 클래스 로딩
2) 스태틱 변수 준비
3) 스태틱 변수의 초기화 문장 실행
4) 스태틱 블록 실행

*/
