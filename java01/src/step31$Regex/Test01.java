// API : pattern Class

package step31$Regex;

import java.util.Scanner;

public class Test01 {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    
    // "어떤문자 또는 문자열" --> 지정된 문자(문자열)와 일치할 때만 true return.
    // String regex = "a";
    // String regex = "abc";
    // String regex = "a\\b\\c"; // -(리턴하는 문자열)-> a\b\c
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
