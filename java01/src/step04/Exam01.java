/* 주제: 산술 연산자 사용 */
package step04;

public class Exam01 {
  public static void main(String[] args) {
    int v1 = 10;
    int v2 = 20;
    int result = v1 + v2;  // -, *, /, % 사용 가능

    System.out.println(result);  // 30

    byte b = 10;  // 리터럴 값 저장 예외 규칙에 의해 컴파일 - ok!
    // byte b = v1;  // 오류! 변수의 경우 비록 작은 값이라도 허락하지 않는다
    byte b3 = 10 + 20;  // OK! 리터럴과 리터럴의 연산 결과는 리터럴!

    byte b1 = 10;
    byte b2 = 20;
    // byte b3 = b1 + b2;  // 컴파일 오류! byte와 byte 변수의 결과를 저장?
    // byte b3 = b1 + 20;  // 컴파일 오류!
    // byte b3 = 10 + b2;  // 컴파일 오류!
    // 자바에서는 byte, short, int 메모리의 값을 다룰 때 int로 취급한다.

    short s1 = 20;
    // short s3 = b1 + s1; // 컴파일 오류!! 이유?
    // 자바에서는 byte, short, int 메모리의 값을 다룰 때 int로 취급한다.
    int i1 = b1 + s1; // ok!!

    System.out.println(b1 + b2 + b3);  // 60

  }
}

/*
4바이트 리터럴 값을 byte, short 메모리에 저장하는 규칙?
- 메모리에 저장할 수 있다면 허락한다.

4바이트 변수의 경우 값을 byte, short 메모리에 저장할 떄?
- 값을 저장할 수 있더라도, 무조건 오류!

리터럴 값들의 연산 결과는 리터럴 값으로 취급한다
- 리터럴은 값은 연산을 하더라도 변하지 않는다.
  => 컴파일(번역) 과정에서 검증할 수 있다.
- 기존의 법칙 : 리터럴 값이 비록 4byte라고 하더라도 메모리에 저장할 수 있다면
                허락한다

byte 변수와 byte 변수의 연산결과는?
- int이다
- short와 short의 연산 결과도 int이다
- 자바에서는 byte, short, int 메모리의 값을 다룰 때 int로 취급한다.

리터럴과 변수의 연산 결과는 변수로 취급된다 (중요!! 암기)
- 변수의 값에 따라 연산의 결과가 달라지기 때문에
  메모리에 저장할 수 있는지 확실하지 않다.
  그래서 기본 크기보다 작은 메모리에 저장하는 것을 허락하지 않는다.
 */
