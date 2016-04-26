/* 연습문제 */
package step12;

public class BoardTest {
  public static void main(String[] args) {
    Board b1 = new Board("안녕", "반갑습니다다다다다다", "박기석", 1, 20160307);
    Board b2 = new Board("하이", "반가워요요요요요요", "수지", 12345, 20160306);


    System.out.printf("%d, %s, %s, %s, %d, %d\n",
      b1.getBoardno(), b1.getTitle(), b1.getContent(),
       b1.getName(), b1.getJoin(), b1.getDate());

    System.out.printf("%d, %s, %s, %s, %d, %d\n",
      b2.getBoardno(), b2.getTitle(), b2.getContent(),
       b2.getName(), b2.getJoin(), b2.getDate());


  }
}
/*

*/
