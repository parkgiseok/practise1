// API : pattern Class

package step31$Regex;

import java.util.Scanner;

public class Test02 {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    
    // 정규식(정규표현식: Regular Expression)에서 역슬래시를 문자로 사용하려면
    // "\\" 이렇게 지정해야 한다.
    // 예) 정규식: "a\\b\\c" --> 입력값: "a\b\c"에 대해 true를 리턴한다.
    // String regex = "a\\b\\c"; // 정규표현식 오류!
    // 이유?
    // => 자바 문자열에서 \\는 '\' 문자 한 자를 의미한다.
    // => 만약 두 개의 역슬래시(\\) 문자를 자바 문자열로 표현하고 싶다면,
    //  "\\\\" 해야한다.
    
    // 해결책
    String regex = "a\\\\b\\\\c";
    String input = null;
    
    while (true) {
      System.out.print("입력: ");
      input = keyScan.nextLine();
      if (input.equals("quit")) 
        break;
      System.out.println(input.matches(regex));
    }
    keyScan.close();
  }
}
