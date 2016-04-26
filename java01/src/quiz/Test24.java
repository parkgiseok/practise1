package quiz;
//copyright by codefights.com
//한 줄에 버그가 있다. 고쳐라!
/*
Find the area of a rectangle with given sides.
Example
rectangleArea(2, 3) = 6
[input] integer a
positive integer
[input] integer b
positive integer
[output] integer
2가지 수가 있는 배열에서, 뒤에 수 * 앞에 수 해라
 */
public class Test24 {
  static int rectangleArea(int a, int b) {
    int result = 0;
    for (int i = 0; i <= a - 1; i++) {  // for (int i = 0; i <= a; i++) {
      result += b;
    }
    return result;
  }
  public static void main(String[] args) {
    System.out.println(rectangleArea(5, 9)); //결과는 45이어야 함.
  }
}
