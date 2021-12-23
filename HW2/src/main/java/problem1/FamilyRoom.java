package problem1;

/**
 * Class FamilyRoom stores information about a price. This class inherits from Room class.
 */
public class FamilyRoom extends Room {

  private static final int FAMILY_ROOM_OCCUPANCY = 4;

  /**
   * Constructor for FamilyRoom
   *
   * @param price, int, representing price
   */
  public FamilyRoom(int price) {
    super(FAMILY_ROOM_OCCUPANCY, price);
  }
}
