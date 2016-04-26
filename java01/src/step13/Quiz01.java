/* 문제1) 입력 받은 두 수 중 더 큰 수를 출력하시오
34, 78  --> 78
*/

package step13;
public class Quiz01{
  public static void main(String[] args){
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);

    if (a > b){
      System.out.println(a);
    } else {
      System.out.println(b);
    }
  }
}
