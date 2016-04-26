// 주제 : 원시 타입 값을 출력하기 - Refactoring(코드 개선) : 인스턴스 변수 사용
package step22$FileInOut.exam04;

import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Test05 {

  public static void main(String[] args) throws IOException {
    FileOutputStream out = new FileOutputStream("exam04.Test05.data");

    short no = 17;
    int kor = 100;
    int eng = 89;
    int math = 75;

    MyDataOutputStream3 helper = new MyDataOutputStream3(out);
    helper.writeShort(no);
    helper.writeInt(kor);
    helper.writeInt(eng);
    helper.writeInt(math);

    out.close();
  }
}
/*

*/
