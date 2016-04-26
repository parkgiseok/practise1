package step12;

public class Car3{
  // 자동차 마다 개별 정보를 저장할 변수
  // 모델명(문자열 - model), 제조사(문자열 - maker), CC(int - CC),
  // 수용인원(int - capacity)

  String model;
  String maker;
  int cc;
  int capacity;

  Car3(String model, String maker, int cc, int capacity) {
      this.model = model; // 우항의 변수는 파라미터, 좌항은 인스턴스
      this.maker = maker;
      this.cc = cc;
      this.capacity = capacity;


  }

}
