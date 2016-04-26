package step12;

public class Car7{
  static int count;
  private int no;
  private String model;
  private String maker;
  private int cc;
  private int capacity;


  {
    // 인스턴스 블록/메서드에서는 this를 생략할 수 있다.
    // 자기가 속해 있는 클래스의 스태틱 변수나 메서드를 호출할 때
    // 클래스 이름을 생략할 수 있다.
    no = ++count;
    // 직관적으로 알 수 없기 때문에 가능한 스태틱 변수, 클래스 명은 적는게 좋다
  }


  // public으로 공개함
  public Car7() {

  }
  public Car7(String model, String maker, int cc, int capacity) {
    // 인스턴스 블록/메서드에서 다른 인스턴스 메서드를 호출할 떄
    // this를 생략할 수 있다.
    // => this를 생략하면, 컴파일할 때 컴파일러가 자동으로 붙인다.
    setModel(model);
    setMaker(maker);
    setCc(cc);
    setCapacity(capacity);
  }

  public int getNo() {
    return no;
  }


  public String getModel() {
    // this를 생략할 수 있다.
    return model;
  }
  public void setModel(String model) {
    // 이 경우는 this를 생략할 수 없다
    // 왜? 로컬 변수 이름이 인스턴스 변수 이름과 같기 때문에
    // this를 빼면 둘을 구분할 수 없다.
    this.model = model;
  }


  public String getMaker() {
    return maker;
  }
  public void setMaker(String maker) {
    this.maker = maker;
  }


  public int getCc() {
    return cc;
  }
  public void setCc(int cc) {
    if(cc > 0 && cc <= 10000){
    this.cc = cc;
    }
  }


  public int getCapacity() {
    return capacity;
  }
  public void setCapacity(int capacity) {
    if(capacity > 0 && capacity < 100){
    this.capacity = capacity;
    }
  }


}
