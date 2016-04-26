/* 주제: 할당 연산자 */
package step04;
public class Exam08 {
  public static void main(String[] args) {
    int i = 10;
    i = i + 5;

    int j = 10;
    j += 5;  // += 자기 자신에게 더해준다
    System.out.printf("%d, %d\n", i, j);

    // +=, -=, *=, /=, &=, |=, ^=, <<=, >>=, >>>= 다 가능
  }
}
