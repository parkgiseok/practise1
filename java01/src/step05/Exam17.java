/* 주제: 중첩된 for 문 나가기 */
package step05;

public class Exam17 {
  public static void main(String[] args) {
    for (int i = 2; i < 10; i++) {
      for (int j = 1; j < 10; j++) {
        System.out.printf("%d x %d = %d\n", i, j, i*j);
        if (i == 5 && j == 6)
        break;  // 자신을 감싸는 반복문을 나간다.
        // 밑에 for문 까지만 나간다 --> 6단 부터 다시 이어짐
      }
    }
    System.out.println("------------------------------");
    ohmygod:
      for (int i = 2; i < 10; i++) {
        for (int j = 1; j < 10; j++) {
          System.out.printf("%d x %d = %d\n", i, j, i*j);
          if (i == 5 && j == 6)
          break ohmygod;  // 자신을 감싸는 반복문을 나간다.
        }
      }
    System.out.println("끝~~");

  }
}
