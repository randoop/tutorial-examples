package math2;

public class Int {

  private final int value;


  @Override
  public boolean equals(Object other) {
    if (other instanceof Int) {
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    return Integer.toString(value);
  }

  private Int() {
    this.value = 0;
  } //hidden

  public Int(int value) {
    this.value = value;
  }

  public Int add(Int other) {
    return new Int(this.value + other.value);
  }

  public int getIntValue() {
    return value;
  }
}
