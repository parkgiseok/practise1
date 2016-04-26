package designpattern.command.exam04;

public class MinusCommand implements Command{
  public void execute(int a, int b) {
    System.out.printf("%d - %d = %d\n", a, b, (a - b));
  }
  
}
