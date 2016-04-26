// 주제 : Reflection Api - 메서드 정보 추출하기 3
// => 패키지 멤버 클래스도 inner Class와 같다.

package step25$ReflectionApi;

import java.lang.reflect.Method;

public class Test06 {

  public static void main(String[] args) throws Exception {
    Class<?> clazz = Class.forName("step25$ReflectionApi.Member2");  
    // <?> -> 컴파일러야 신경쓰지마.. 어떤 정보라도 가르키고 있다

    // 메서드 정보 추출
    // 
    Method[] methods = clazz.getDeclaredMethods(); // Method -> 메서드 정보를 다루는 클래스
    // getDeclaredMethods() -> 해당 클래스의 메서드
    // getDeclaredMethods() => public, protected, (default), private 메서드들.....
    for (Method m : methods) {
      System.out.println(m.getName());
    }
    
    System.out.println("================================================");
    
    methods = clazz.getMethods(); // getMethods() -> 상속받은 public 메서드도 포함
    // getMethods() => public 메서드만
    for (Method m : methods) {
      System.out.println(m.getName());
    }
  }
}
