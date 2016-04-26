// 기존의 클래스를 상속 받아서 메서드 추가하기
/*
class 내클래스 extends 기존클래스 {
  ...
}
용어 정리 :
- 기존 클래스를 "super class" 또는 "parent class"라 부른다.
- 확장하는 클래스를 "sub class"또는 "child class"라 부른다.

*/
package step14;

public class Calculator2 extends Calculator {
  // 메서드 추가
  public void remainder(int a) {
    this.result %= a;
  }

  // protected : 같은 패키지와 자식 클래스는 접근 가능
  protected int abs() {
    return (result < 0) ? -result : result;
  }

  // (default) : 같은 패키지만 접근 가능
  int abs2() {
    return (result < 0) ? -result : result;
  }

  // private : 오로지 클래스 안에서만 접근 가능
  private int abs3() {
    return (result < 0) ? -result : result;
  }


}
