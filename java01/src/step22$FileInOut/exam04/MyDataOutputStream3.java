package step22$FileInOut.exam04;

import java.io.IOException;
import java.io.OutputStream;

public class MyDataOutputStream3 {
  OutputStream out;

  // 생성자의 존재 이유?
  // => 객체를 사용하는데 필요한 최소한의 준비를 시키는 메서드
  public MyDataOutputStream3(OutputStream out) {
    // OutputStream의 자식 클래스의 인스턴스는 다 받겠다.
    // OutputStream는 추상클래스라 인스턴스 생성 자체가 불가능하지만
    // 하위 클래스를 폭 넓게 받기 위해서...
    this.out = out;
  }

  public void writeShort(short value) throws IOException {
    out.write(value >> 8);
    out.write(value);
  }

  public void writeInt(int value) throws IOException {
    out.write(value >> 24);
    out.write(value >> 16);
    out.write(value >> 8);
    out.write(value);
  }
}
