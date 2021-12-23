package problem2;

/**
 * A exception class that is defined if a recipient does not match the receiver.
 */
public class RecipientNotMatchException extends Exception {

  /**
   * Constructor for RecipientNotMatchException
   */
  public RecipientNotMatchException() {
    super("Recipient is not matched");
  }
}
