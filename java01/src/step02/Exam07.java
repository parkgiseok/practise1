/* 주제: 배열 초기화 */
package step02;

public class Exam07 {
  public static void main(String[] args) {
    int[]            // 배열의 별명을 먼저 선언한 수
    a = new int[3];  // 생성된 배열에 붙일 수 있다.
    a[0] = 1;
    a[1] = 2;
    a[2] = 3;
    System.out.println(a[2]);

    int[] b;
    b = new int[]{10, 20, 30, 40};  
    System.out.println(b[2]);

    /* 문법 오류!
    int[] c;
    c = {100, 200, 300, 400};  // 이 방식으로 배열을 초기화시킬 때는
                               // 배열 변수 선언문과 함께 사용해야 한다.
    System.out.println(c[2]);
    */

    int[] arr2 = {1000, 2000, 3000, 4000};
    System.out.println(arr2[3]);
  }
}
