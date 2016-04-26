//출처: codefights.com
package quiz;
//한 줄에 버그가 있다. 고쳐라!
/*
You are given an array of integers representing coordinates of obstacles
situated on a straight line.
Assume that you are jumping from the point with coordinate 0 to the right.
You are allowed only to make jumps of the same length represented
by some integer.
Find the minimal length of the jump enough to avoid all the obstacles.
Example
for [5, 3, 6, 7, 9] output should be 4
[input] array.integer inputArray
non-empty array of positive integers
[output] integer
the desired length
 */
public class Test019 {   // 오답 x, 장애물 넘기
  public static void main(String[] args) {
    int[] avoidObstacles = {5,3,6,7,9};
			for (int i = 1; i < avoidObstacles.length; i++) {
				for (int j = 0; j < avoidObstacles.length; j++)
				{
					if (avoidObstacles[j] % i == 0)
					{
						break;
					}
					if (j == avoidObstacles.length - 1)
					{
						System.out.println(i);
					}
				}
			}
	}
}
