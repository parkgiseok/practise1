// 주제 : 클래스 정보 알아내기

package step25$ReflectionApi;

public class Test01 {
  static class Member {
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
  
  public static void main(String[] args) {
    Member m = new Member();
    m.setName("홍길동");
    
    // 1) 인스턴스의 클래스 정보 가져오기
    Class clazz = m.getClass();  // 해당 인스턴스의 클래스 정보를 다루는 객체를 리턴한다.
    
    //=> 클래스 이름 알아내기
    System.out.println(clazz.getName());
    
    //=> 수퍼 클래스 정보 알아내기
    Class superClass = clazz.getSuperclass();
    System.out.println(superClass.getName());
    
  }
}
