// API : pattern Class - Predefined Character classes

package step31$Regex;

import java.util.Scanner;

public class Test04 {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    
    // 미리 정의된 문자 집합
    // String regex = "[0-9]"; // --> 0 ~ 9 까지의 한 개 문자
    // String regex = "\\d"; // --> 0 ~ 9 까지의 문자 집합을 의미, 위와 같다
    // 두 자 이상은 무조건 false
    
    // String regex = [a-zA-Z_0-9]; // --> _ 문자도 포함한다.
    // String regex = "\\w"; // --> 위와 같다.
    // 두 자 이상은 무조건 false
    
    // String regex = "."; // -> 모든 문자 한 개
    // 두 자 이상은 무조건 false
    
    // String regex = "\\."; // "." 문자 한 개만 가능
    // 나머지 모든 문자, 문자 두 개 이상은 다 false

    String regex = "\\.";
    
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
