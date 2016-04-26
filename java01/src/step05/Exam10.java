/* 주제: 반복문 while */
package step05;

public class Exam10 {
  public static void main(String[] args) {
    int count = 0;
    while (count < 10)
      System.out.println(++count);

      System.out.println("-------------------------------");
    // 실무 : 블록으로 감싸라!
    count = 0;
    while (count < 10) {
      System.out.println(++count);
    }
  }
}
/*
1
2
3
4
5
6
7
8
9
10
-------------------------------
1
2
3
4
5
6
7
8
9
10
*/
