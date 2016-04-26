// 주제 : 바이트 출력하기 4
package step22$FileInOut.exam02;

import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;

public class Test04 {
  public static void main(String[] args) throws IOException {
    FileOutputStream out = new FileOutputStream("exam02.Test04.data");

    byte[] bytes = {0x2a, 0x3b, 0x4c, 0x5d, 0x6f, 0x7a};

    out.write(bytes, 2, 3); // 2번방 부터 3개를 출력
    // offset - 전체 메모리에서 JVM에게 할당된 상대적 주소(여기선 2)

    // 주의!! OS 자원을 사용하는 경우, 사용 후 반드시 해제해야 한다.
    out.close();

  }
}
/*


*/
