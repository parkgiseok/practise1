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
public class Quiz02 {   //실패

  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    String[][] result = new String[5][5];
    String[] ask = new String[5];
    ask[0] = "이름? ";
    ask[1] = "이메일? ";
    ask[2] = "암호? ";
    ask[3] = "전화번호? ";

    for (int j = 0; j < 5; j++) {
      for (int i = 0; i < 5; i++) {
        result[j][i] = "0";
      }
    }

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print(ask[j]);
        result[i][j] = s.nextLine();
        if (j == 4) {
          System.out.print("정말 저장하시겠습니까?(y/n) ");
          s.nextLine();
          if (result[j][4].equals("Y") || result[j][4].equals("y")) {
            System.out.println("저장했습니다.");
          } else {
            i--;
          }
        }
      }
    }


    System.out.print("저장한 회원 정보를 보시겠습니까?(y/n) ");
    s.nextLine();
    if (s.nextLine().equals("y") || s.nextLine().equals("Y")){
      System.out.println("지금까지 입력한 회원 정보는 다음과 같습니다.");
      System.out.println("--------------------------------------------.");
      for (int i = 0; i < 4; i++) {
        System.out.println(result[i][0] + ", " + result[i][1] + ", " +
         result[i][2] + ", " + result[i][3]);
      }
    } else {
      System.out.println("취소!\n");
    }


  }
}
