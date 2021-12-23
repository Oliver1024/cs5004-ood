package problem1;

/**
 * Class SingleRoom stores information about a price. This class inherits from Room class.
 */
public class SingleRoom extends Room {

  private static final int SINGLE_ROOM_OCCUPANCY = 1;

  /**
   * Constructor for SingleRoom
   * @param price, int, representing price
   */
  public SingleRoom(int price) {
    super(SINGLE_ROOM_OCCUPANCY, price);
  }
}
