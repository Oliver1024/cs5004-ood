package problem1;

/**
 * A class that inherits from its parameter class of InteriorService.
 */
public class Painting extends InteriorService {

  private static final int TWO_VALUE = 2;
  private static final int ONE_VALUE = 1;
  private static final int THREE_VALUE = 3;
  private static final double FIRST_DISCOUNT = 0.05;
  private static final double SECOND_DISCOUNT = 0.07;
  private static final double HALF_PRICE = 0.5;
  private static final double DISCOUNT_PRICE = 0.9;
  private static final int ZERO_VALUE = 0;
  private static final int NINE_VALUE = 9;
  private static final int TWENTY_FOUR = 24;
  private static final int SIXTEEN_VALUE = 16;

  /**
   * A constructor that creates a new object of Painting.
   *
   * @param propertyAddress - String, propertyAddress of the new Painting object
   * @param sizeOfProperty  - enumerate, sizeOfProperty of the new Painting object
   * @param monthlyService  - boolean, monthlyService of the new Painting object
   * @param numberOfPets    - Integer, numberOfPets of the new Painting object
   * @throws InvalidSizePropertyException    when if condition is not matched
   * @throws InvalidPropertyAddressException when if condition is not matched
   */
  public Painting(String propertyAddress, PropertySize sizeOfProperty, boolean monthlyService,
      Integer numberOfPets) throws InvalidSizePropertyException, InvalidPropertyAddressException {
    super(propertyAddress, sizeOfProperty, monthlyService, numberOfPets);

    switch (sizeOfProperty) {
      case LARGE:
        super.setNumberOfHours(TWENTY_FOUR);
        break;
      default:
        super.setNumberOfHours(SIXTEEN_VALUE);
        break;
    }
  }

  /**
   * This method is used to get the total price of this service.
   *
   * @param o, Object, taking this as a parameter
   * @return double, total price of this service
   */
  @Override
  public double calculatePrice(Object o) {
    double tempPrice;

    tempPrice = super.getNumberOfHours() * BASE_PRICE;
    if (super.getNumberOfPets() > 0 && super.getNumberOfPets() <= TWO_VALUE) {
      tempPrice *= (ONE_VALUE + FIRST_DISCOUNT);
    } else if (super.getNumberOfPets() >= THREE_VALUE) {
      tempPrice *= (ONE_VALUE + SECOND_DISCOUNT);
    }
    if (super.getMonthlyService()) {
      tempPrice = timeService % NINE_VALUE == ZERO_VALUE ? (tempPrice * HALF_PRICE) :
          (tempPrice * DISCOUNT_PRICE);
    } else {
      tempPrice = timeService % NINE_VALUE == ZERO_VALUE ? (tempPrice * HALF_PRICE) : tempPrice;
    }

    super.setTotalPrice(tempPrice);
    return getTotalPrice();
  }
}
