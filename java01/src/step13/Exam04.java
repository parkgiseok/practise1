// 주제 : 날짜 데이터를 다루는 클래스2
package step13;

import java.sql.Date;

public class Exam04{
  public static void main(String[] args){
    long currTime = System.currentTimeMillis();  // 1970.1.1 0:0:0 ~ 밀리초
    Date today = new Date(currTime);

    System.out.println(today);  // 2016-03-07 (yyyy-mm-dd 형식임)

    // java.sql.Date 클래스를 주로 사용하는 경우
    // "yyyy-mm-dd" 문자열 --> Date 인스턴스
    Date date = Date.valueOf("2016-3-7");
    System.out.println(date);  // 2016-03-07

  }
}

/*


*/
