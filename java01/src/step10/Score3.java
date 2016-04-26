/* Score2의 메서드 접근 레벨을 조정한다. */
package step10;

class Score3 {
  private String name;
  private int kor;
  private int eng;
  private int math;
  private int sum;
  private float aver;

  // Score3 클래스를 오로지 step10 패키지에서만 사용할 것이라면 => (default)
  // 다른 패키지에서도 사용할 수 있게 하려면 => public으로 공개하라!
  public Score3(String name, int kor, int eng, int math) {
    this.name = name;
    this.setKor(kor);
    this.setEng(eng);
    this.setMath(math);
  }

  // summary()와 average()는 점수 값을 설정할 때만 호출되기 때문에
  // 굳이 외부로 공개할 필요가 없다.
  // => 같은 패키지 클래스에게도 공개할 필요가 없다. => privat으로 변경라하!
  private void summary() {
    this.sum = this.kor + this.eng + this.math;
    this.average();
  }
  private void average() {
    this.aver = this.sum / 3f;
  }

  // 겟터/셋터는 외부에서 사용해야 하기 때문에 공개하는 것이 좋다.
  // => 보통 public으로 완전 공개한다.
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getKor() {
    return this.kor;
  }

  public void setKor(int kor) {
    if (kor >= 0 && kor <= 100) {
    this.kor = kor;
    this.summary();
    }
  }

  public int getEng() {
    return this.eng;
  }

  public void setEng(int eng) {
    if (eng >= 0 && eng <= 100) {
    this.eng = eng;
    this.summary();
    }
  }

  public int getMath() {
    return this.math;
  }

  public void setMath(int math) {
    if (math >= 0 && math <= 100) {
    this.math = math;
    this.summary();
    }
  }

  public int getSummary() {
    return this.sum;
  }

  public float getAverage() {
    return this.aver;
  }
}
