/* 회원 데이터를 다룰 사용자 정의 데이터 타입 선언하라!
회원번호, 이름, 아이디, 암호, 전화, 이메일
*/

package step12;
public class 	Member {
  static int count;
  private int no;
  private String name;
  private String id;
  private String pw;
  private int num;
  private String email;

  {
    this.no = ++count;
  }

  public Member(String name, String id, String pw, int num, String email) {
    setName(name);
    setId(id);
    setPw(pw);
    setNum(num);
    setEmail(email);
  }

  public int getNo() {
    return no;
  }
  public void setNo(int no){
    this.no = no;
  }


  public String getName() {
    return name;
  }
  public void setName(String name){
    this.name = name;
  }


  public String getId() {
    return id;
  }
  public void setId(String id){
    this.id = id;
  }


  public String getPw() {
    return pw;
  }
  public void setPw(String pw){
    this.pw = pw;
  }


  public int getNum() {
    return num;
  }
  public void setNum(int num){
    this.num = num;
  }


  public String getEmail() {
    return email;
  }
  public void setEmail(String email){
    this.email = email;
  }



}
