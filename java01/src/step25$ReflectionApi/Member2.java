package step25$ReflectionApi;

public class Member2 {
  public static int count;

  String name;

  public Member2() {
    System.out.println("Member()....");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  protected void m1() {}
  
  void m2() {}
  
  private void m3() {}
}
