/* 주제: 비트 연산자 사용 */
package step04;

public class Exam05 {
  public static void main(String[] args) {
    // & (AND) = 특정 비트들을 걸러내는 효과가 있다.
    int a = 0b0101_0011;
    int b = 0b0000_1111;
    String result = Integer.toBinaryString(a & b);  // 문자열의 주소를 저장
    //  0000_0011
    //  toBinaryString은 앞의 0은 문자열에 포함시키지 않는다.
    System.out.println(result);  // a & b는 a값을 그대로 떨어트리는 효과
    // 11

    // | (OR) = 특정 비트의 값을 강화하는 효과가 있다.
    result = Integer.toBinaryString(a | b);  // 0101_1111 맨 앞 0은 출력 x
    System.out.println(result); // 0101 1111

    // ~ (NOT) = 전체 비트의 값을 반전시키는 효과가 있다.
    result = Integer.toBinaryString(~a);  // 1010_1100
    System.out.println(result);

    // ^(Exclusive OR) = 특정 비트의 값을 제거(반전)하는 것.
    // 두개가 같으면 0 다르면 1
    // 영상 크로마킹 기법에 많이 사용한다.
    a = 0b0101_0011;
    b = 0b1111_1111;
    result = Integer.toBinaryString(a ^ b);  // 1010_1100
    System.out.println(result);
  }
}
