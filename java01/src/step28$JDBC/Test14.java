// 주제 : Statement 사용 시 문제점 해결  - PreparedStatement 사용

package step28$JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test14 {

  public static void main(String[] args) throws Exception {
    Connection con = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/java80db", "java80", "1111");
      
      String str = "1 or 1=1";
      
      // 1) 미리 SQl문을 준비한다.
      // 단, 값이 입력되어야 할 부분은 IN-PARAMETER(?)로 표시한다.
      stmt = con.prepareStatement("select * from MEMBERS where MNO=?");
      
      // 2) 값을 따로 입력한다.
      // 숫자 값을 입력할 때 setString()을 사용할 수 있다.
      // 원래는 setInt()를 사용해야 한다.
      // preparedStatement는 지정된 위치에 들어갈 수 있는 값만 넣는다.
      // 해커가 임의의 SQL문을 삽입할 수 없다.
      stmt.setString(1, str);

      // 3) 질의를 수행한다.
      rs = stmt.executeQuery();
      
      while (rs.next()) {
        System.out.printf("%d, %s, %s, %s\n",
            rs.getInt("MNO"),
            rs.getString("MNAME"),
            rs.getString("EMAIL"),
            rs.getString("PWD"));
      }

    } finally {
      try {rs.close();} catch (Exception e) {}
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
  }
}

/* preparedStatement vs Statement
preparedStatement의 특징 
1) 임의의 SQL 코드를 삽입할 수 없다. ==> 보안이 좋다.
2) SQL문과 값이 분리되어 있다. ==> 코드 작성 및 가독성이 좋다.
3) 바이너리 데이터를 저장할 수 있다. 
   ==> Statement에서는 Base64와 같은 특별한 인코딩을 수행한 후에 저장할 수 있다.
       그래도 직접 바이너리 데이터를 저장할 수는 없다.
       
# Base64 (바이너리 --> 문자열)
- 바이너리 데이터를 영어 대/소문자, 숫자(0~9), '+', '/'를 이용하여 문자열로 변환할 때 사용.
- 주로 바이너리 데이터를 문자열로 저장할 때 사용한다.
- 저장된 데이터를 사용할 때는 문자열을 원래의 바이너리 값으로 복원(디코딩)한 후 사용.
       
예상 면접 질문 ================================================================
* preparedStatement는 값을 분리했기 때문에 임의의 sql 코드를 삽입할 수 없다 => 보안이 좋다 
* 2011년도 행안부 자바 시큐어 코딩 가이드에 따르면 질의를 던질 때
  in parameter 방식으로 해야한다고 나와있다.
*/