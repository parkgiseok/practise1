package step22$FileInOut.exam05;

public class Member {
  String name;
  int age;
  int height;
  int weight;

  public Member() {} // 빈객체에 담아서 읽는다.

  public Member(String name, int age, int height, int weight) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  @Override
  public String toString() {
    return this.name + ", " + this.age + ", " + this.height + ", " + this.weight;
  }

}
