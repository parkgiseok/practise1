package step20$InnerClass.exam03;

public class Outer1 {
  
  // 1) top level Inner class
  // => static 멤버이다.
  // => 클래스 이름으로 사용 가능.
  static class TopLevelInner {
  }

  // 2) member inner Class
  // => instance 멤버이다.
  // => 인스턴스가 있어야만 사용 가능.
  class MemberlInner {
  }

  public void m() {
    // 3) local inner Class
    // => 메서드의 로컬 변수처럼 메서드 안에서만 사용 가능.
    class LocalInner {
    }
  }

  // 4) anonymous inner Class
  // => 클래스 이름이 없기 때문에 클래스 선언과 동시에 인스턴스를 생성해야한다.
  // => 문법
  // => new [수퍼클래스||인터페이스](생성자파라미터값,생성자파라미터값,....) {
  // 클래스 멤버 선언
  // };
  Object obj = new Object() {
    public void m() {}
  };

}
