// 여러 개의 속성 선언하

package step27$Annotation.exam06;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Component {
  String value() default "haha"; // <-- 선택 속성
  String title(); // <-- 필수 입력 속성
  int no() default 100; // <-- 선택 속성
}
