// 주제 : 예외 처리와 연결 해제 4 - 프로그램에서 예외처리 하기

package step28$JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Driver;

public class Test05 {

  public static void main(String[] args) throws Exception {
    DriverManager.registerDriver(new Driver());

    try (
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/java80db", 
        "java80", 
        "1111")
    ) {
      System.out.println("연결 성공!");
      System.out.printf("5 / 0 = %d\n", 5 / 0);
      System.out.println("맑은 날씨입니다."); // 실행 안됨.
    } catch (Exception e) {
      System.out.println("잠시 DBMS와 연결이 원활하지 않습니다.\n잠시 후 다시 시도해 주세요.");
    }
  }
}
/* 

*/