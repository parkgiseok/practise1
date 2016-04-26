package step26$Generic.exam02;

import java.util.Date;

public class Test3 {

  public static void main(String[] args) {
    // 다양한 타입으로 사용하기
    Box<String> box1 = new Box<>();
    Box<Integer> box2 = new Box<>();
    Box<Date> box3 = new Box<>();
    Box<Object> box4 = new Box<>();
    
    box1.setValue("문자열"); // OK
    box2.setValue(20);
    box3.setValue(new Date());
    
    // box1.setValue(20); // 컴파일 오류 발생!
    // box2.setValue("20"); // 컴파일 오류 발생!
    // box3.setValue(true); // 컴파일 오류 발생!
    
    // => 항상 다형적 변수의 활용법에 따라 하위 (클래스의) 객체를 저장할 수 있다
    box4.setValue("문자열"); // OK
    box4.setValue(20); // OK --> auto-boxing
    box4.setValue(new Date()); // OK
    box4.setValue(true); // OK --> auto-boxing
  }

}
/* 
*/
