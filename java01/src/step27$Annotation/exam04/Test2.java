// 주제 : 클래스에서 특정 애노테이션만 추출하기

package step27$Annotation.exam04;

public class Test2 {
  
  public static void main(String[] args) {    
    Class<?> clazz = Member.class;
    
    Component anno = clazz.getAnnotation(Component.class);
    
    System.out.println(anno.value());
  }
}
