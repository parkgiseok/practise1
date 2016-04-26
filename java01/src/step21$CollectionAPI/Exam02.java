// 주제 : Collection API - ArratList 2
package step21$CollectionAPI;

import java.util.ArrayList;
import java.util.Date;

public class Exam02 {
  public static void main(String[] args) {
    ArrayList<Object> list = new ArrayList<>();
    list.add("홍길동");
    list.add("임꺽정");
    list.add(new Integer(10));
    list.add(new Date());

    System.out.println(list.indexOf("홍길동")); // 0(배열의 첫번째)
    // indexOf()는 레퍼런스 주소가 아니라 내용을 비교한다.
    System.out.println(list.indexOf(new String("임꺽정"))); // 1

    System.out.println("홍길동" == new String("홍길동")); // false
    // 서로 다른 래퍼런스다
    System.out.println(list.contains(new String("홍길동"))); // true
    // 레퍼런수 주소가 달라도 내용을 비교하여 찾는다.

    System.out.println("--------------------------------");

    ArrayList<Object> list2 = new ArrayList<>();
    list2.add("오호라");
    list2.add("우헤헤");

    list.addAll(list2);

    // for (레퍼러스 : 배열 또는 Collection 타입 객체) {}
    // => 배열 또는 컬렉션 전체를 반복한다.
    for (Object element : list) {
      System.out.println(element);
    }
  }
}
