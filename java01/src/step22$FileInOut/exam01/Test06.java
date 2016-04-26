// 주제 : .txt 확장자를 갖는 파일명만 출력하라!
package step22$FileInOut.exam01;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class Test06 {
  public static void main(String[] args) throws IOException {
    File f = new File(".");

    // 파일 필터 클래스 정의
    // class MyFilter implements FileFilter {
    //
    // }

    // 익명 이너 클래스 사용
    // 현재 폴더의 파일 이름을 모두 출력한다.
    File[] files = f.listFiles(new FilenameFilter() {
          @Override
          public boolean accept(File dir, String name) {
            File temp = new File(dir, name);
            if (temp.isFile() && name.endsWith(".txt")) return true;
            else return false;
          }
        });

		for(File file : files) {
      System.out.println(file.getName());
    }
  }
}

/*

*/
