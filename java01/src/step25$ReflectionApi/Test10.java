// 주제 : Reflection Api - 메서드를 호출할 때 여러 개의 값 넘기기

package step25$ReflectionApi;

import java.lang.reflect.Method;

public class Test10 {
  static class Member {
    String name;
    int age;
    float weight;
    float height;
    
    public void setMember(String name, int age, float weight, float height) {
      this.name = name;
      this.age = age;
      this.weight = weight;
      this.height = height;
    }

    @Override
    public String toString() {
      return "Member [name=" + name + ", age=" + age + ", weight=" + weight + 
          ", height=" + height + "]";
    }
    
  }

  public static void main(String[] args) throws Exception {
    Class<?> clazz = Class.forName("step25$ReflectionApi.Test10$Member");  
    
    // 1) 인스턴스 생성
    Object obj = clazz.newInstance();
    // obj -> 실질적으로 Member의 객체
    
    // 2) setMember() 메서드 찾기
    Method m = clazz.getDeclaredMethod("setMember"
        , String.class, int.class, float.class, float.class);
    
    // 3) 파라미터가 여러 개인 메서드 호출하기
    // => 아규먼트를 배열에 담아서 넘기기
    Object[] arguments = {"신민아", 20, 45.5f, 173.4f};
    m.invoke(obj, arguments);
    System.out.println(obj);
    
    System.out.println("-----------------------------------------------------");
    
    // => 아규먼트를 차례로 나열하기
    m.invoke(obj, "설현", 19, 40.5f, 168.5f);
    System.out.println(obj);
    
  }
}