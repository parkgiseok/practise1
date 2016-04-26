package step14.exam08;

public class B extends A {
    float v4 = 3.14f;
    char v5;

    public B() {
      super();  // 이걸 생성자 코드 밑에다가 쓰면
      
      System.out.println("B의 생성자 -------------");
      v1 = "현아";
      v3 = false;
      v5 = '가';

      // super(); // error: call to super must be first statement in constructor
      // 반드시 위에 써주거나 아에 쓰지 말기
    }

}
