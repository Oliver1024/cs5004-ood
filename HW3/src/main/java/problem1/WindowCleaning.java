package problem1;

/**
 * A class that inherits from its parent class of ExteriorService.
 */
public class WindowCleaning extends ExteriorService {

  private static final int TWO_VALUE = 2;
  private static final int THREE_VALUE = 3;
  private static final int ONE_VALUE = 1;
  private static final double HALF_PRICE = 0.05;
  private static final int NINE_VALUE = 9;
  private static final int TEN_VALUE = 10;
  private static final double DISCOUNT_VALUE = 0.9;

  /**
   * Constructor that creates a new WindowCleaning object.
   *
   * @param propertyAddress - String, propertyAddress of the new WindowCleaning object
   * @param sizeOfProperty  - enumerate, sizeOfProperty of the new WindowCleaning object
   * @param monthlyService  - boolean, monthlyService of the new WindowCleaning object
   * @param numberOfFloors  - Integer, numberOfFloors of the new WindowCleaning object
   * @throws InvalidSizePropertyException    when if condition is not matched
   * @throws InvalidPropertyAddressException when if condition is not matched
   */
  public WindowCleaning(String propertyAddress, PropertySize sizeOfProperty, boolean monthlyService
      , int numberOfFloors)
      throws InvalidSizePropertyException, InvalidPropertyAddressException {
    super(propertyAddress, sizeOfProperty, monthlyService);
    super.setNumberOfFloors(numberOfFloors);
  }

  /**
   * This method is used to get the total price of this service.
   *
   * @param o, Object, taking this as a parameter
   * @return double, total price of this service
   */
  @Override
  public double calculatePrice(Object o) {
    double tempPrice = 0;

    int floors = super.getNumberOfFloors();
    if (floors >= TWO_VALUE && floors <= THREE_VALUE) {
      tempPrice = super.getNumberOfHours() * BASE_PRICE * (ONE_VALUE + HALF_PRICE);
    } else if (floors == ONE_VALUE) {
      tempPrice = super.getNumberOfHours() * BASE_PRICE;
    }

    if (super.getMonthlyService()) {
      tempPrice = timeService % TEN_VALUE == NINE_VALUE ? (double) (tempPrice * HALF_PRICE) :
          (double) (tempPrice * DISCOUNT_VALUE);
    } else {
      tempPrice = timeService % TEN_VALUE == NINE_VALUE ?
          (double) (tempPrice * HALF_PRICE) : tempPrice;
    }
    super.setTotalPrice(tempPrice);
    return getTotalPrice();
  }

  /**
   * Returns the value given to it in string format.
   *
   * @return String, returns the value given to it in string format.
   */
  @Override
  public String toString() {
    return super.toString() + "WindowCleaning";
  }
}
