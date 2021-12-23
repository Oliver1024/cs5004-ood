package problem1;

/**
 * A exceptional class that will throw exceptions when condition is reached.
 */
public class InvalidSizePropertyException extends Exception {

  public InvalidSizePropertyException() {
    super("Property size is invalid");
  }
}
