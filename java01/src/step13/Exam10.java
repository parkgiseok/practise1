// 주제 : final2
package step13;

public class Exam10 {
  static final int a = 20;
  
  public static void main(String[] args){
    // a = 20; // error

    System.out.println(a);

  }
}

/* 스태틱 변수에 final 붙임
- 클래스가 로딩되면 스태틱 메모리가 준비된다.
- 그리고 자동으로 0으로 초기화된다.
=> 이미 0으로 한 번 값이 할당 되었기 때문에 main에서 오류 발생!



*/
