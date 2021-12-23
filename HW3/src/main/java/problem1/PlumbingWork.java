package problem1;

/**
 * A class that inherits from its parent class of SpecialService.
 */
public class PlumbingWork extends SpecialService{
  private static final double HALF_PRICE = 0.5;
  private static final double DISCOUNT_PRICE = 0.9;
  private static final int ZERO_VALUE = 0;
  private static final int NINE_VALUE = 9;
  private static final int TWENTY_VALUE = 20;

  /**
   * A constructor that creates a new object of PlumbingWork.
   * @param propertyAddress - String, propertyAddress of the new PlumbingWork object
   * @param sizeOfProperty - enumerate, sizeOfProperty of the new PlumbingWork object
   * @param monthlyService - boolean, monthlyService of the new PlumbingWork object
   * @param numberOfLicensedEmployee - Integer, numberOfLicensedEmployee of the new object
   * @param isComplex - boolean, isComplex of the new PlumbingWork object
   * @throws InvalidSizePropertyException when if condition is not matched
   * @throws InvalidPropertyAddressException when if condition is not matched
   */
  public PlumbingWork(String propertyAddress, PropertySize sizeOfProperty, boolean monthlyService,
      Integer numberOfLicensedEmployee, boolean isComplex)
      throws InvalidSizePropertyException, InvalidPropertyAddressException {
    super(propertyAddress, sizeOfProperty, monthlyService, numberOfLicensedEmployee, isComplex);
  }

  /**
   * This method is used to get the total price of this service
   * @param o, Object, taking this as a parameter
   * @return double, total price of this service
   */
  @Override
  public double calculatePrice(Object o) {
    double tempPrice;

    tempPrice = super.getNumberOfLicensedEmployee() * CHARGE_FOR_SPECIAL;
    if(super.getMonthlyService()){
      tempPrice = timeService % NINE_VALUE == ZERO_VALUE ? (tempPrice * HALF_PRICE) :
          (tempPrice * DISCOUNT_PRICE);
    }else{
      tempPrice = timeService % NINE_VALUE == ZERO_VALUE ? (tempPrice * HALF_PRICE) : tempPrice;
    }
    tempPrice += TWENTY_VALUE;

    super.setTotalPrice(tempPrice);
    return getTotalPrice();
  }

  /**
   * Returns the value given to it in string format.
   * @return String, returns the value given to it in string format.
   */
  @Override
  public String toString() {
    return super.toString() + "PlumbingWork";
  }
}
