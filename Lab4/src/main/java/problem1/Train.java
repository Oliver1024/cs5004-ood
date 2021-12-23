package problem1;

/**
 * A class that defined a Train class inheriting from superclass of Vehicle.
 */
public class Train extends Vehicle {

  /**
   * A constructor that creates a new object of Train.
   *
   * @param ID           String, ID of the Train
   * @param averageSpeed Float, averageSpeed of the Train
   * @param maxSpeed     Float, maxSpeed of the Train
   */
  public Train(String ID, Float averageSpeed, Float maxSpeed) {
    super(ID, averageSpeed, maxSpeed);
  }
}
