package problem1;

/**
 * A class that inherits its parent class named ExteriorService
 */
public class Gardening extends ExteriorService{
  private static final int WASTE_FEE = 20;
  private static final int TEN_TIMES = 10;
  private static final int NINE_TIMES = 9;
  private static final double HALF_PRICE = 0.5;
  private static final double DISCOUNT_PRICE = 0.9;

  /**
   * A constructor that creates a new object of Gardening.
   * @param propertyAddress - String, propertyAddress of the new Gardening object
   * @param sizeOfProperty  - enumerate, sizeOfProperty of the new Gardening object
   * @param monthlyService  - boolean, monthlyService of the new Gardening object
   * @throws InvalidSizePropertyException when if condition is not matched
   * @throws InvalidPropertyAddressException when if condition is not matched
   */
  public Gardening(String propertyAddress, PropertySize sizeOfProperty, boolean monthlyService)
      throws InvalidSizePropertyException, InvalidPropertyAddressException {
    super(propertyAddress, sizeOfProperty, monthlyService);

  }

  /**
   * This method is used to get the total price of this service
   * @param o, Object, taking this as a parameter
   * @return double, total price of this service
   */
  @Override
  public double calculatePrice(Object o) {
    double tempPrice;

    tempPrice = WASTE_FEE + super.getNumberOfHours() * BASE_PRICE;
    if(super.getMonthlyService()){
      tempPrice = timeService % TEN_TIMES == NINE_TIMES ? (tempPrice * HALF_PRICE) :
          (tempPrice * DISCOUNT_PRICE);
    }else{
      tempPrice = timeService % TEN_TIMES == NINE_TIMES ? (tempPrice * HALF_PRICE) : tempPrice;
    }
    super.setTotalPrice(tempPrice);

    return super.getTotalPrice();
  }
}
