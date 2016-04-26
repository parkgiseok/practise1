// 주제 : 클래스 정보 알아내기 2
package step25$ReflectionApi;

public class Test02 {
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

  public static void main(String[] args) throws Exception{
    // 1) 방법1 => 인스턴스를 통해서 Class 객체 얻기
    Member m = new Member();
    Class clazz1 = m.getClass();
    System.out.println(clazz1.getName());
    
    // 2) 방법2 => 해당 클래스의 숨겨진 스태틱 변수 "class"를 사용하
    // 모든 클래스는 숨겨진 스태틱 변수 "class"가 있다.
    // 스태틱 변수 "class"는 해당 클래스의 정보를 가리킨다.
    Class clazz2 = Member.class; // <-- 파일 확장자 아니다!
    // .class는 클래스 정보를 가리키는 인스턴스가 담겨있다.
    // => 기본으로 생성되는 스태틱 변수이다.

    Member.count = 10; // <-- "class" 변수는 "count"와 같은 스태틱 변수이다.
    
    System.out.println(clazz2.getName());
    System.out.println(Member.class.getName());
    
    if (clazz2 == Member.class) {
      System.out.println("clazz2 == Member.class");
    }
    
    // 3) 방법3 => 클래스의 이름을 사용하여 클래스 정보를 알아내기
    // 가장 많이 사용하는 방법
    Class clazz3 = Class.forName("step25$ReflectionApi.Test02$Member");
    System.out.println(clazz3.getName());
  }
}
