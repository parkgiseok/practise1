package step12; // 복사하기

public class Car6{
  static int count;
  // 모든 인스턴스가 공유하는 데이터는 스태틱 변수에 보관하라!

  private int no; // 고유 자동차 번호
  private String model;
  private String maker;
  private int cc;
  private int capacity;


  { // 인스턴스 블럭의 예 --> 무조건 실행
    this.no = ++Car6.count;
  }


  // public으로 공개함
  public Car6() {

  }
  // 오버로딩 - 생성자끼리 파라미터가 달라야 한다.
  // (파라미터의 변수명은 같아도 타입은 무조건 달라야 한다)
  public Car6(String model, String maker, int cc, int capacity) {

    this.setModel(model); // 우항의 변수는 파라미터, 좌항은 인스턴스
    this.setMaker(maker);
    this.setCc(cc);
    this.setCapacity(capacity);
  }

  public int getNo() {
    return this.no;
  }


  public String getModel() {
     return this.model;
  }
  public void setModel(String model) {
     this.model = model;
  }


  public String getMaker() {
     return this.maker;
  }
  public void setMaker(String maker) {
     this.maker = maker;
  }


  public int getCc() {
     return this.cc;
  }
  public void setCc(int cc) {
    if(cc > 0 && cc <= 10000){
     this.cc = cc;
    }
  }


  public int getCapacity() {
     return this.capacity;
  }
  public void setCapacity(int capacity) {
    if(capacity > 0 && capacity < 100){
     this.capacity = capacity;
    }
  }


}
