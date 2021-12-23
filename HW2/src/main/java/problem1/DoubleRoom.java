package problem1;

/**
 * Class DoubleRoom stores information about a price. This class inherits from Room class.
 */
public class DoubleRoom extends Room {

  private static final int DOUBLE_ROOM_OCCUPANCY = 2;

  /**
   * Constructor for DoubleRoom
   *
   * @param price, int, representing price
   */
  public DoubleRoom(int price) {
    super(DOUBLE_ROOM_OCCUPANCY, price);
  }
}
