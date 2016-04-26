// 주제 : JVM 아규먼트
package step13;

public class Exam08 {
  public static void main(String[] args){
    String name = System.getProperty("name");
    String age = System.getProperty("age");

    System.out.println(name);
    System.out.println(age);

  }
}

/*
JVM 아규먼트?
- 자바 프로그램을 실행할 때 JVM에 넘겨주는 값.
- 예) java -cp bin -Dname=hong -Dage=18 step13.Exam08
  => name 이라는 이름으로 hong 값을 전달한다.
  => age라는 이름으로 18 값을 전달한다.

*/
