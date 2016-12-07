package math;

public class Int {

  private final int value;

  public String toString() {
    return Integer.toString(value);
  }

  private Int() {
    this.value = 0;
  }

  public Int(int value) {
    this.value = value;
  }

  public Int add(Int other) {
    return new Int(this.value + other.value);
  }

}
