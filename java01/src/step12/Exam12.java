/* final 상수 활용 */
package step12;

public class Exam12 {
  public static void main(String[] args) {
    // 상수 값을 한 번 결정되면 바꿀 수 없다.
    // Car9.model = "sonata";  // 컴파일 오류!
  }
}
/*
# 클래스 변수 앞에 final을 붙이는 경우
- 주로 조회용 값을 저장하고 싶을 떄.
- 클래스가 로딩될 떄 딱 한 번만 만들기 위해
  static과 final을 함께 사용한다.

*/
