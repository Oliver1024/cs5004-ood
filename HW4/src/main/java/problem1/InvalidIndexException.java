package problem1;

/**
 * A exceptional classes that will throw exceptions when condition is matched.
 */
public class InvalidIndexException extends Exception{
  public InvalidIndexException(){
    super("Invalid index");
  }
}
