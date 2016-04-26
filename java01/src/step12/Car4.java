package step12;

public class Car4{
  // 자동차 마다 개별 정보를 저장할 변수
  // 모델명(문자열 - model), 제조사(문자열 - maker), CC(int - CC),
  // 수용인원(int - capacity)

  String model;
  String maker;
  int cc;
  int capacity;

  // 기본 생성자
  Car4() {

  }
  // 오버로딩 - 생성자끼리 파라미터가 달라야 한다.
  // (파라미터의 변수명은 같아도 타입은 무조건 달라야 한다)
  Car4(String model, String maker, int cc, int capacity) {
      this.model = model; // 우항의 변수는 파라미터, 좌항은 인스턴스
      this.maker = maker;
      this.cc = cc;
      this.capacity = capacity;
  }

}
