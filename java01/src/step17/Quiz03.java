/*
5명의 회원 정보를 입력받아서 보관하라!
> java -cp bin step17.Quiz
이름? 홍길동
이메일? hong@test.com
암호? 1111
전화? 111-1111
정말 저장하시겠습니까?(y/n) y
저장했습니다.

이름? 임꺽정
이메일? leem@test.com
암호? 1111
전화? 111-1111
정말 저장하시겠습니까?(y/n) y
저장했습니다.

이름? 오호라
이메일? ohora@test.com
암호? 1111
전화? 111-1111
정말 저장하시겠습니까?(y/n) n
저장 취소했습니다.

이름? 임꺽정2
이메일? leem2@test.com
암호? 1111
전화? 111-1111
정말 저장하시겠습니까?(y/n) x
정말 저장하시겠습니까?(y/n) Y
저장했습니다.

이름? 임꺽정3
이메일? leem3@test.com
암호? 1111
전화? 111-1111
정말 저장하시겠습니까?(y/n) y
저장했습니다.

지금까지 입력한 회원 정보는 다음과 같습니다.
--------------------------------------------
홍길동,hong@test.com,1111,111-1111
임꺽정,leem@test.com,1111,111-1111
임꺽정2,leem2@test.com,1111,111-1111
임꺽정3,leem3@test.com,1111,111-1111
임꺽정4,leem4@test.com,1111,111-1111
>
*/

package step17;
import java.util.Scanner;
public class Quiz03 {

  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    String[][] result = new String[5][4];
    String name;
    String email;
    String password;
    String num;
    String t;

    for (int i = 0; i < 5; i++) {
      System.out.print("이름? ");
      name = s.nextLine();

      System.out.print("이메일? ");
      email = s.nextLine();

      System.out.print("비밀번호? ");
      password = s.nextLine();

      System.out.print("전화번호? ");
      num = s.nextLine();

      while(true) {
        System.out.print("저장하시겠습니까? ");
        t = s.nextLine();
        if (t.equals("y") || t.equals("Y") || t.equals("n") || t.equals("N")) {
          break;
        }
      }
      if (t.equals("y") || t.equals("Y")) {
        result[i][0] = name;
        result[i][1] = email;
        result[i][2] = password;
        result[i][3] = num;
        System.out.println("저장 완료!\n");
      } else {
        System.out.println("저장 취소!\n");
        --i;
      }
    }

    System.out.print("저장한 정보를 보시겠습니까?(y/n) ");
    t = s.nextLine();
    if (t.equals("y") || t.equals("Y")){
      System.out.println("지금까지 입력한 회원 정보는 다음과 같습니다.");
      System.out.println("--------------------------------------------.");
      for (int i = 0; i < 5; i++){
        for (int j = 0; j < 4; j++){
        System.out.print(result[i][j] + " ");
        }
        System.out.println();
      }
    } else {
      System.out.println("취소!\n");
    }


  }
}
