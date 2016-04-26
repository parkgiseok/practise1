/* 주제: 2차원 배열 - 배열 안에 값이 배열 */
package step02;

public class Exam08 {
  public static void main(String[] args) {
    int[][] scores = {
      {100, 90, 90, 100, 70},
      {90, 90, 90},
      {80, 100},
      {80, 80, 70, 60}
    };

    System.out.printf("%d %d %d\n", scores[0][4], scores[2][1], scores[3][2]);
    // format(형식을 갖추어라), d = 10진수

  }
}
