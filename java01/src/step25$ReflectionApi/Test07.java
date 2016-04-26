// 주제 : Reflection Api - 특정 메서드만 알아내기

package step25$ReflectionApi;

import java.lang.reflect.Method;

public class Test07 {
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
    
    public void setName(String firstName, String middleName, String lastName) {
      this.name = firstName + " " + middleName + " " + lastName;
    }
    
  }

  public static void main(String[] args) throws Exception {
    Class<?> clazz = Class.forName("step25$ReflectionApi.Test07$Member");  
    // <?> -> 컴파일러야 신경쓰지마.. 어떤 정보라도 가르키고 있다
    
    // Member 클래스 정보를 얻는 방법
    // 1) m.getClass();
    // 2) Member.class;
    // 3) Class.forName("Member");
    
    // 메서드의 이름과 그 메서드의 파라미터 타입 정보를 주면
    // 클래스에서 해당 메서드 정보를 찾아서 리턴해준다.
    Method m1 = clazz.getDeclaredMethod("setName", String.class); 
    // => void setName(String name) {}
    System.out.println(m1.getName());
    // String.class -> String (클래스의) 타입 객체
    // 타입 객체 -> 클래스 정보를 담고있다.
    
    Method m2 = clazz.getDeclaredMethod("setName", String.class, String.class, String.class);
    System.out.println(m2.getName());
    // public void setName(String firstName, String middleName, String lastName) {}
    
    // 다음과 같이 존재하지 않는 메서드를 찾으려고 한다면 예외가 발생한다.
    // java.lang.NoSuchMethodException
    Method m3 = clazz.getDeclaredMethod("setName", int.class); // 실행 오류!
    // int.class -> Primitive type을 내부적으로, 이런 문법으로 가리킬 수 있다.
    // int (클래스의) Primitive type 정보
    // -> void setName(int value) {} 이런 메서드 없냐?? ==> 없다!!
    
    /*
    public void getDeclaredMethod(String method, Class<?>... paramType) {
      ...
    }
     */
  }
}
