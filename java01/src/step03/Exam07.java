/* 주제: String 주요 도구 사용법1  */
package step03;

public class Exam07 {
  public static void main(String[] args) {

    String s1 = "Hello";
    String s2 = "안녕하세요";

    String s3 = s1.concat(s2);  // s1과 s2를 합친 새 String 물건을
                                // 생성하여 그 주소를 리턴한다.

    System.out.println(s1);  // Hello
    System.out.println(s2);  // 안녕하세요
    System.out.println(s3);  // Hello안녕하세요
  }
}
