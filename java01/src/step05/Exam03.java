/* 주제: 조건문 if ~ else */
package step05;

public class Exam03 {
  public static void main(String[] args) {
    // if ~ else
    if (10 > 20)
      System.out.println("10 > 20");
    else
      System.out.println("10 <= 20");

      // if ~ else ~ 는 한 문장으로 취급한다.
      // 따라서 else 문만 별도로 사용할 수 없다.

      int age = 30;
      if (age <= 18)
        if (age <= 13)
          System.out.println("아동이다.");
      else // 들여쓰기에 속지 말라!
        System.out.println("성인이다.");
      // 1) else는 바로 직전에 if에 묶인다. => if (age <= 13)에 소속된다.
      // 2) if ~ else ~는 한 문장이기 때문에 블록을 사용할 필요가 없다.

      // 실무에서는 들여쓰기에만 의존하지 않는다.
      age = 30;
      if (age <= 18) {
        if (age <= 13)
          System.out.println("아동이다.");
        else
          System.out.println("성인이다.");
      } // 위와 같이  블록을 사용하면 코드를 좀 더 명확하게 읽을 수 있다.
  }
}

/*
 */
