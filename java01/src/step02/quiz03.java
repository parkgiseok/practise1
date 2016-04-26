/*
다음 값을 저장하고 지시에 따라 내용을 출력하시오!
- 학생 30명의 국어, 영어, 수학 합계 점수를 저장할 변수
- 학생 30명의 평균 점수를 저장할 변수

- 인덱스 5번 학생의 점수를 저장하라. 점수는 다음과 같다.
  국어 : 100, 영어 : 90, 수학 : 50
- 인덱스 5번 학생의 국어, 영어, 수학, 합계, 평균을 출력하라!
*/
package step02;

public class quiz03{
public static void main(String[] args){
  int[][] scores = new int[30][4];
    scores[4][0] = 100;
    scores[4][1] = 90;
    scores[4][2] = 50;

  float[] average = new float[30];
    average[4] = (scores[4][0] + scores[4][1] + scores[4][2]) /3;

  System.out.printf("%d, %d, %d, %d, %f\n", scores[4][0], scores[4][1],
                     scores[4][2], scores[4][0] + scores[4][1] + scores[4][2],
                     average[4]);




  }
}
