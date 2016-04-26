package step12;

public class Car5{
  // 캡슐화 (private)
  private String model;
  private String maker;
  private int cc;
  private int capacity;

  // public으로 공개함
  public Car5() {

  }
  // 오버로딩 - 생성자끼리 파라미터가 달라야 한다.
  // (파라미터의 변수명은 같아도 타입은 무조건 달라야 한다)
  public Car5(String model, String maker, int cc, int capacity) {
    this.model = model; // 우항의 변수는 파라미터, 좌항은 인스턴스
    this.maker = maker;
    this.setCc(cc);
    this.setCapacity(capacity);
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
