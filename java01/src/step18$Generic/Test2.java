package step18$Generic;

public class Test2 {
  public static void main(String[] args) {
    Bucket2 p = new Bucket2();



    p.value = "ok";
    // p.value = new Integer(20); // error
    // p.value = new Float(3.14f); // error
    // p.value = new java.util.Date(); // error
    System.out.println(p.value);

  }
}
/* 요구사항
- 특정 프로젝트에서는 한 가지 타입의 인스턴스만 저장하고 싶다.
- String만 저장하고싶다.
- 해결책?
  Bucket의 value 변수를 String으로 선언한다. --> Bucket2 클래스 추가

- 질문 : 그냥 기존의 Bucket을 사용하면서 value에 String만 저장하면 되지 않을까?
         개발자가 조심히 사용하면 되는 거 아닌가?
- 답변 : 사람은 늘 실수를 한다. => 용도대로 사용하지 않는다.
      => String만 넣기로 해놓고 다른 타입의 인스턴스를 저장할 떄도 있다.
      => Bucket의 value는 Object 타입이기 때문에 문법적 오류가 아니다
      => 컴파일 오류가 발생하지 않는다.
      => 그래서 String만 넣을 수 있는 Bucket2 클래스를 작성할 필요가 있었다.
      => 이 클래스의 value는 string타입이기 때문에 다른 타입의
         인스턴스 주소를 넣으면 컴파일 오류가 발생한다.
      => 용도대로 사용하지 않았을 때 컴파일 단계에서 오류를 띄워주면
         프로그램을 좀 더 안정적으로 개발할 수 있다.
      => 그래서 Bucket2를 만든 것이다.

# 프로젝트 마다 Bucket에 저장하는 데이터가 다를 수 있다.

*/
