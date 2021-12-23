package problem2;

/**
 * A exception class that is defined if locker has been occupied.
 */
public class LockerOccupiedException extends Exception{

  /**
   * Constructor for LockerOccupiedException.
   */
  public LockerOccupiedException(){
    super("Locker is occupied");
  }
}
