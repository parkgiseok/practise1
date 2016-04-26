package quiz;
// 출처: codefights.com
// 한 줄에 버그가 있다. 고쳐라!
/*
등비수열(geometric progression 또는 geometric sequence)인지 검사하라.
등비수열이면 true, 아니면 flase를 출력하라.
등비수열이란?
=> 각 항이 그 앞 항과 일정한 비를 가지는 수열.
=> 이 일정한 비를 공비(common ratio)라고 한다.
Example
isGeometricProgression([1, 4, 16]) = true   <--- 공비는 4
isGeometricProgression([2, 4, 8, 17, 34]) = false
*/
public class Test006 {
  public static void main(String[] args) {
    int[][] num = {{1,4,16,64,256}, {1,2,16,64,256}};
    boolean isGeometricsequence = true;

    for (int i = 0; i < num.length; i++) {
      for (int j = 2; j < num[i].length; j++) {
        if (num[i][j] * num[i][j - 2] != num[i][j - 1] * num[i][j - 1])
          isGeometricsequence = false;
      }
      if (isGeometricsequence){
        System.out.println("true");
      }
      else {
        System.out.println("false");
      }
    }
  }
}
