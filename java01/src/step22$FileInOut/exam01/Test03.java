// 주제 : 디렉토리에 있는 모든 파일(디렉토리 포함) 목록을 알아내기
package step22$FileInOut.exam01;

import java.io.File;
import java.io.IOException;

public class Test03 {
  public static void main(String[] args) throws IOException {
    File f = new File(".");
    System.out.println(f);
    File[] fileList = f.listFiles();
    for (int i = 0; i < fileList.length; i++) {
      File file = fileList[i];
      if (file.isFile()) {
        System.out.println("파일 이름 = " + file.getName());
      } else if (file.isDirectory()) {
        System.out.println("디렉토리 이름 = " + file.getName());
      }
    }
  }
}

/*

*/
