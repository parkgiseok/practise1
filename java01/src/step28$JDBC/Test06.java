// 주제 : 다양한 예외 확인

package step28$JDBC; // 주석 복사

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Driver;

public class Test06 {

  public static void main(String[] args) throws Exception {
    DriverManager.registerDriver(new Driver());

    try (
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/java80db",
        "java80",
        "1111")
    ) {
      System.out.println("연결 성공!");
    } 
  }
}
/* 
# 오타 등의 이유로 JDBC URL 형식이 잘못되었을 때 
=> No suitable driver found for jdbc;mysql://localhost:3306/java80db

# 해당 IP를 가진 컴퓨터가 실행중이지 않을 때,
# 포터번호가 다를 때, 
# MySQL 서버가 멈췄을 때,
=> Communications link failure
=> The driver has not received any packets from the server.
=> Caused by: java.net.ConnectException: 연결이 거부됨

# 존재하지 않는 DBMS를 가리킬 때,
# 아이디가 존재하지 않거나 암호가 맞지 않을 때,
=> Access denied for user 'java80'@'localhost' to database 'java80db2'
=> Access denied for user 'java80'@'localhost' (using password: YES)

# 최대 연결 개수를 초과할 때
=> Too many connections
*/