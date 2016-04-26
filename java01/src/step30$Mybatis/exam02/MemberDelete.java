// 주제 : SQL Mapper인 mybatis 적용하기 - MemberDao에 적용하기 - update
package step30$Mybatis.exam02;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MemberDelete {

  public static void main(String[] args) throws Exception {
    InputStream inputStream = 
        Resources.getResourceAsStream("step30/exam02/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = 
        new SqlSessionFactoryBuilder().build(inputStream);
    
    MemberDao memberDao = new MemberDao();
    memberDao.setSqlSessionFactory(sqlSessionFactory);
    
    memberDao.delete(10);
    System.out.println("삭제 성공!");
  }
}
/*

*/
