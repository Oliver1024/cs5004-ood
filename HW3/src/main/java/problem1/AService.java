package problem1;

import java.util.Objects;

/**
 * This is the top abstract class and have those propertyAddress, sizeOfProperty,monthlyService,
 * numberOfHours,numberOfFloors,timeService and totalPrice fields.
 */
public abstract class AService {

  private String propertyAddress;
  private PropertySize sizeOfProperty;
  private boolean monthlyService;
  private int numberOfHours;
  protected int numberOfFloors;
  protected int timeService = 1;
  private double totalPrice;

  /**
   * Constructor that creates a new AService object.
   *
   * @param propertyAddress - String, propertyAddress of the new AService object
   * @param sizeOfProperty  - enumerate, sizeOfProperty of the new AService object
   * @param monthlyService  - boolean, monthlyService of the new AService object
   * @throws InvalidSizePropertyException    when if condition is not matched
   * @throws InvalidPropertyAddressException when if condition is not matched
   */
  protected AService(String propertyAddress, PropertySize sizeOfProperty, boolean monthlyService)
      throws InvalidSizePropertyException, InvalidPropertyAddressException {
    if (sizeOfProperty == null) {
      throw new InvalidSizePropertyException();
    } else if (propertyAddress == null) {
      throw new InvalidPropertyAddressException();
    }
    this.propertyAddress = propertyAddress;
    this.sizeOfProperty = sizeOfProperty;
    this.monthlyService = monthlyService;
  }

  /**
   * Return total price
   *
   * @return double, total price
   */
  public double getTotalPrice() {
    return totalPrice;
  }

  /**
   * Return number of hours
   *
   * @return Integer, number of hours
   */
  public Integer getNumberOfHours() {
    return numberOfHours;
  }

  /**
   * Return monthly service
   *
   * @return boolean, monthly service
   */
  public boolean getMonthlyService() {
    return monthlyService;
  }

  /**
   * Return number of floors
   *
   * @return int, number of floors
   */
  public int getNumberOfFloors() {
    return numberOfFloors;
  }

  /**
   * Set number of hours to this.numberOfHours
   *
   * @param numberOfHours, Integer, passing this parameter
   */
  public void setNumberOfHours(Integer numberOfHours) {
    this.numberOfHours = numberOfHours;
  }

  /**
   * Set totalPrice to this.totalPrice
   *
   * @param totalPrice, double, passing this parameter
   */
  public void setTotalPrice(double totalPrice) {
    this.totalPrice = totalPrice;
  }

  /**
   * Set number of floors to this.numberOfFloors
   *
   * @param numberOfFloors, Integer, passing this parameter
   */
  public void setNumberOfFloors(Integer numberOfFloors) {
    this.numberOfFloors = numberOfFloors;
  }

  /**
   * Set timeService to this.timeService
   *
   * @param timeService, int passing this parameter
   */
  public void setTimeService(int timeService) {
    this.timeService = timeService;
  }

  /**
   * {@inheritDoc}
   * A method provided by java.lang.Object that indicates whether some other object
   * passed as an argument is "equal to" the current instance.
   *
   * @param o, - Object, taking this object as a parameter
   * @return a boolean value after compare with those fields of AService object
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AService aService = (AService) o;
    return monthlyService == aService.monthlyService
        && Double.compare(aService.getTotalPrice(), getTotalPrice()) == 0
        && Objects.equals(getNumberOfHours(), aService.getNumberOfHours())
        && Objects.equals(numberOfFloors, aService.numberOfFloors);
  }

  /**
   * Return a hashcode value of the Object
   *
   * @return int, a hashcode value of the object
   */
  @Override
  public int hashCode() {
    return Objects
        .hash(monthlyService, getNumberOfHours(),
            numberOfFloors, getTotalPrice());
  }

  /**
   * Returns the value given to it in string format.
   *
   * @return String, returns the value given to it in string format.
   */
  @Override
  public String toString() {
    return "AService{" +
        "propertyAddress='" + propertyAddress + '\'' +
        ", sizeOfProperty=" + sizeOfProperty +
        ", monthlyService=" + monthlyService +
        ", numberOfHours=" + numberOfHours +
        ", numberOfFloors=" + numberOfFloors +
        ", totalPrice=" + totalPrice +
        '}';
  }

  /**
   * A abstract method that used to calculate price of each service
   *
   * @param o, Object, taking this as a parameter
   */
  public abstract double calculatePrice(Object o);

}
