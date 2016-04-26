/* 주제: 메모리와 숫자 */
package step01;

public class Exam08 {
  public static void main(String[] args){
    System.out.println(-2147483648);       // 4byte 정수 값
    System.out.println(2147483647);        // 4byte 정수 값
    System.out.println(-9223372036854775808L);      // 8byte 정수 값
    System.out.println(9223372036854775807L);       // 8byte 정수 값

    // 표현의 범위를 초과했을때 => 컴파일 오류 발생!
    // System.out.println(-2147483649);   //4byte 정수 값
    // System.out.println(2147483648);    //4byte 정수 값
    // System.out.println(-9223372036854775809L);      // 8byte 정수 값
    // System.out.println(9223372036854775808L);       // 8byte 정수 값

  }
}

/* 메모리(RAM을 기준)
- 전하(전기)를 보관하는 반도체.
- 한 개의 전하(전기)를 보관하는 곳을 "비트"라고 부른다.

8bit(1byte) : 0 ~ 255까지의 값을 표현(-128 ~ 127)
32bit : 0 ~ 4294967296(-2147483648 ~ 2147483647)
64bit : -922경 3372조 0368억 5477만 5808 ~ 922경 3372조 0368억 5477만 5807

자바 리터럴은 기본으로 4바이트 정수와 8바이트 정수를 표현할 수 있다.
4바이트 정수 값에는 아무것도 붙이지 않고,
8바이트 정수 값에는 뒤에 "L", 또는 'l'을 붙여서 표기한다.
*/
