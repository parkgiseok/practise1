// 주제 : 프로그램 아규먼트
package step13;

public class Exam07 {
  public static void main(String[] ohora){
    System.out.println(ohora.length);
    System.out.println("---------------------------");
    for (String value : ohora) {
      System.out.println(value);
    }
  }
}
// java -cp bin step13.Exam07 aaa bbbbb cc ddd 해보기

/*
프로그램 아규먼트
- 자바 프로그램을 실행할 때 넘겨주는 값
- 예) java -cp bin step13.Exam07 aaa bbb ccc ddd
  => aaa bbb ccc ddd 가 바로 프로그램 아규먼트이다.
  => 공백을 기준으로 문자열을 잘라 배열로 만들어 리턴한다.



*/
