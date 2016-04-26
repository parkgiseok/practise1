// 주제 : Reflection Api - 메서드 정보 추출하기

package step25$ReflectionApi;

import java.lang.reflect.Method;

public class Test04 {
  static class Member {
    public static int count;

    String name;

    public Member() {
      System.out.println("Member()....");
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }

  public static void main(String[] args) throws Exception {
    Class<?> clazz = Class.forName("step25$ReflectionApi.Test04$Member");  
    // <?> -> 컴파일러야 신경쓰지마.. 어떤 정보라도 가르키고 있다

    // 메서드 정보 추출
    Method[] methods = clazz.getDeclaredMethods(); // Method -> 메서드 정보를 다루는 클래스
    // getDeclaredMethods() -> 해당 클래스의 메서드
    for (Method m : methods) {
      System.out.println(m.getName());
    }
    
    System.out.println("================================================");
    
    methods = clazz.getMethods(); // getMethods() -> 상속받은 public 메서드도 포함
    for (Method m : methods) {
      System.out.println(m.getName());
    }
  }
}
