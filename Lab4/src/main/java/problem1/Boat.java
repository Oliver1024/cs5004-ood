package problem1;

/**
 * A class that defined a boat object inherits from superclass of Vehicle
 */
public class Boat extends Vehicle {

  /**
   * Construct that creates a new object of Boat.
   *
   * @param ID           String, ID of the boat
   * @param averageSpeed Float, averageSpeed of the boat
   * @param maxSpeed     Float, maxSpeed of the boat
   */
  public Boat(String ID, Float averageSpeed, Float maxSpeed) {
    super(ID, averageSpeed, maxSpeed);
  }
}
