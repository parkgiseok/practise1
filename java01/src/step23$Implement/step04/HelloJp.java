package step23$Implement.step04;

import java.util.ArrayList;
import java.util.Calendar;

public class HelloJp extends AbstractHello {
  ArrayList<String> list = new ArrayList<>();

  public HelloJp() {
    list.add("こんにちは");
    list.add("곤방와");
  }


  @Override
  public String greet() {
    return this.sayHello(); // 기존 코드를 손대지 않는다.
    // 현업에 가면 기존 메서드를 변경 하다가 다른 프로그램에 더 큰
    // 문제를 불러올 수 있다.
  }

  // 이건 기존에 이미 사용한 경우를 대비해서 제거하지 않았음.
  public String sayHello() {
    Calendar cal = Calendar.getInstance();
    int hour = cal.get(Calendar.HOUR);
    if(hour < 18) {
      return list.get(0);
    } else {
      return list.get(1);
    }
  }
}
