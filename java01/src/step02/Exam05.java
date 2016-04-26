/* 주제: 배열의 선언 */
package step02;

public class Exam05 {
  public static void main(String[] args) {
    // 국어, 영어, 수학 점수를 개별적으로 저장
    int kor, eng, math;

    // 배열 선언 = 같은 종류의 메모리를 여러개 선언할 때 유용
    int[] scores = new int[3];  // 4byte * 3
    char[] chars = new char[10];  // 2byte * 10
    boolean[] tf = new boolean[5];  // -- * 5
    float[] avers = new float[10];  // 4byte * 10
    double[] money = new double[100];  // 8byte * 100
    byte[] bytes = new byte[1024];  // 1byte * 1024
    short[] s = new short[30];  // 2byte * 30
    long[] ll = new long[345];  // 8byte * 345
  }
}
/* 배열(Array)
- 배열은 0부터 시작
- 같은 종류의 메모리를 여러 개 준비하는 명령어
- 연속해서 메모리를 저장한다
- 문법
  데이터타입[] 배열의별명 = new 데이터타입[개수];
ex>
int[] a = new int[20];
int a[] = new int[20]; <-- C 언어 방식의 문법으로 추천하지 않는다.
- 배열은 new 명령으로 생성해야 한다.
 */
