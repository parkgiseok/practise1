/* 주제: 인스턴스 초기화 문장.
생성자와 인스턴스 초기화 블록을 사용하지 않고 인스턴스 변수 초기화 */
package step09;
public class Exam06 {
  static class Score {
    String name = "오호라"; // 인스턴스 변수 선언 + 초기화 문장(가장 먼저 실행)
    int kor = 50;
    int eng = 50;
    int math = 50;
    int sum = 0;
    float aver = 50f;

    {  // 인스턴스 초기화 블록
      name = "우헤헤";
    }

    Score() {  // 생성자
      sum = 150;
    }
  }

  // 모든 인스턴스는 Heap에 생성된다.
  public static void main(String[] args) {
    Score obj = new Score();
    System.out.printf("%s,%d,%d,%d,%d,%f\n",
    obj.name, obj.kor, obj.eng, obj.math, obj.sum, obj.aver);
  }
}
/* 인스턴스 생성 후 초기화 작업 순서
0) 인스턴스 변수를 모두 0으로 초기화시킨다..
  byte, int short, long = 0
  float, double = 0.0
  char = \u0000
  boolean = false
  주의) 메서드에 선언된 로컬 변수는 자동 초기화되지 않는다.
        따라서 개발자가 사용하기 전에 초기화 시켜야한다.
1) 인스턴스 초기화 문장 실행
2) 인스턴스 초기화 블록 실행
3) 생성자 실행

 */
