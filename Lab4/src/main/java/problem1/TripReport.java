package problem1;

import java.util.Objects;

/**
 * A class that defined a tripReport class with 4 fields.
 */
public class TripReport {

  private Vehicle vehicle;
  private Float speed;
  private Float distance;
  private Integer duration;

  /**
   * A constructor that creates a new object of the TripReport.
   *
   * @param vehicle  Vehicle, vehicle of the new object
   * @param speed    Float, speed of the new object
   * @param distance Float, distance of the new object
   * @param duration Integer, duration of the new object
   */
  public TripReport(Vehicle vehicle, Float speed, Float distance, Integer duration) {
    this.vehicle = vehicle;
    this.speed = speed;
    this.distance = distance;
    this.duration = duration;
  }

  /**
   * Return vehicle
   *
   * @return Vehicle vehicle
   */
  public Vehicle getVehicle() {
    return vehicle;
  }

  /**
   * Return speed
   *
   * @return Float, speed
   */
  public Float getSpeed() {
    return speed;
  }

  /**
   * Return distance
   *
   * @return Float, distance
   */
  public Float getDistance() {
    return distance;
  }

  /**
   * Return duration
   *
   * @return Integer, duration
   */
  public Integer getDuration() {
    return duration;
  }

  /**
   * A method provided by java.lang.Object that indicates whether some other object passed as an
   * argument is "equal to" the current instance.
   *
   * @param o Object, taking this object as a parameter
   * @return boolean, a boolean value after compare with those fields of TripReport object
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TripReport that = (TripReport) o;
    return Objects.equals(getVehicle(), that.getVehicle()) && Objects
        .equals(getSpeed(), that.getSpeed()) && Objects
        .equals(getDistance(), that.getDistance()) && Objects
        .equals(getDuration(), that.getDuration());
  }

  /**
   * Return a hashcode value of the Object
   *
   * @return int, a hashcode value of the object
   */
  @Override
  public int hashCode() {
    return Objects.hash(getVehicle(), getSpeed(), getDistance(), getDuration());
  }

  /**
   * Returns the value given to it in string format.
   *
   * @return String, returns the value given to it in string format.
   */
  @Override
  public String toString() {
    return "TripReport{" +
        "vehicle=" + vehicle +
        ", speed=" + speed +
        ", distance=" + distance +
        ", duration=" + duration +
        '}';
  }
}
