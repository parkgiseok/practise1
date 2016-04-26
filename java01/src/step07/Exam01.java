/* 주제: class 문법을 이용하여 여러개의 메서드 묶기 */
package step07;
public class Exam01 {

  public static void main(String[] args) {
    // 별도의 클래스로 분류된 메서드를 사용하는 방법
    // => 분류명.메서드명();
    //    즉, 클래스명.메서드명();
    //    메서드 앞에다가 소속 클래스 이름을 붙인다
    System.out.println(Calculator.plus(10, 20));
    System.out.println(Calculator.minus(10, 20));
    System.out.println(Calculator.multiple(10, 5));
    System.out.println(Calculator.divide(10, 2));

    // Calculator 클래스와 같이 관련 기능을 하나로 묶어 놓은 클래스는?
    // => java.lang.Math라는 클래스가 있다.

  }
}

// javac -cp bin -d bin src/step07/Exam01.java  <= 컴파일
// -cp bin는 Calculator위치를 알려줌

// javac -d bin -sourcepath src src/step07/Exam01.java
// 이런식으로 위치 지정 안해도 알아서 찾는다

/* class 문법 사용 1
=> 관련 기능을 별도의 블록으로 분류한다.
=> 코드를 찾기 쉽다. 관리가 쉽다.
=> step06.Exam05에 있던 계산 관련 메서드를 분리하여
   step07.Calculator 클래스에 분류하였다.

여러 클래스가 서로 관계를 맺고 있을 때 컴파일하는 방법?
=> 다른 클래스가 사용하는 클래스를 먼저 컴파일 하여 .class 파일을 준비한다.
=> 그리고 해당 클래스를 컴파일한다.
=> 단, 그 클래스가 사용하는 클래스의 경로를 컴파일 옵션에 등록한다.
예) -cp 또는 -classpath
=> 여러 클래스와 관계를 맺는 클래스를 컴파일할 때
   좀 더 쉽게 컴파일하려면 다음 옵션을 사용하라!

-sourcepath [소스파일의경로]
예) Exam01을 컴파일할 때 만약 -sourcepath에 지정된 위치에
    Calculator의 소스 파일이 있다면, 이 파일도 자동 컴파일 된다.
에) javac -d bin -sourcepath src src/step07/Exam01.java
이 옵션을 사용하면 Exam01.java를 컴파일 하기 위해
Calculator.java를 먼저 컴파일 해야하는 번거로움이 사라진다.
 */
