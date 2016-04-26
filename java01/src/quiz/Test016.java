package quiz;
//출처: codefights.com
//한 줄에 버그가 있다. 고쳐라!
/*
Determine whether the given string is a concatenation of another string
to itself.
Example
for 'tandemtandem' output should be true
for 'qqq' or '2w2ww' output should be false
[input] string inputString
[output] boolean
true if inputString represents a string concatenated to itself,
false otherwise
 */
public class Test016 {
  public static void main(String[] args) {
    String isTandemRepeat = "abcdeabcde";
    int len = isTandemRepeat.length();
    boolean found = true;

        if (len % 2 == 1)
        {
          found = false;
        }
        for (int i = 0; i < len/2; i++)
        {  //    for (int i = 0; i < len; i++) {
          if (isTandemRepeat.charAt(i) != isTandemRepeat.charAt(i + len / 2)) {
            found = false;
          }
        }
        System.out.println(found);
  }
}
