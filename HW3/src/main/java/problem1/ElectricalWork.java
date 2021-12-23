package problem1;

/**
 * This is a concrete class that inherit from special service class.
 */
public class ElectricalWork extends SpecialService {
  private static final int PERMITTING_FEE = 50;
  private static final int NINE = 9;
  private static final int ZERO = 0;
  private static final double PERCENT_ZERO_NINE = 0.9;
  private static final double HALF_ONE = 0.5;
  private static final int MAX_EMPLOYEE = 4;

  /**
   * Constructor that creates a new ElectricalWork object.
   * @param propertyAddress - String, propertyAddress of the new ElectricalWork object
   * @param sizeOfProperty  - enumerate, sizeOfProperty of the new ElectricalWork object
   * @param monthlyService  - boolean, monthlyService of the new ElectricalWork object
   * @param numberOfLicensedEmployee - Integer, numberOfLicensedEmployee of the new object
   * @param isComplex - boolean, isComplex of the new object
   * @throws InvalidSizePropertyException when if condition is not matched
   * @throws InvalidPropertyAddressException when if condition is not matched
   */
  public ElectricalWork(String propertyAddress, PropertySize sizeOfProperty, boolean monthlyService,
      Integer numberOfLicensedEmployee, boolean isComplex)
      throws InvalidSizePropertyException, InvalidPropertyAddressException {
    super(propertyAddress, sizeOfProperty, monthlyService, numberOfLicensedEmployee, isComplex);
    if (numberOfLicensedEmployee <= MAX_EMPLOYEE) {
      super.setNumberOfLicensedEmployee(numberOfLicensedEmployee);
    } else {
      throw new IllegalArgumentException("Invalid number of licensed employee");
    }
  }

  /**
   * {@inheritDoc}
   * This method is used to get the total price of this service
   * @param o, Object, taking this as a parameter
   * @return double, total price of this service
   */
  @Override
  public double calculatePrice(Object o) {
    double tempPrice;

    tempPrice = super.getNumberOfLicensedEmployee() * CHARGE_FOR_SPECIAL;
    if (super.getMonthlyService()) {
      tempPrice = timeService % NINE == ZERO ? (timeService * HALF_ONE) :
          (timeService * PERCENT_ZERO_NINE);
    } else {
      tempPrice = timeService % NINE == ZERO ? (tempPrice * HALF_ONE) : tempPrice;
    }
    tempPrice += PERMITTING_FEE;

    super.setTotalPrice(tempPrice);
    return super.getTotalPrice();
  }
}
