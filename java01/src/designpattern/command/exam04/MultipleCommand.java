// 곱셈 기능을 추가!!
// 기존 클래스의 코드를 변경하지 않고, 
// 단지 새 클래스를 만드는것으로 기능추가 가능

package designpattern.command.exam04;

public class MultipleCommand implements Command{
  public void execute(int a, int b) {
    System.out.printf("%d * %d = %d\n", a, b, (a * b));
  }
}
