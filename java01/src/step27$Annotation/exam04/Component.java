package step27$Annotation.exam04;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Component {
  String value(); // <- 속성을 정의할 때 메서드처럼 정의한다.
  

}
