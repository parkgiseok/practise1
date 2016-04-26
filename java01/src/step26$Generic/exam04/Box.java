// 목표 : 제네릭(Generic) 적용
package step26$Generic.exam04;

public class Box<T> {
  private T value;

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }
}
