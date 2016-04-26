/* 주제: String 주요 도구 사용법2 */
package step03;
public class Exam08 {
  public static void main(String[] args) {

    String s1 = "I will take a bus.";
    String s2 = s1.replace('l', 'x'); // String 물건을 생성한다.

    System.out.println(s1);  // I will take a bus.
                             // 절대 기존 내용물은 변경되지 않는다.
    System.out.println(s2);  // I wixx take a bus.

    String s3 = s1.replace("bus", "taxi"); // 새 String 물건 생성
    System.out.println(s3);  // I will take a taxi.
  }
}
/*
immutable
=> 내용물을 변경할 수 없는 객체
=> 예) String 객체

mutable 객체
=> 내용물을 변경할 수 있는 객체
=> 예) StringBuffer 객체

String 객체
=> 어떤 메서드를 실행하더라도 원본은 변경되지 않는다.
=> 다만 새 String 객체를 만들어 리턴할 뿐이다.
 */
