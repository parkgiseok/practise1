// 주제 : 하위 클래스에서 부모 클래스의 protected 맴버에 접근하기
package step14.exam10;

import step14.Calculator2;

public class ChildCalc extends Calculator2 {
  public void testAccess() {
    // 1) public 맴버에 접근하기
    this.remainder(3);

    // 2) (default) 맴버에 접근하기
    // this.abs2(); // 접근 불가 오류!!

    // 3) protected 맴버에 접근하기
    this.abs();

    // 4) private 맴버에 접근하기
    // this.abs3(); // 접근 불가 오류!!
  }
}
/*
캡슐화 접근 관리
private : 그 클래스 내부에서만 접근 가능
(default) : 같은 패키지에 소속된 클래스만이 접근 가능
protected : 같은 패키지 + 자식 클래스 접근 가능
public : 모두 접근 가능
*/
