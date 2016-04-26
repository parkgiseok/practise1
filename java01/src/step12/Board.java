/* 게시물 데이터를 다룰 사용자 정의 데이터 타입을 선언하라!
게시물번호, 제목, 내용, 작성자, 조회수, 작성일(long)

*/

package step12;

public class Board {
  static int count;
  private int boardno;
  private String title;
  private String content;
  private String name;
  private int join;
  private long date;

  {
    this.boardno = ++count;
  }

  public Board(String title, String content, String name, int join, long date) {
    setTitle(title);
    setContent(content);
    setName(name);
    setJoin(join);
    setDate(date);

  }

  public int getBoardno() {
    return boardno;
  }
  public void setBoardno(int boardno){
    this.boardno = boardno;
  }


  public String getTitle() {
    return title;
  }
  public void setTitle(String title){
    this.title = title;
  }


  public String getContent() {
    return content;
  }
  public void setContent(String content){
    this.content = content;
  }


  public String getName() {
    return name;
  }
  public void setName(String name){
    this.name = name;
  }


  public int getJoin() {
    return join;
  }
  public void setJoin(int join){
    this.join = join;
  }


  public long getDate() {
    return date;
  }
  public void setDate(long date){
    this.date = date;
  }
}
