package step18$Generic;

public class Test5 {
  public static void main(String[] args) {
    Bucket5 p = new Bucket5();
    // p.value = new String("okok"); // error
    // p.value = new Integer(20); // error
    p.value = new Float(3.14f);
    // p.value = new java.util.Date(); // error

  }
}
/* 요구사항
- 이번 프로젝트는 Bucket에 Float 인스턴스만 저장하기로 했다.
- 물론, 개발자의 실수를 방지하도록 문법적으로 막아야 한다.
- 해결책?
  => 좀 귀찮지만 Bucket5를 만들어 Float으로 저장하도록 만든다.
     쯥~~~
     참자... 인내하자.............
- 질문 :
=> 만약 나중에 내가 임의적으로 만든 클래스의 인스턴스르 저장하려 한다면,
   또 새로운 Bucket을 생성해야 하나요?
=> 만약 생성해야 한다면 도대체 얼마나 많은 버킷을 만들어야 하나요?

답변 :
- 예
- 아주 많이..

대안책 >
- 한개의 클래스로 다양한 타입의 대응할 수 있는 문법이 필요!
- "Generic" 등장!!!!!!!!!!!!!!!!

설명 >
- 소프트웨어의 규모는 점점 커지고 있다.
- 대단위의 사람들이 함께 같은 소스를 편집하는 경우가 많다.
- 문법을 제대로 사용하는 지 감시하기가 점점 힘들어진다.
- 가능한 개발자의 실수를 최대한 막을 수 있는 문법이 필요하다.

*/
