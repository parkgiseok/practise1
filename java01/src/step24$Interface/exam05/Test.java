package step24$Interface.exam05;

public class Test implements A, B {
  public void m1() {
    // 인터페이스의 모든 필드는 public final이다.

    System.out.println(WOMAN);

    // WOMAN = 20; // error: cannot assign a value to final variable WOMAN
    int WOMAN = 30;

    System.out.println(A.MAN);
    System.out.println(A.WOMAN);
    System.out.println(WOMAN);

    // System.out.println(MAN); // error: reference to MAN is ambiguous
    // A의 MAN과 B의 MAN을 구분할 수 없다.

    // 구현한 인터페이스에 동일한 이름의 변수가 있을떄는
    // 인터페이스 이름을 명시하여 명확하게 구분해야 한다.
    System.out.println(B.MAN);
    System.out.println(GIRL);
    System.out.println("m1().....");
  }

  public static void main(String[] args) {
    Test p = new Test();
    p.m1();

  }
}

/*

*/
