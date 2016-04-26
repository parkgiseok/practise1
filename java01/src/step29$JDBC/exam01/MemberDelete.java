// 주제 : 데이터 삭제하기 - delete 문 보내기

package step29$JDBC.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MemberDelete {

  public static void main(String[] args) throws Exception {
    Connection con = null;
    Statement stmt = null;

    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/java80db",
          "java80",
          "1111");
      stmt = con.createStatement();

      int count = stmt.executeUpdate("delete from MEMBERS where mno in (6,7)");

      System.out.printf("삭제 개수: %d\n", count);

    } finally {
      // 자원을 해제할 때는 역순으로 해제해야 한다
      try {
        stmt.close();
      } catch (Exception e) {}
      try {
        con.close();
      } catch (Exception e) {}
    }
  }
}
/* 

*/