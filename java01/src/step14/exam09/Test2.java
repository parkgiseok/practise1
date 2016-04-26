// 주제 : 수퍼 클래스의 다른 생성자를 호출하는 상황!
package step14.exam09;

public class Test2 {
  public static void main(String[] args) {
    B2 p = new B2();
    System.out.println(p.v1);
    System.out.println(p.v2);
    System.out.println(p.v3);
    System.out.println(p.v4);
    System.out.println(p.v5);

  }
}
/*
A(String)의 생성자 -------------
B의 생성자 -------------
오호라
10
false
3.14
가

*/
