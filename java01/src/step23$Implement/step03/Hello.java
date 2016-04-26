package step23$Implement.step03;

public class Hello extends AbstractHello {
  // 추상 메서드이기 때문에 구현하지 않으면 오류!!
  @Override
  public String greet() {
    return "안녕하세요.^^";
  }
}
