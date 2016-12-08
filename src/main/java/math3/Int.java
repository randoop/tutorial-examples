package math3;

public class Int {

  private final int value;


  @Override
  public String toString() {
    return Integer.toString(value);
  }

  private Int() {
    this.value = 0;
  } //hidden

  public void dontCallMe() {
    System.err.println("this method calls System.exit()");
    System.exit(1);
  }

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
