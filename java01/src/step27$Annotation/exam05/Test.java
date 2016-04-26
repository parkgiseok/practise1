// 주제 : 실행 중에 애노테이션 정보 추출하기

package step27$Annotation.exam05;

public class Test {
  
  public static void main(String[] args) {    
    Class<?> clazz = Member.class;
    Component anno = clazz.getAnnotation(Component.class);
    System.out.println(anno.value());
  }
}
