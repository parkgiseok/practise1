/* 주제: 명시적 형변환과 암시적 형변환2 */
package step04;
public class Exam16 {
  public static void main(String[] args) {
    float a = 5;
    int b = 2;
    float f = a / b;  // 암시적 형변환 수행
    System.out.println(f);  // 2.5
  }
}
/* 암시적 형변환
=> a(float) / b(int) : 연산불가!
=> b의 값을 float으로 바꿔서 나누기 연산을 수행한다.
=> How?
  float 임시 메모리를 만들어 b에 저장하고
  a와 임시 메모리 값을 연산한다.
  1) a(5) / b(2)
  2) a(5) / 임시 float 메모리(2f)
  3) a(5) / float(2f) = 2.5

정적 타입 바인딩(static type binding)
=> 한 번 변수의 타입이 결정되면 절대 바뀌지 않는다.
=> int i  = 10;
  i = "Hello"; <---- 컴파일 오류

동적 타입 바인딩(dynamic type binding)
=> 값을 저장할 때 변수의 타입이 결정된다.
=> 다른 타입의 값으로 변경하면 변수의 타입도 변경된다.
=> var i = 10; // integer
  i = "Hello"; // String으로 변경됨
*/
