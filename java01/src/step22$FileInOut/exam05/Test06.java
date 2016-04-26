// 주제 : 대용량 데이터 쓰기 = 버퍼링 데코레이터 사용 전
package step22$FileInOut.exam05;

import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;

public class Test06 {

  public static void main(String[] args) throws IOException {
    // 실제 작업을 수행할 객체를 준비한다.
    FileOutputStream out = new FileOutputStream("exam05.Test06.data");
    long start = System.currentTimeMillis();

    for (int i = 0; i < 5000000; i++) {
      out.write(0x41);
    }

    long end = System.currentTimeMillis();
    System.out.printf("걸린시간: %d\n", end - start);

    // 안하면 JVM이 자동 close
    out.close();
  }
}
/*

*/
