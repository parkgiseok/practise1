package step14.exam07;

public class B extends A {
    float v4 = 3.14f;
    char v5;

    public B() {
      // 수퍼 클래스의 어떤 생성자를 실행할지 지정하지 않으면,
      // 다음과 같이 수퍼 클래스의 기본 생성자를 호출하는 코드가
      // 적지 않아도 자동으로 삽입된다.
      // super();

      System.out.println("B의 생성자 -------------");
      v1 = "현아";
      v3 = false;
      v5 = '가';
    }

}
