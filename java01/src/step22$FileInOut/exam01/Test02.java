// 주제 : 파일 생성, 삭제
package step22$FileInOut.exam01;

import java.io.File;
import java.io.IOException;

public class Test02 {
  public static void main(String[] args) throws IOException {
    File f = new File("./test02.txt");
    // f.createNewFile();  // 파일이 없으면 생성, 있으면 생성 안함.
    // f.delete(); // 파일이 있으면 삭제, 없으면 삭제 안함.

    // File f2 = new File("./testok.txt");
    // f.renameTo(f2);  // 기존 파일의 이름을 변경

    // f.mkdir();  // 디렉토리 생성

    if (f.delete()) {  // 파일 뿐만 아니라 폴더를 지울 수 있다.
      System.out.println("삭제 성공!!");
    } else {
      System.out.println("삭제 실패!!");
    } // 하지만 폴더 안에 내용물이 있으면 삭제가 되지 않는다.

    
  }
}
/*

*/
