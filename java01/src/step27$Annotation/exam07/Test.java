// 주제 : 실행 중에 애노테이션 정보 추출하기

package step27$Annotation.exam07;

public class Test {
  
  public static void main(String[] args) {    
    Class<?> clazz = Member.class;
    // Class<?> clazz = Member2.class; // 이것도 가능
    Component anno = clazz.getAnnotation(Component.class);
    // System.out.println(anno);
    String[] list = anno.value();
    
    for (String s : list) {
      System.out.println(s);
    }
  }
}
