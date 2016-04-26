/*
다음 값을 저장하고 지시에 따라 내용을 출력하시오!
- 저장할 데이터
이름, 국어, 영어, 수학,
홍길동 100  90  80
임꺽정  90  80  90
유관순  70 100 100

- 출력
이름: 국어, 영어, 수학, 합계, 평균
*/
package step02;

public class quiz04{
public static void main(String[] args){

  String[] name = {"홍길동", "임꺽정", "유관순"};

  double[] average = new double[3];

  int[][] scores = {
    {100, 90, 80},
    {90, 80, 90},
    {70, 100, 100}
  };

  average[0] = (scores[0][0] + scores[0][1] + scores[0][2]) /3;
  average[1] = (scores[1][0] + scores[1][1] + scores[1][2]) /3;
  average[2] = (scores[2][0] + scores[2][1] + scores[2][2]) /3;

  System.out.printf("%s: %d, %d, %d, %d, %f\n",
                    name[0], scores[0][0], scores[0][1], scores[0][2],
                    scores[0][0] + scores[0][1] + scores[0][2],
                    average[0]);
  System.out.printf("%s: %d, %d, %d, %d, %f\n",
                    name[1], scores[1][0], scores[1][1], scores[1][2],
                    scores[1][0] + scores[1][1] + scores[1][2],
                    average[1]);
  System.out.printf("%s: %d, %d, %d, %d, %f\n",
                    name[2], scores[2][0], scores[2][1], scores[2][2],
                    scores[2][0] + scores[2][1] + scores[2][2],
                    average[2]);


  }
}
