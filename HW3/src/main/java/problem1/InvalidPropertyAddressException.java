package problem1;

/**
 * A exceptional class that will throw exceptions when condition is reached.
 */
public class InvalidPropertyAddressException extends Exception{
  public InvalidPropertyAddressException(){
    super("Property address is invalid");
  }
}
