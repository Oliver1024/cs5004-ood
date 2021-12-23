package problem1;

import java.util.Objects;

/**
 * A class that have 3 fields, defined a general vehicle class.
 */
public class Vehicle {

  private String ID;
  private Float averageSpeed;
  private Float maxSpeed;

  /**
   * A constructor that creates a new object of Vehicle.
   *
   * @param ID           String, ID of the new object
   * @param averageSpeed Float, averageSpeed of the new object
   * @param maxSpeed     Float, maxSpeed of the new object
   */
  public Vehicle(String ID, Float averageSpeed, Float maxSpeed) {
    this.ID = ID;
    this.averageSpeed = averageSpeed;
    this.maxSpeed = maxSpeed;
  }

  /**
   * Return ID of Vehicle
   *
   * @return String, ID of Vehicle
   */
  public String getID() {
    return ID;
  }

  /**
   * Return average speed of vehicle
   *
   * @return Float, average speed of vehicle
   */
  public Float getAverageSpeed() {
    return averageSpeed;
  }

  /**
   * Return max speed of vehicle
   *
   * @return Float, max speed of vehicle
   */
  public Float getMaxSpeed() {
    return maxSpeed;
  }

  /**
   * {@inheritDoc} A method provided by java.lang.Object that indicates whether some other object
   * passed as an argument is "equal to" the current instance.
   *
   * @param o Object, taking this object as a parameter
   * @return boolean, a boolean value after compare with those fields of Vehicle object
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vehicle vehicle = (Vehicle) o;
    return Objects.equals(getID(), vehicle.getID()) && Objects
        .equals(getAverageSpeed(), vehicle.getAverageSpeed()) && Objects
        .equals(getMaxSpeed(), vehicle.getMaxSpeed());
  }

  /**
   * {@inheritDoc} Return a hashcode value of the Object
   *
   * @return int, a hashcode value of the object
   */
  @Override
  public int hashCode() {
    return Objects.hash(getID(), getAverageSpeed(), getMaxSpeed());
  }

  /**
   * {@inheritDoc} Returns the value given to it in string format.
   *
   * @return String, returns the value given to it in string format
   */
  @Override
  public String toString() {
    return "Vehicle{" +
        "ID='" + ID + '\'' +
        ", averageSpeed=" + averageSpeed +
        ", maxSpeed=" + maxSpeed +
        '}';
  }
}
