//
package step14.exam05;

public abstract class Car {
  String model;
  String maker;
  int cc;
  int capacity;

  public void printInfo() {
    System.out.printf("모델: %s\n", model);
    System.out.printf("제조사: %s\n", maker); // 없는게 변형 된 문법
    System.out.printf("cc: %d\n", this.cc); // 앞에 this 붙이는게 원래 문법
    System.out.printf("최대수용인원: %d\n", this.capacity);

  }
}
