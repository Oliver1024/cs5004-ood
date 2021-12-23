package problem2;

import java.util.Objects;

/**
 * A simple class that define  x and y of a position
 */
public class Posn {

  private Integer x;
  private Integer y;

  /**
   * Constructor that includes x and y
   *
   * @param x - Integer, x
   * @param y - Integer, y
   */
  public Posn(Integer x, Integer y) {
    this.x = x;
    this.y = y;
  }

  /**
   * @return x value
   */
  public Integer getX() {
    return this.x;
  }

  /**
   * @return y value
   */
  public Integer getY() {
    return this.y;
  }

  /**
   * {@inheritDoc}
   *
   * @param o Object, taking this value as a parameter
   * @return boolean value after comparing those two x and y
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Posn posn = (Posn) o;
    return Objects.equals(x, posn.x) && Objects.equals(y, posn.y);
  }

  /**
   * {@inheritDoc}
   *
   * @return a hash code value of those 2 x and y
   */
  @Override
  public int hashCode() {
    int result = this.x != null ? this.x.hashCode() : 0;
    result = 31 * result + (this.y != null ? this.y.hashCode() : 0);
    return result;
  }

  /**
   * {@inheritDoc}
   *
   * @return strings of x and y
   */
  @Override
  public String toString() {
    return "Posn{" +
        "x=" + x +
        ", y=" + y +
        '}';
  }
}
