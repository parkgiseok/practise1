// 주제 : member inner class 선언
package step20$InnerClass.exam03;

public class Outer3 {
  int no;

  void m() {
    System.out.println("Outer2.m()");
  }

  class Inner {
    /* member inner class는 static 메서드를 선언할 수 없다.
    public static void m() {
      System.out.println("Inner.m()");
    }
    */
    public void m2() {
      System.out.println("Inner.m2()");
    }
  }
}
