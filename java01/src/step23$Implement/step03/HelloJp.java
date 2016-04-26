package step23$Implement.step03;

import java.util.ArrayList;
import java.util.Calendar;

public class HelloJp extends ArrayList<String>{
  public HelloJp() {
    this.add("こんにちは");
    this.add("こんばんは");
  }

  public String sayHello() {
    Calendar cal = Calendar.getInstance();
    int hour = cal.get(Calendar.HOUR);
    if(hour < 18) {
      return this.get(0);
    } else {
      return this.get(1);
    }
  }
}
