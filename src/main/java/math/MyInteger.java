package math;

import java.util.Objects;

/** v1 */
public class MyInteger {

  private final int value;

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof MyInteger) {
      MyInteger other = (MyInteger)obj;
      return this.value == other.value;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.value);
  }

  @Override
  public String toString() {
    return Integer.toString(value);
  }

  private MyInteger() {
    this.value = 0;
  }

  public MyInteger(int value) {
    this.value = value;
  }

  public MyInteger add(MyInteger other) {
    return new MyInteger(this.value + other.value);
  }

  public MyInteger multiply(MyInteger other) {
    int a = Math.abs(this.value);
    int b = Math.abs(other.value);
    int product = a * b;
    if (this.value < 0 || other.value < 0) {
      return new MyInteger(-1 * product);
    }
    return new MyInteger(product);
  }

  public int getIntValue() {
    return value;
  }
}
