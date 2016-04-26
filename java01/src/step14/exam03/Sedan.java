// Generalization의 예 :
// => Sedan과 Truck의 공통점을 식별하기 위해 상위 클래스를 정의한다.
// => Car를 상속하는 코드를 쿠가한다.
package step14.exam03;

public class Sedan extends Car {
  /* Car 클래스로 옮김
  String title;  // 모델명
  String company;  // 제조사명
  int cc;  // cc
  int maxCount;  // 최대 수용 인원
  */
  boolean isAutomatic;
  boolean isSunroof;
}
