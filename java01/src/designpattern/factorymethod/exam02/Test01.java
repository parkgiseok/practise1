// 주제 : factory 메서드 적용

package designpattern.factorymethod.exam02;

public class Test01 {

  public static void main(String[] args) {
    CarFactory factory = new CarFactory();
    
    // 티코 객체 생성
    Car c1 = factory.createCar("tico");
    
    // 소나타 객체 생성
    Car c2 = factory.createCar("sonata");    
  }
}
/*
# 팩토리 메서드 설계 패턴
- 객체 생성 과정이 복잡한 경우, 매번 직접 객체를 생성하기 보다는
  메서드를 통해 객체를 얻는 것이 유지보수에 좋다.
- 메서드를 통해 객체를 생성하는 설계 방식을 "Factory Method" 패턴이라 부른다.

*/