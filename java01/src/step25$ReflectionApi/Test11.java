// 주제 : apache BCEL API - 메서드의 정보를 알아내기

package step25$ReflectionApi;

import org.apache.bcel.Repository;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.LocalVariable;
import org.apache.bcel.classfile.Method;
import org.apache.bcel.generic.Type;

public class Test11 {
  static class Member {
    String name;
    int age;
    float weight;
    float height;
    
    public void setMember(String name, int age, float weight, float height) {
      this.name = name;
      this.age = age;
      this.weight = weight;
      this.height = height;
    }

    @Override
    public String toString() {
      return "Member [name=" + name + ", age=" + age + ", weight=" + weight + 
          ", height=" + height + "]";
    }
    
  }

  public static void main(String[] args) throws Exception {
    JavaClass clazz2 = Repository.lookupClass("step25$ReflectionApi.Test11$Member");
    Method[] methods = clazz2.getMethods();
    LocalVariable[] vars = null;
    Type[] types = null;
    
    for (Method m : methods) {
      if (!m.getName().equals("setMember"))
        continue;

      types = m.getArgumentTypes(); // this 변수를 고려하지 않는다. 총 4개
      vars = m.getLocalVariableTable().getLocalVariableTable(); // this 변수 포함

      for (int i = 1; i < vars.length; i++) {
        System.out.printf("%s:%s\n", vars[i].getName(), types[i-1].toString());
      }
    }
  }
}
