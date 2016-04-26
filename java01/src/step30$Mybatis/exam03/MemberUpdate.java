// 주제 : SQL Mapper인 mybatis 적용하기 - MemberDao에 적용하기 - update
package step30$Mybatis.exam03;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MemberUpdate {

  public static void main(String[] args) throws Exception {
    InputStream inputStream = 
        Resources.getResourceAsStream("step30/exam02/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = 
        new SqlSessionFactoryBuilder().build(inputStream);
    
    MemberDao memberDao = new MemberDao();
    memberDao.setSqlSessionFactory(sqlSessionFactory);
    
    Member member = new Member();
    member.setNo(11);
    member.setName("신민아");
    member.setEmail("sin@test.com");
    member.setTel("1111-3333");
    
    memberDao.update(member);
    System.out.println("변경 성공!");
  }
}
/*

*/
