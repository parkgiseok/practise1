// API : pattern Class - Logical operators

package step31$Regex;

import java.util.Scanner;

public class Test07 {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);

    // 연속 문자열 검사
    // String regex = "ab"; // --> 무조건 a 다음에 b
    
    // String regex = "a|b"; // --> a 또는 b
    // 두 자 이상은 false
    
    // String regex = "(a|b)(x|y)"; // --> 첫 문자는 a 또는 b, 두번째 문자는 x 또는 y
    
    String regex = "(a|b)(x|y)"; // -->
    
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
