// 주제 : 수퍼 클래스의 생성자 호출 확인
package step14.exam08;

public class Test {
  public static void main(String[] args) {
    B p = new B();
    System.out.println(p.v1);
    System.out.println(p.v2);
    System.out.println(p.v3);
    System.out.println(p.v4);
    System.out.println(p.v5);

  }
}
/*
new B(); 에서 인스턴스 생성 절차
1) A 클래스의 인스턴스 메모리 준비
   v1 [null ]
   v2 [0    ]
   v3 [false]
2) B 클래스의 인스턴스 메모리 준비
   v1 [null  ]
   v2 [0     ]
   v3 [false ]
   v4 [0f    ]
   v5 [\u0000]
3) B 클래스의 생성자 실행
  => super(); -->  4) A 클래스의 생성자 실행
                      super(); --> 5) Object의 생성자 실행
                      6) A의 생성자를 실행
  7) B의 생성자 실행
8) B의 인스턴스 값 출력


*/
