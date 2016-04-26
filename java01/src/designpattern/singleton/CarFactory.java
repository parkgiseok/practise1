// Singleton 패턴 적용
package designpattern.singleton;

public class CarFactory {
  // 1) 기본 생성자를 private으로 접근을 제한한다.
  // => 외부에서 생성자를 호출할 수 없기 때문에 결국 외부에서 객체를 생성할 수 없다.
  private CarFactory() {}
  
  // 2) 객체의 주소를 저장할 static 변수를 준비한다.
  static CarFactory instance;
  
  // 3) 객체를 리턴할 static 메서드를 준비한다.
  public static CarFactory newInstance() {
    if (instance == null) {
      instance = new CarFactory();
    }
    return instance;
  }
  
  public Car newCar(String name) {
    Car c = new Car();
    
    switch (name) {
    case "tico":
      c.model = "티코";
      c.cc = 800;
      return c;
    case "sonata":
      c.model = "소나타";
      c.cc = 1997;
      return c;
    default:
      return null;
    }
  }
}
