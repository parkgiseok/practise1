// 주제: 상속을 이용하여 호출 규칙을 정의한다.
// => Hello, HelloEn의 공통 메서드인 greet()를 뽑아서,
//    AbstractHello라는 추상 클래스를 정의한다.
// => 이제 인사말을 생성하는 클래스는 반드시 AbstractHello의
//    서브 클래스가 되도록 강제한다.
//    이유?
//    AbstractHello의 서브 클래스는 greet() 메서드를 가질 것이기 때문이다.
// => 작업순서
// 1) Hello와 HelloEn 클래스의 공통점을 식별하여 수퍼 클래스로 정의한다.
//   => AbstractHello 추상 클래스 작성
//   => Hello, HelloEn을 이 클래스의 서브 클래스로 만든다.
// 2) AbstractHello의 서브 클래스만 사용하려면,
//   => 레퍼런스 변수를 AbstractHello로 선언하라!
//
// # 문제점
// => HelloJp는 이미 ArrayList를 상속받고 있기 때문에
//    이 구조로 개편할 수 없다.
// => 해결책?
//    step04를 참고하라!

package step23$Implement.step03;

public class Test {
  public static void main(String[] args) {
    // JVM 옵션 : -Dlang=값
    // ex> java -cp bin -Dlang=en step23.exam01.Test
    // 값 => en, ko
    // null => ko
    String lang = System.getProperty("lang");

    String message = null;
    AbstractHello obj = null; // (참조변수)레퍼런스 변수를 이용하여
    // 인사말을 리턴할 객체의 타입을 한정한다.
    if ("en".equals(lang)) {
      obj = new HelloEn(); // AbstractHello의 서브 클래스가 아니면 컴파일 오류!
      // 즉, AbstractHello의 규칙을 따르지 않은 클래스를 사용하려 한다면
      // 컴파일 오류가 발생한다!
      // => 이런 방식(수퍼 클래스를 통한)으로 호출 규칙을 제어할 수 있다.

    } else {
      obj = new Hello(); // 제약
    }

    // 어떤 객체인지 모르겠지만 그 객체는 AbstractHello의 서브 클래스이기 때문에
    // 반드시 greet()라는 메서드가 있을것이다.
    // => 바로 이것이 상속을 이용한 호츌 규칙을 제한하는 방법이다.
    message = obj.greet();
    System.out.println(message);
  }
}
