package problem2;

/**
 * A exception class that is defined if locker is empty.
 */
public class LockerEmptyException extends Exception{

  /**
   * Constructor for LockerEmptyException
   */
  public LockerEmptyException(){
    super("Lock is empty");
  }
}
