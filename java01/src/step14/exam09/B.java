package step14.exam09;

public class B extends A {
    float v4 = 3.14f;
    char v5;

    public B() {
      // super();
      System.out.println("B의 생성자 -------------");
      v1 = "현아";
      v3 = false;
      v5 = '가';

    }

}
// B.java:7: error: constructor A in class A cannot be applied to given types;
