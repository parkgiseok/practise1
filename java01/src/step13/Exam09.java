// 주제 : final
package step13;

public class Exam09 {
  public static void main(String[] args){
    int a;
    final int b;  // final로 선언되면 오직 한 번만 할당할 수 있다.

    a = 20;
    b = 20; // ok

    a = 30;
    // b = 30;  // error
    System.out.println(a);
    System.out.println(b);

  }
}

/* 로컬 변수에 final 붙임
- 한 번만 할당할 수 있다.


*/
