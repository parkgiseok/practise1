package step26$Generic.exam04;

import java.io.FileWriter;
import java.io.Writer;

public class Test {

  public static void main(String[] args) throws Exception {
    // => 항상 상위 타입의 레퍼런스는 하위 타입을 가리킬 수 있다.
    Object r1 = new FileWriter(""); // OK
    Writer r2 = new FileWriter(""); // Ok
    FileWriter r3 = new FileWriter(""); // Ok
    
    
    Box<String> b1 = new Box<String>(); // OK
    
    // ==>> (중요) Box<Object>는 Box<String>의 상위 타입이 아니다.
    // Box<Object> b2 = new Box<String>(); // Error
    // b2.setValue(new Date()); // Error
    
    // Box<FileWriter> b3 = new Box<Writer>(); // Error
    // b3.setValue(new FileWriter("")); // Error
    
  }

}
/* 
*/
