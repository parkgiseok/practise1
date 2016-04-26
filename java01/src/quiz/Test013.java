package quiz;

//출처: codefights.com
//한 줄에 버그가 있다. 고쳐라!
/*
For given n and k find the sum of all multiples of k
that are not greater than n.
Example
sumOfMultiples(7, 2) = 2 + 4 + 6 = 12
[input] integer n
positive integer
[input] integer k
positive integer
[output] integer
 */
public class Test013 {
  public static void main(String[] args) {
  		int[] sumOfMultiples = {7, 2};
  		int result = 0;

  	    for (int i = 1; i <=sumOfMultiples[0]; i++)
  	    {
  	      if (i % sumOfMultiples[1] == 0) {
  	        result += i;  // result == i;
  	      }
  	    }
  	    System.out.println(result);
  	  }
  }
