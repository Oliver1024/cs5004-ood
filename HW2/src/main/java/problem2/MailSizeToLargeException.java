package problem2;

/**
 * A exception class that is defined if mail size too large or not.
 */
public class MailSizeToLargeException extends Exception{

  /**
   * Constructor for MailSizeToLargeException.
   */
  public MailSizeToLargeException(){
    super("Mail size is too large.");
  }
}
