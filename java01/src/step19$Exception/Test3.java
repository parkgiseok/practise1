// 주제 : 예외 정보 다루기
package step19$Exception;

public class Test3 {
  public static void main(String[] args) {
    Calculator1 calc = new Calculator1();
    calc.plus(10);

    try {
    calc.divide(0); // 0일 땐 catch가 실행, 2일 땐 정상 실행
    System.out.println("----------------");
    System.out.println(calc.result);
    System.out.println("----------------");
    } catch (ArithmeticException e) {
      // e 레퍼런스는 예외 정보를 저장하고 있다.
      System.out.println("나누기 오류 발생!");
      System.out.println(e.getMessage()); // / by zero
      // 간단한 오류 정보
      System.out.println("----------------");
      e.printStackTrace();  // 완전한 오류 정보
      // java.lang.ArithmeticException: / by zero
	    // at step19.Calculator1.divide(Calculator1.java:19)
	    // at step19.Test3.main(Test3.java:10)

    }
  }
}
/*


*/
