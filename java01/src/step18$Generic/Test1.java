package step18$Generic;

public class Test1 {
  public static void main(String[] args) {
    Bucket p = new Bucket();
    p.value = new String("okok");

    String s = (String)p.value;

  }
}
/*
# Object 레퍼런스 변수
장점 >
- 모든 인스턴스의 주소를 담을 수 있다.

단점 >
- 매번 꺼내 쓸 때마다 원래의 타입으로 캐스팅 해야하는 번거로움이 있다.

*/
