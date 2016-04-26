/* 두 수 사이에 있는 수 중에서 짝수 값을 출력하시오
4, 12 --> 4, 6, 8, 10, 12
*/
package step13;
public class Quiz02{
  public static void main(String[] args){
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);

    for (int i = a; i <= b; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
  }
}
