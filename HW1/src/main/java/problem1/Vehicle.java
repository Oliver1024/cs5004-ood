package problem1;

/**
 * Vehicle is a simple object that has a unique Vehicle Identification Number (VIN), and
 * corresponding license plate.
 */
public class Vehicle {

  public Owner owner;
  public Integer VIN;
  public String licensePlate;

  /**
   * Constructor that creates a new vehicle object with the specified VIN and license plate.
   *
   * @param VIN          - VIN of the new Vehicle object.
   * @param licensePlate - license plate of the new Vehicle.
   */
  public Vehicle(Owner owner, Integer VIN, String licensePlate) {
    this.owner = owner;
    this.VIN = VIN;
    this.licensePlate = licensePlate;
  }

  /**
   * Get Owner of Vehicle
   *
   * @return Owner of the vehicle
   */
  public Owner getOwner() {
    return this.owner;
  }

  /**
   * Returns the VIN of the Vehicle.
   *
   * @return the VIN OF THE Vehicle.
   */
  public Integer getVIN() {
    return this.VIN;
  }

  /**
   * Returns the licensePlate of the Vehicle.
   *
   * @return the licensePlate of the Vehicle.
   */
  public String getLicensePlate() {
    return licensePlate;
  }

  /**
   * Set Owner of vehicle
   *
   * @param owner of the vehicle
   */
  public void setOwner(Owner owner) {
    this.owner = owner;
  }

  /**
   * Sets the VIN of the Vehicle.
   *
   * @param VIN - Vehicle Identification Number of Vehicle
   */
  public void setVIN(Integer VIN) {
    this.VIN = VIN;
  }

  /**
   * Sets the licensePlate of the Vehicle.
   *
   * @param licensePlate the licensePlate of the Vehicle
   */
  public void setLicensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
  }

}