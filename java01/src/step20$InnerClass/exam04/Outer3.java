// 주제 :
package step20$InnerClass.exam04;

public class Outer3 {
  int no = 20;
  int ok = 1000;
  public void m1() {
    System.out.println(Outer3.this.no); // 이게 원칙 결과 = 20
    System.out.println(this.no); // 클래스명 생략가능
    System.out.println(no); // 같은 이름을 갖는 로컬 변수가 없다면, this 생략
    System.out.println("Outer3.m1()...");
  }

  public void m2() {
    class Inner {
      int no = 100;
      public void test(int no) {
        System.out.println(no);  // 8888
        System.out.println(this.no);  // 100
        System.out.println(Inner.this.no);  // 100
        System.out.println(ok);  // 1000

        // 바깥 클래스의 인스턴스 변수에 접근하고 싶다.
        // 바깥클래스명.this.인스턴스변수
        System.out.println(Outer3.this.no);  // 20
      }
    }

    Inner p = new Inner();
    p.test(8888);
    Outer3.this.m1();
  }
}
// 안드로이드에서 꼭 쓰인다 ==================================================
