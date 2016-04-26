// API : pattern Class - Character classes

package step31$Regex;

import java.util.Scanner;

public class Test03 {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    
    // 문자 집합
    // String regex = "[abc]"; // --> a | b | c 문자 한 자
    // ab, bc, abc는 안된다.
    
    // String regex = "[^abc]"; // --> a, b, c를 제외한 문자 한 개
    // ab, bc, abc, qa, cf, bg....  a,b,c중에 한개라도 들어가면 false
    
    // String regex = "[a-z]"; // --> a에서 z까지의 알파벳 문자 한 개
    // 두 자 이상은 무조건 false
    
    // String regex = "[a-zA-Z]"; // --> 대/소문자 알파벳 한 개
    // 두 자 이상은 무조건 false
    
    // String regex = "[a-d[m-p]]"; // --> a~d | m~p 범위의 한 개
    // String regex = "[a-dm-p]";  // --> 위와 같다
    // 같은 영역이여도 두 자 이상은 무조건 false
    
    String regex = "[a-f&&[d-m]]"; // --> 교차 (d | e | f 중 한 개 가능)

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
