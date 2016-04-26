// API : pattern Class - matcher 사용법

package step31$Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test08 {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    
    // 콘텐츠에서 해당 규칙을 가진 문자열이 있을 때,
    // => Pattern과 Matcher를 사용하여 콘텐츠를 분석한다.
    Pattern pattern = Pattern.compile("[0-9]"); // 1) 정규식 패턴 선언
    Matcher matcher = null;
    
    String input = null;
    
    while (true) {
      System.out.print("입력: ");
      input = keyScan.nextLine();
      if (input.equals("quit")) 
        break;
      matcher = pattern.matcher(input); 
      // 2) 입력 문자열을 정규식에 따라 분석할 객체를 얻는다.
      System.out.println(matcher.find()); 
      // 3) 분석 시작, find는 단순히 있냐 없냐 찾아내기
    }
    
    keyScan.close();
  }
}
