package step18$Generic;

public class Test6 {
  public static void main(String[] args) {
    Bucket6<String> p = new Bucket6<>();
    Bucket6<Float> p2 = new Bucket6<>();
    Bucket6<Integer> p3 = new Bucket6<>();
    Bucket6<java.util.Date> p4 = new Bucket6<>();

    p.value = new String("okok");
    p3.value = new Integer(20);
    p2.value = new Float(3.14f);
    p4.value = new java.util.Date();

  }
}
/*


*/
