// API : pattern Class - Boundary matchers

package step31$Regex;

import java.util.Scanner;

public class Test05 {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    
    // String regex = "^a\\d"; // 시작 문자 a와 0 ~ 9 사이의 문자를 더한다
    // a + 0~9 (문자 두 자), 두자 이상은 false
    
    // String regex = "^\\p{Alpha}\\w"; // 알파벳 문자로 시작, 알파벳 또는 숫자
    // 두자 이상은 false
    
    // String regex = "\\wx$"; // --> [a-zA-Z_0~9] 한 개 문자와 x 문자로 끝나는 경우
    // 두자 이상은 false
    // 굳이 $를 쓰지 않아도 x로 끝난다.
    
    String regex = "\\wx$";
    
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
