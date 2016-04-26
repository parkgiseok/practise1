// 주제 : 데이터 삭제하기 - delete 문 보내기

package step29$JDBC.exam04;

public class MemberDelete {

  public static void main(String[] args) throws Exception {
    try {
      MemberDao memberDao = new MemberDao(
          "com.mysql.jdbc.Driver",
          "jdbc:mysql://localhost:3306/java80db",
          "java80",
          "1111");
      
      int count = memberDao.delete(9); 

      System.out.printf("삭제 개수: %d\n", count);

      memberDao.destroy(); // MemberDao가 준비한 자원을 해제시킬 기회를 준다.

    } catch (Exception e) {
      System.out.println("삭제 실패입니다.");
    }
  }
}
