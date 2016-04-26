// 주제 : 실행 중에 애노테이션 정보 추출하기

package step27$Annotation.exam06;

import java.lang.annotation.Annotation;

public class Test {
  
  public static void main(String[] args) {    
    Class<?> clazz = Member.class;
    Component anno = clazz.getAnnotation(Component.class);
    System.out.println(anno.value());
    System.out.println(anno.title());
    System.out.println(anno.no());
    
    System.out.println("----------------");
    
    clazz = Member2.class;
    Annotation[] annos = clazz.getAnnotations();
    for (Annotation a : annos) {
      System.out.println(a);
    }
  }
}
