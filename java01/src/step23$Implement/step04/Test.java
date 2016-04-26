// 주제 : HelloJp처럼 이미 다른 클래스를 상속 받는 경우 해결책!
// => 기존에 상속받는 클래스 대신 AbstractHello를 상속 받게 한다.
//    그리고 기존에 상속받았던 기능은 다른 방식으로 처리한다
// => HelloJp 클래스 개편!
//
// # 문제점
// => 그나마 HelloJp처럼 클래스의 크기가 작을 때는 소스코드 개편이 가능하지만,
//    실무에서는 이렇게 간단치가 않다.
// => 기존의 클래스를 상속 받은 후 많은 코드가 추가된 경우에는
//    HelloJp처럼 기존 상속을 포기할 수 없다.
package step23$Implement.step04;

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

    } else if ("jp".equals(lang)) {
      obj = new HelloJp();
      // sayHello() -> 규칙이 없으니 메서드를 마음대로 만든다.
      // 문제는 메서드 이름이 다르니 이 메서드를 호출하는 개발자가 번거롭다.

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
