package step26$Generic.exam01;

public class Test {

  public static void main(String[] args) {
    Box box = new Box();
    
    box.setValue("문자열");
    //box.setValue(new Date());
    //box.setValue(10);  // <- auto boxing : 여기선 자동으로 10이 Integer 객체로 만들어짐
    
    String value = (String)box.getValue(); // 자식이 부모를 가르킬순 없다 -> 형변환
    

  }

}
/* # 제네릭 사용 전 문제점?
 * 1) 컴파일 할 때 데이터 형을 엄격히 검사할 수 없다.
 * 2) 값을 꺼낼 때 마다 형변환을 해야한다. 
*/
