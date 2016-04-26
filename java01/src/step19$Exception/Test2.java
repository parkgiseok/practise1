// 주제 : 예외 처리 후
package step19$Exception;

public class Test2 {
  public static void main(String[] args) {
    Calculator1 calc = new Calculator1();
    calc.plus(10);

    // 예외 상황을 일으킬 수 있는 코드를
    // try {} 블록 안에 둔다.
    // 예외 상황을 처리하는 코드를
    // catch {} 블록 안에 둔다.
    try {
    calc.divide(2); // 0일 땐 catch가 실행, 2일 땐 정상 실행
    System.out.println("----------------");
    System.out.println(calc.result);
    System.out.println("----------------");
    } catch (ArithmeticException e) {  // 앞에 java.lang.은 자동 import라서 생략
      // java.lang.ArithmeticException은 오류 메세지에서 복붙함
      // 다형적 변수에 입각해서 ArithmeticException대신 Object를 사용해도 된다.
      // 하지만 코드 가독성 측면에서 아쉬움이 있다.
      // e 레퍼런스는 예외 정보를 저장하고 있다.
      System.out.println("나누기 오류 발생!");
    }
  }
}
/*
# 예외 처리 문법
try {
  명령
} catch (예외타입 변수) {
  예외 처리 코드
}
=> try 블록 안에 있는 명령을 실행하다가 오류가 발생한다.
=> 즉시 실행을 멈추고 catch 블록으로 이동한다.
=> 이때 오류 내용은 인스턴스에 저장되어 있는데,
   catch의 파라미터로 그 인스턴스가 넘어온다.
   당연히, 오류의 타입에 따라 구분하여 파라미터를 선언해야 한다.
=> catch 블록을 실행한다.
=> 그리고 다음 명령을 계속 실행한다.
   => "예외가 발생했다고 해서 결코 멈추지 않는다" (중요)

# 예외 처리의 미션
- 시스템에 예외가 발생하더라도 멈추지 않고 계속 실행하게 만드는 것.

# 예외 처리의 비전
- 예외의 관리를 용이하게 하는 것.
  => 기존 방식은 일반 코드와 예외를 처리하는 코드가
     섞여 있어서 코드 가독성이 떨어졌다.
  => 일반 코드에서 예외 처리 코드를 분리하여 표현한다.
     => 코드의 가독성을 높힌다.
*/
