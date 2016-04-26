/* 문제 :
개인이 좋아하는 영화 장르를 저장하고 출력하는 프로그램을 작성하라.
=> 각 장르를 선호 여부를 표현할 때 비트 표현할 것!
=> 비트 연산자를 이용하여 검사할 것.
=> 참고 예제 : Exam06.java

=>장르 :
범죄, 드라마, 코미디, 로맨스, 스릴러,
가족, 판타지, 액션, SF, 애니매이션, 다큐멘터리, 공포

=>테스트 데이터 :
홍길동이 좋아하는 장르 : 드라마, 액션, SF, 다큐멘터리

*/

package step04;

public class quiz01{
  public static void main(String[] args){

    int like = 0b0_1000_0011_0100;

    int a = 0b1_0000_0000_0000;
    int b = 0b0_1000_0000_0000;
    int c = 0b0_0100_0000_0000;
    int d = 0b0_0010_0000_0000;
    int e = 0b0_0001_0000_0000;
    int f = 0b0_0000_1000_0000;
    int g = 0b0_0000_0100_0000;
    int h = 0b0_0000_0010_0000;
    int i = 0b0_0000_0001_0000;
    int j = 0b0_0000_0000_1000;
    int k = 0b0_0000_0000_0100;
    int l = 0b0_0000_0000_0010;

    if ((like & a) == a)
    System.out.println("홍길동이 좋아하는 장르 : 범죄");
    if ((like & b) == b)
    System.out.println("홍길동이 좋아하는 장르 : 드라마");
    if ((like & c) == c)
    System.out.println("홍길동이 좋아하는 장르 : 코미디");
    if ((like & d) == d)
    System.out.println("홍길동이 좋아하는 장르 : 로맨스");
    if ((like & e) == e)
    System.out.println("홍길동이 좋아하는 장르 : 스릴러");
    if ((like & f) == f)
    System.out.println("홍길동이 좋아하는 장르 : 가족");
    if ((like & g) == g)
    System.out.println("홍길동이 좋아하는 장르 : 판타지");
    if ((like & h) == h)
    System.out.println("홍길동이 좋아하는 장르 : 액션");
    if ((like & i) == i)
    System.out.println("홍길동이 좋아하는 장르 : SF");
    if ((like & j) == j)
    System.out.println("홍길동이 좋아하는 장르 : 애니매이션");
    if ((like & k) == k)
    System.out.println("홍길동이 좋아하는 장르 : 다큐멘터리");
    if ((like & l) == l)
    System.out.println("홍길동이 좋아하는 장르 : 공포");
  }
}
