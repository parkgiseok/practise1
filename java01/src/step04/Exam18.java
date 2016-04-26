/* 주제: 명시적 형변환과 암시적 형변환 함께 사용하기 */
package step04;

public class Exam18 {
  public static void main(String[] args) {
    int a = 5;
    int b = 2;
    float c = a / (float)b;
    System.out.println(c);  // 2.5

    int ch = 44032;  // 유니코드 : 0xac00
    System.out.println(ch); // 10진수 : 44032
    System.out.println((char)ch); // 가

  }
}
/* 문자 출력
=> 현재 사용하는 폰트 파일에서 해당 코드의 문자 그림을 찾아서 화면에 출력.
=> 만약 그 폰트에 코드 값에 해당하는 문자가 없다면 출력하지 못한다.
=> Arial 폰트 파일에는 한글이 없다.
  --> Arial 폰트를 사용하여 한글을 출력할 수 없다.
=> 종류
  1) Raster(bitmap)
    - 픽셀로 표현
    - 화면 확대할 때 계단현상 발생
    - 복사 -> 출력 : 출력 속도가 빠르다
    예) 래스터 폰트, .bmp, .gif, .jepg
  2) Vector(true type)
    - 선 그리기 명령
    - 화면을 확대하거나 축소하더라도 깨끗하게 출력
    - 출력할 때 마다 계산해야 하기 때문에 출력 속도가 느리다.
    예) 클립아트(파워포인트), CAD image
*/
