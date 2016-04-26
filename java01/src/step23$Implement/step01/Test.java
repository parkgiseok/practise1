// 주제 : 인터페이스 사용 전
// => 언어 별로 인사말을 생성해주는 클래스를 사용하여,
//    인사말을 출력하는 프로그램을 작성한다.
// => 한국어와 영어로 인사말을 생성하는 클래스를 작성한다.
//    한국어 : Hello
//    영어 : HelloEn

package step23$Implement.step01;

public class Test {
  public static void main(String[] args) {
    // JVM 옵션 : -Dlang=값
    // ex> java -cp bin -Dlang=en step23.exam01.Test
    // 값 => en, ko
    // null => ko
    String lang = System.getProperty("lang");

    String message = null;
    if ("en".equals(lang)) { // String str = "en"; 스트링 인스턴스 주소를 가짐
      HelloEn obj = new HelloEn();
      message = obj.greet();

    } else {
      Hello obj = new Hello();
      message = obj.greet();
    }

    System.out.println(message);
  }
}
