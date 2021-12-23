package problem1;

import java.util.Objects;

/**
 * A class that inherits from its parameter class of SpecialService.
 */
public abstract class SpecialService extends AService {

  private Integer numberOfLicensedEmployee;
  private boolean isComplex;
  protected static final Integer CHARGE_FOR_SPECIAL = 200;
  private Integer numberOfLeastEmployee;

  /**
   * Constructor that creates a new SpecialService object.
   *
   * @param propertyAddress          - String, propertyAddress of the new SpecialService object
   * @param sizeOfProperty           - enumerate, sizeOfProperty of the new SpecialService object
   * @param monthlyService           - boolean, monthlyService of the new SpecialService object
   * @param numberOfLicensedEmployee - Integer, numberOfLicensedEmployee of the new object
   * @param isComplex                - boolean, isComplex of the new SpecialService object
   * @throws InvalidSizePropertyException    when if condition is not matched
   * @throws InvalidPropertyAddressException when if condition is not matched
   */
  public SpecialService(String propertyAddress, PropertySize sizeOfProperty, boolean monthlyService,
      Integer numberOfLicensedEmployee, boolean isComplex)
      throws InvalidSizePropertyException, InvalidPropertyAddressException {
    super(propertyAddress, sizeOfProperty, monthlyService);
    this.numberOfLicensedEmployee = numberOfLicensedEmployee;
    this.isComplex = isComplex;
    this.numberOfLeastEmployee = numberOfLicensedEmployee;
  }

  /**
   * Return number of licensed employee
   *
   * @return number of the licensed employee
   */
  public Integer getNumberOfLicensedEmployee() {
    return numberOfLicensedEmployee;
  }

  /**
   * Set number of licensed employee
   *
   * @param numberOfLicensedEmployee, set number of licensed employee
   */
  public void setNumberOfLicensedEmployee(Integer numberOfLicensedEmployee) {
    this.numberOfLicensedEmployee = numberOfLicensedEmployee;
  }

  /**
   * {@inheritDoc} A method provided by java.lang.Object that indicates whether some other object
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
    if (!super.equals(o)) {
      return false;
    }
    SpecialService that = (SpecialService) o;
    return isComplex == that.isComplex && Objects
        .equals(getNumberOfLicensedEmployee(), that.getNumberOfLicensedEmployee())
        && Objects.equals(CHARGE_FOR_SPECIAL, that.CHARGE_FOR_SPECIAL) && Objects
        .equals(numberOfLeastEmployee, that.numberOfLeastEmployee);
  }

  /**
   * Return a hashcode value of the Object
   *
   * @return int, a hashcode value of the object
   */
  @Override
  public int hashCode() {
    return Objects
        .hash(super.hashCode(), getNumberOfLicensedEmployee(), isComplex, CHARGE_FOR_SPECIAL,
            numberOfLeastEmployee);
  }

  /**
   * Returns the value given to it in string format.
   *
   * @return String, returns the value given to it in string format.
   */
  @Override
  public String toString() {
    return "SpecialService{" +
        "numberOfLicensedEmployee=" + numberOfLicensedEmployee +
        ", isComplex=" + isComplex +
        ", CHARGE_FOR_SPECIAL=" + CHARGE_FOR_SPECIAL +
        ", numberOfLeastEmployee=" + numberOfLeastEmployee +
        '}';
  }
}
