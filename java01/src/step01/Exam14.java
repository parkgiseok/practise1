/* 주제: 특수 문자의 표현 - Escape 문자 사용 */
package step01;

public class Exam14 {
  public static void main(String[] args) {
    System.out.print("Hello");
    System.out.print('\b'); // ==> return backspace code : 0x0008
    System.out.print("World");
    System.out.print('\n'); // ==> return linefeed(LF) code : 0x000a

    System.out.print('"'); // 작은 따옴표 안에서 큰 따옴표를 표현
    // \" code : 0x0022
    System.out.print('\n');

    System.out.print("This is \"홍길동\"");
    System.out.print('\t');
    System.out.print("This is '홍길동'");
    System.out.print('\n');

    System.out.print('\'');  // \' code : 0x0027
    System.out.print('\n');

    System.out.print('\\'); // \\ code : 0x005c
    System.out.print('\n');

    System.out.println();  // 자동 줄바꿈
  }
}
/* 이스케이프 문자
- \b : backspace
- \t : tap
- \n : linfeed(LF)
- \f : formfeed
- \r : carrage return(CR)
- \" : double quote
- \' : single quote
- \\ : backslash

줄바꿈?
- Windows : 0D0A (2바이트로 표현)
- Linux/Unix : 0A (4바이트로 표현)
*/
