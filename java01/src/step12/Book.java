/*
책 데이터를 다룰 사용자 정의 데이터 타입을 선언하라!
책번호, isbn, 제목, 저자들, 출판사, 총페이지수, 가격, 소개
*/

package step12;

public class Book{
  static int count;
  private int no;
  private String isbn;
  private String tilte;
  private String writer; // 최대 10명까지 저장
  private String publisher;
  private int page;
  private int price;
  private String intro;

  {
    this.no = ++count;
  }

  public Member (String isbn, String tilte, String writer, String publisher,
                 int page, int price, String intro) {
  setIsbn(isbn);
  setTitle(title);
  setWriter(writer);
  setPublisher(publisher);
  setPage(page);
  setPrice(price);
  setIntro(intro);
  }

  public int getNo () {
    return no;
  }
  public void setNo(int no) {
    this.no = no;
  }


  public String getIsbn () {
    return isbn;
  }
  public void setIbsn(String isbn) {
    this.isbn = isbn;
  }


  public String getTitle () {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  public String getWriter () {
    return writer;
  }
  public void setWriter(String writer) {
    this.writer = writer;
  }


  public String getPublisher () {
    return publisher;
  }
  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }


  public int getPage () {
    return page;
  }
  public void setPage(int page) {
    this.page = page;
  }

.......................................................

}
