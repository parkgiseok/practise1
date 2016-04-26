package algorithm.ex03;

  public class Test {
    public static void main(String[] args) {

    Queue queue = new Queue();
    queue.poll("홍길동");
    queue.poll("임꺽정");
    queue.poll("유관순");
    queue.poll("안창호");
    queue.poll("김원봉");
    queue.poll("김구");

    for (int i = 0; i < queue.size(); i++) {
      System.out.println(queue.poll);
    }
  }
}
