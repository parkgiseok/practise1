// 주제: 현재 폴더 및 하위 폴더까지 뒤져서 .class 파일의 이름을 출력하라.
package step22$FileInOut.exam01;

import java.io.File;
import java.io.IOException;

public class Test07 {
  public static void main(String[] args) throws IOException {
    File f = new File(".");

    printFilename(f, ".class");
  }

  static void printFilename(File f, String ext) throws IOException {
    if (f.isFile()) {
      if (f.getName().endsWith(ext)) {
        System.out.println(f.getCanonicalPath());
      }
    } else {
      File[] files = f.listFiles();
      for (File file : files) {
        printFilename(file, ext);
      }
    }
  }
}
