// 주제: HashMap - 키 만 꺼내기
package step21$CollectionAPI;

import java.util.HashMap;
import java.util.Collection;
import java.util.Set;

public class Exam18 {
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
      Member m = (Member)other;
      if (!this.name.equals(m.name)) {
        return false;
      }

      if (this.age != m.age ) {
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

    // 맵에서 키 목록을 꺼낸다.
    // set 봉다리는 중복이 안된다. (키)
    Set<String> keys = map.keySet();
    for (String key : keys) {
      System.out.printf("%s - %s\n", key, map.get(key));
    }

  }
}

/*

*/
