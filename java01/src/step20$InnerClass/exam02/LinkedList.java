package step20$InnerClass.exam02;

public class LinkedList {
    // 중첩 클래스 선언 = LinkedList에서만 사용할 클래스이다.
    // Bucket은 LinkedList의 멤버
    private class Bucket {
      Object value;
      Bucket next;

      public Bucket() {
      }

      public Bucket(Object value, Bucket next) {
        this.value = value;
        this.next = next;
      }
    }


  Bucket start;
  Bucket end;
  int count;

  public LinkedList() { // 빈 객체를 저장하자
    start = new Bucket();
    end = start;
  }

  public int size() {
    return count;
  }

  public void add(Object value) { // 쓸데 없이 변수를 만들지 말자
    end.value = value;
    end.next = new Bucket();
    end = end.next;
    count++;
  }

  public void add(int index, Object value) {
    // 1) index 유효범위 검사
    if (index < 0 || index > count) {
      return;
    }
    // 2) index가 0일 때
    if (index == 0) {
      Bucket newBucket = new Bucket(value, start);
      start = newBucket;
      return;
    }
    // 3) index가 빈 버킷을 가리킬 때


    // 4) index가 가리키는 항목의 직전 항목을 찾아서 새 버킷을 연결
    Bucket cursor = start;
    for (int i = 0; i < index - 1; i++) {
      cursor = cursor.next;
    }
    cursor.next = new Bucket(value, cursor.next);
    count++;
  }

  public Object get(int index) {
    // cursor에 스타트를 저장한다.
    // 해당 인덱스를 만날 때까지 타고 올라간다.
    // 해당 버킷의 값을 리턴한다.
    Bucket cursor = start;
    for (int i = 0; i < index; i++) {
      cursor = cursor.next;
    }
    return cursor.value;
  }

  public Object remove(int index) {
    // 1) 인덱스의 유효여부 검사 : index < 0, count 이상
    if (index < 0 || index >= count) {
      return null;
    }

    Object temp = null;
    count--;

    // 2) 0번째를 지울 때
    if (index == 0) {
      temp = start.value;
      start = start.next;
      return temp;
    }

    // 3) 1 이상의 인덱스를 지울 때
    Bucket cursor = start;
    for (int i = 0; i < index - 1; i++) {
      cursor = cursor.next;
    }
    temp = cursor.next.value;
    cursor.next = cursor.next.next;
    return temp;
  }

  public Object set(int index, Object value) {
    if (index < 0 || index >= count) {
      return null;
    }

    Bucket cursor = start;
    for (int i = 0; i < index; i++) {
      cursor = cursor.next;
    }

    Object temp = cursor.next.value;
    cursor.value = value;
    return temp;
  }

}
