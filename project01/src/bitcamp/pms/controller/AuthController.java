package bitcamp.pms.controller;

import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import bitcamp.pms.annotation.RequestMapping;
import bitcamp.pms.dao.MemberDao;
import bitcamp.pms.domain.Member;
import bitcamp.pms.util.CommandUtil;
import bitcamp.pms.util.Session;

@Controller
public class AuthController {
  @Autowired
  MemberDao memberDao;
  
  Scanner keyScan;
  Session session;
 
  @RequestMapping("unsubscribe")
  public void unsubscribe(Session se, Scanner keyScan) {
    if (CommandUtil.confirm(keyScan, "정말 탈퇴하시겠습니까?")) {
      try {
        Member loginUser = (Member)se.getAttribute("loginUser");
        memberDao.delete(loginUser.getNo());
        System.out.println("회원 정보를 삭제하였습니다. 안녕히 가세요.");
      } catch (Exception e) {
        System.out.println("데이터를 저장하는데 실패했습니다.");
      }
    }
  }
  
  public void service(Scanner keyScan, Session session) {
    this.keyScan = keyScan;
    this.session = session;
    
    String input = null;
    while (true) {
      System.out.println("1) 로그인");
      System.out.println("2) 회원가입");
      System.out.println("9) 종료");
      System.out.print("선택? ");
      input = keyScan.nextLine();
      
      switch (input) {
      case "1":
        if (doLogin()) {
          return;
        }
        break;
      case "2":
        doSignUp();
        break;
      case "9":
        System.out.println("안녕히가세요");
        System.exit(0);
        break;
      default:
        System.out.println("올바르지 않은 번호입니다.");
      }
    }
  }
  
  private void doSignUp() {
    Member member = new Member();
    
    System.out.print("이름: ");
    member.setName(keyScan.nextLine());
    
    String value = null;
    while (true) {
      System.out.print("이메일: ");
      value = keyScan.nextLine();
      if (value.matches("[a-zA-Z][\\w\\.]*@([\\w]+\\.)+[a-zA-Z]{2,}"))
        break;
      System.out.println("이메일 형식에 맞지 않습니다. 예) aaa.aaa@bbb.com");
    }
    member.setEmail(value);
    
    String regex = null;
    Pattern pattern = null;
    Matcher matcher = null;
    
    while (true) {
      System.out.print("암호: ");
      value = keyScan.nextLine();
      
      if (value.length() < 4 || value.length() > 10) {
        System.out.println("암호는 4 ~ 10자 까지만 가능합니다.");
        continue;
      }
      
      regex = String.format(
          "(?=.*\\d)(?=.*[a-zA-Z])(?=.*[!@?])[0-9a-zA-Z!@?]{%d}", 
          value.length());

      pattern = Pattern.compile(regex);
      matcher = pattern.matcher(value); 
      
      if (matcher.find()) {
        break;
      }
      
      System.out.println(
          "최소 알파벳1개, 숫자1개, 특수문자(?,!,@)1개를 반드시 포함해야 합니다.");
    }
    member.setPassword(value);
    
    while (true) {
      System.out.print("전화: ");
      value = keyScan.nextLine();
      if (value.matches("(\\d{2,4}-)?\\d{3,4}-\\d{4}"))
        break;
      System.out.println("전화 형식에 맞지 않습니다. 예) 02-123-1234");
    }
    member.setTel(value);
    
    try {
      memberDao.insert(member);
      System.out.println("회원 가입되었습니다.");
    } catch (Exception e) {
      System.out.println("회원 가입에 실패했습니다.");
    }
  }

  private boolean doLogin() {
    System.out.print("이메일: ");
    String email = keyScan.nextLine();
    
    System.out.print("암호: ");
    String password = keyScan.nextLine();
    
    HashMap<String,Object> paramMap = new HashMap<>();
    paramMap.put("email", email);
    
    Member member = memberDao.selectOne(paramMap);
    
    if (member == null) {
      System.out.println("등록되지 않은 사용자입니다.");
      return false;
    } else if (!member.getPassword().equals(password)) {
      System.out.println("암호가 맞지 않습니다.");
      return false;
    }
    
    // 로그인 성공한 회원 정보를 세션에 보관한다.
    // why? 다른 컨틀롤러가 사용할 수 있도록!
    session.setAttribute("loginUser", member);
    
    System.out.printf("환영합니다. %s님!\n", member.getName());
    
    return true;
  }
}
