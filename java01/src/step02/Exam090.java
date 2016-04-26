/* 다음 값을 저장하고 지시에 따라 내용을 출력하시오!
- 저장할 데이터
        이름, 미술, 체육, 도덕
3학년1반 김   100    90    80
3학년2반 이    90    80    90
3학년3반 박    70   100   100

- 출력
0학년0반 이름 : 국어, 영어, 수학, 합계, 평균
*/
package step02;

public class Exam090 {
  public static void main(String[] args){
    String[] name = {"김", "이", "박", "3학년 1반", "3학년 2반", "3학년 3반"};

    int[][][] scores = {
      { // 3학년 1반
        {100, 90, 80},
        {10, 80, 90},
        {10, 70, 60}

      },
      { // 3학년 2반
        {90, 80, 90},
        {50, 40, 30},
        {90, 30, 80}
      },
      { // 3학년 3반
        {70, 100, 100},
        {20, 60, 80},
        {90, 30, 40}
      }
    };

    int[] sum = new int[3];
      sum[0] = scores[0][0][0] + scores[0][0][1] + scores[0][0][2];
      sum[1] = scores[1][1][0] + scores[1][1][1] + scores[1][1][2];
      sum[2] = scores[2][2][0] + scores[2][2][1] + scores[2][2][2];

    double[] average = new double[3];
      average[0] = (scores[0][0][0] + scores[0][0][1] + scores[0][0][2])/3;
      average[1] = (scores[1][1][0] + scores[1][1][1] + scores[1][1][2])/3;
      average[2] = (scores[2][2][0] + scores[2][2][1] + scores[2][2][2])/3;

      System.out.printf("%s %s: %d, %d, %d, %d, %f\n",
                        name[3], name[0], scores[0][0][0], scores[0][0][1], scores[0][0][2],
                        sum[0], average[0]);
      System.out.printf("%s %s: %d, %d, %d, %d, %f\n",
                        name[4], name[1], scores[1][1][0], scores[1][1][1], scores[1][1][2],
                        sum[1], average[1]);
      System.out.printf("%s %s: %d, %d, %d, %d, %f\n",
                        name[5], name[2], scores[2][2][0], scores[2][2][1], scores[2][2][2],
                        sum[2], average[2]);

  }
}
