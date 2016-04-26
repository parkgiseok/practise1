/* 주제: String 주요 도구 사용법6 */
package step03;
public class Exam12 {
  public static void main(String[] args) {
    String str = "    This is BITCamp.     ";
    String a = str.toLowerCase();  // 모든 문자를 소문자로 String 생성
    String b = str.toUpperCase();  // 모든 문자를 대문자로 String 생성
    String c = str.trim();  // 문자열 앞, 뒤 공백 제거한 String 생성

    System.out.println(str + "@");  // 문자열1 + 문자열2 = 문자열1문자열2
    System.out.println(a + "@");
    System.out.println(b + "@");
    System.out.println(c + "@");

    // Primitive type의 값을 가지고 String 물건 생성하기
    int v1 = 10;
    float v2 = 3.14159f;
    boolean v3 = true;
    char v4 = '가';

    String s1 = String.valueOf(v1);  // static method => 클래스를 이용하여 동작
    String s2 = String.valueOf(v2);
    String s3 = String.valueOf(v3);
    String s4 = String.valueOf(v4);

    System.out.printf("%s, %s, %s, %s\n", s1, s2, s3, s4);
  }
}
/*


 */
