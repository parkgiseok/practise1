/* 주어진 수를 오름차순으로 정렬하시오
64, 5, 2, 74, 13, 98 --> 2, 5, 13, 64, 74, 98
*/
package step13;
public class Quiz04{
  public static void main(String[] args) {
    int[] a = new int[args.length];
    int t;

    for (int j = 0; j < args.length; j++){
      a[j] = Integer.parseInt(args[j]);
    }
    for (int k = 0; k < args.length; k++){
    for (int i = 1; i < args.length; i++){
      if (a[i - 1] > a[i]) {
        t = a[i - 1];
        a[i - 1] = a[i];
        a[i] = t;
      }
    }
    }
    for (int i = 0; i < a.length; i++){
    System.out.println(a[i]);
    }

}
}
