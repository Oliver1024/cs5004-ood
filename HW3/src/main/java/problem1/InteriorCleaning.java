package problem1;

/**
 * This is a concrete class that inherit from InteriorService class.
 */
public class InteriorCleaning extends InteriorService {

  private static final int TWO_VALUE = 2;
  private static final int ONE_VALUE = 1;
  private static final int THREE_VALUE = 3;
  private static final double FIRST_DISCOUNT = 0.05;
  private static final double SECOND_DISCOUNT = 0.07;
  private static final double HALF_PRICE = 0.5;
  private static final double DISCOUNT_PRICE = 0.9;
  private static final int TEN_VALUE = 10;
  private static final int NINE_VALUE = 9;
  private static final int FOUR_HOUR = 4;
  private static final int TWO_HOUR = 2;
  private static final int ONE_HOUR = 1;

  /**
   * Constructor that creates a new InteriorCleaning object..
   *
   * @param propertyAddress - String, propertyAddress of the new ElectricalWork object
   * @param sizeOfProperty  - enumerate, sizeOfProperty of the new ElectricalWork object
   * @param monthlyService  - boolean, monthlyService of the new ElectricalWork object
   * @param numberOfFloors  - Integer, numberOfFloors of the new ElectricalWork object
   * @param numberOfPets    - Integer, numberOfPets of the new ElectricalWork object
   * @throws InvalidSizePropertyException    when if condition is not matched
   * @throws InvalidPropertyAddressException when if condition is not matched
   */
  public InteriorCleaning(String propertyAddress, PropertySize sizeOfProperty,
      boolean monthlyService,
      Integer numberOfFloors, Integer numberOfPets)
      throws InvalidSizePropertyException, InvalidPropertyAddressException {
    super(propertyAddress, sizeOfProperty, monthlyService, numberOfFloors, numberOfPets);

    switch (sizeOfProperty) {
      case LARGE:
        super.setNumberOfHours(FOUR_HOUR);
      case MEDIUM:
        super.setNumberOfHours(TWO_HOUR);
      default:
        super.setNumberOfHours(ONE_HOUR);
    }
  }

  /**
   * This method is used to get the total price of this service
   *
   * @param o, Object, taking this as a parameter
   * @return double, total price of this service
   */
  @Override
  public double calculatePrice(Object o) {
    double tempPrice;

    tempPrice = super.getNumberOfHours() * BASE_PRICE;
    if (super.getNumberOfPets() >= ONE_VALUE && super.getNumberOfPets() <= TWO_VALUE) {
      tempPrice *= (ONE_VALUE + FIRST_DISCOUNT);
    } else if (super.getNumberOfPets() >= THREE_VALUE) {
      tempPrice *= (ONE_VALUE + SECOND_DISCOUNT);
    }
    if (super.getMonthlyService()) {
      tempPrice = timeService % TEN_VALUE == NINE_VALUE ? (tempPrice * HALF_PRICE) :
          (tempPrice * DISCOUNT_PRICE);
    } else {
      tempPrice = timeService % TEN_VALUE == NINE_VALUE ? (tempPrice * HALF_PRICE) : tempPrice;
    }

    super.setTotalPrice(tempPrice);
    return super.getTotalPrice();
  }
}
