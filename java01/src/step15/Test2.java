package step15;

public class Test2 {
  public static void main(String[] args) {
    DeveloperCalculator c = new DeveloperCalculator();

    c.init(10);
    c.plus(5);
    // c.minus(3);
    c.multiple(3);
    // c.divide(3);
    // c.remainder(3);
    c.printResult(); // 45
    c.printResult(2); // 101101
    c.printResult(8); // 55
    c.printResult(16);
    c.printResult(10);


  }
}
