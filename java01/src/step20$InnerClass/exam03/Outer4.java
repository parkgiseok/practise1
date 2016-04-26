// 주제 : local inner class 선언
package step20$InnerClass.exam03;

public class Outer4 {
  int no;

  void m() { // local 중첩 클래스 -> 메서드에서만 사용되고나서 버려진다.
    //=> m() 메서드 안에서만 사용할 수 있다.
    class Inner {
      /* local inner class도 static 메서드를 선언할 수 없다.
      public static void m() {
        System.out.println("Inner.m()");
      }
      */
      public void m2() {
        System.out.println("Inner.m2()");
      }
    }
    Inner p = new Inner();
    p.m2();
  }
}
