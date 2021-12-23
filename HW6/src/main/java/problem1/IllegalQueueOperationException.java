package problem1;

/**
 * Represent a exceptional class
 */
public class IllegalQueueOperationException extends Exception{

  /**
   * An exceptional that is passed in message as a String
   * @param message String, message
   */
  public IllegalQueueOperationException(String message) {
    super(message);
  }
}
