// 애노테이션 유지 정책 변경하기 2
package step27$Annotation.exam03;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// => 유지 정책을 RUNTIME으로 변경하자!
// => .class 파일에 주석이 포함된다.
// => 실행할 때 꺼낼 수 있다.
@Retention(RetentionPolicy.RUNTIME)
public @interface Component {
  String value(); // <- 속성을 정의할 때 메서드처럼 정의한다.
  

}
