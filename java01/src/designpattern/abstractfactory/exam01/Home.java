package designpattern.abstractfactory.exam01;

public class Home {
  String image;
  int defense;
  int attack;
  
  @Override
  public String toString() {
    return "[그림=" + image + ", 방어력=" + defense + ", 공격력=" + attack + "]";
  }
  
}
