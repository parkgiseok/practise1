/* 연습문제2 */
package step12;

public class MemberTest {
  public static void main(String[] args) {
    Member c1 = new Member("신민아", "sin", "1234", 0000000, "sin@naver.com");
    Member c2 = new Member("수지", "Ssu", "4321", 1111111, "Ssu@naver.com");


    System.out.printf("%d, %s, %s, %s, %d, %s\n",
      c1.getNo(), c1.getName(), c1.getId(),
      c1.getPw(), c1.getNum(), c1.getEmail());

    System.out.printf("%d, %s, %s, %s, %d, %s\n",
      c2.getNo(), c2.getName(), c2.getId(),
      c2.getPw(), c2.getNum(), c2.getEmail());


  }
}
/*

*/
