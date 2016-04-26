// 주제: HashMap - entrySet으로 데이터 꺼내기
package step21$CollectionAPI;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Exam15 {
  static class Member {
    String name;
    int age;

    public Member(String name, int age) {
      this.name = name;
      this.age = age;
    }

    @Override
    public String toString() {
      return name + "," + age;
    }

    @Override
    public int hashCode() {
      return this.toString().hashCode();
    }

    @Override
    public boolean equals(Object other) {
      if (other == null || other.getClass() != this.getClass()) {
        return false;
      }
      Member m = (Member) other;
      if (!this.name.equals(m.name)) {
        return false;
      }

      if (this.age != m.age) {
        return false;
      }
      return true;
    }
  }

  public static void main(String[] args) throws Exception {

    Member m1 = new Member("홍길동", 20);
    Member m2 = new Member("임꺽정", 30);
    Member m3 = new Member("유관순", 16);

    // HashMap<key, 값> map;
    HashMap<String, Member> map = new HashMap<>();
    map.put("aaa", m1);
    map.put("bbb", m2);
    map.put("ccc", m3);

    Set<Entry<String, Member>> entrySet = map.entrySet(); // 리턴 값 : [키-값]의 목록

    Map.Entry<String, Member> entry = null;
    for (Object item : entrySet) {
      // 제네릭을 사용하지 않는다면 다음과 같이 매번 형변환을 하여
      // 사용해야 한다.
      entry = (Map.Entry<String, Member>) item;
      System.out.printf("%s-%s\n", entry.getKey(), entry.getValue());
    }
    // key-value 한 쌍 "entry"를 "set"에 담은 것.

  }
}

/*

*/
