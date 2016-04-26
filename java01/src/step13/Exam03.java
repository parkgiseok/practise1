// 주제 : 날짜 데이터를 다루는 클래스
package step13;

import java.util.Date;

public class Exam03{
  public static void main(String[] args){
    Date today = new Date(); // 인스턴스에는 오늘 날짜와 시간이 들어있다.

    // println(래퍼런스)
    // => println()은 래퍼런스에 대해 toString()을 호출 실행한 후
    // 그 리턴값을 출력한다.
    System.out.println(today); // Mon Mar 07 14:48:24 KST 2016
    System.out.println(today.toString());  // 위의 코드와 같다.
  }
}

/*


*/
