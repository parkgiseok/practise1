// API : pattern Class - quantifiers

package step31$Regex;

import java.util.Scanner;

public class Test06 {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    
    // 개수를 지정
    // String regex = "a*"; // --> a 문자가 0개 이상
    // 다른 문자 섞이지 않게 a가 0개 이상만 가능
    
    // String regex = "a+"; // --> a 문자가 1개 이상
    
    // String regex = "a?"; // --> a 문자가 1개 또는 0개
    // 두 개는 false
    
    // String regex = "a{3}"; // --> a 문자가 3개만 가능
    
    // String regex = "a{3,}"; // --> a 문자가 3개 이상
    
    // String regex = "a{3,6}"; // --> a 문자가 3 ~ 6개
    
    String regex = "a{3,6}"; // --> 
    
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
