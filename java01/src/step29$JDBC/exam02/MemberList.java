// 주제 : 질의하기 - SELECT 문 보내기

package step29$JDBC.exam02;

import java.util.List;

public class MemberList {

  public static void main(String[] args) throws Exception {
    try {
      MemberDao memberDao = new MemberDao();
      List<Member> list = memberDao.selectList();

      for (Member member : list) {
        System.out.printf("%d, %s, %s, %s\n",
            member.getNo(),
            member.getName(),
            member.getEmail(),
            member.getPassword());
      }
    } catch (Exception e) {
      System.out.println("데이터를 가져오는데 실패했습니다.");
    }
  }
}
