// 주제 : 데이터 변경하기 - update 문 보내기

package step29$JDBC.exam04;

public class MemberUpdate {

  public static void main(String[] args) throws Exception {
    try {
      Member member = new Member();
      member.setNo(5);
      member.setName("을지문덕");
      member.setEmail("eulgi@test.com");
      member.setPassword("1111");
      member.setTel("1111-2222");
      
      MemberDao memberDao = new MemberDao(
          "com.mysql.jdbc.Driver",
          "jdbc:mysql://localhost:3306/java80db",
          "java80",
          "1111");
      
      int count = memberDao.update(member); 

      System.out.printf("변경 개수: %d\n", count);

      memberDao.destroy(); // MemberDao가 준비한 자원을 해제시킬 기회를 준다.

    } catch (Exception e) {
      System.out.println("변경 실패입니다.");
    }
  }
}
