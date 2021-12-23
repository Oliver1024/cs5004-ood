package problem1;

import java.util.Objects;

/**
 * A abstract class that inherit class of AService
 */
public abstract class ExteriorService extends AService {

  protected static final int BASE_PRICE = 80;
  private static final int LARGE_HOUR = 4;
  private static final int MEDIUM_HOUR = 2;
  private static final int SMALL_HOUR = 1;

  /**
   * A constructor that creates a new object of the ExteriorService
   *
   * @param propertyAddress - String, propertyAddress of the new ExteriorService object
   * @param sizeOfProperty  - enumerate, sizeOfProperty of the new ExteriorService object
   * @param monthlyService  - boolean, monthlyService of the new ExteriorService object
   * @throws InvalidSizePropertyException    when if condition is not matched
   * @throws InvalidPropertyAddressException when if condition is not matched
   */
  public ExteriorService(String propertyAddress, PropertySize sizeOfProperty,
      boolean monthlyService)
      throws InvalidSizePropertyException, InvalidPropertyAddressException {
    super(propertyAddress, sizeOfProperty, monthlyService);

    switch (sizeOfProperty) {
      case LARGE:
        super.setNumberOfHours(LARGE_HOUR);
      case MEDIUM:
        super.setNumberOfHours(MEDIUM_HOUR);
      default:
        super.setNumberOfHours(SMALL_HOUR);
    }
  }

  /**
   * {@inheritDoc} A method provided by java.lang.Object that indicates whether some other object
   * passed as an argument is "equal to" the current instance.
   *
   * @param o, - Object, taking this object as a parameter
   * @return boolean, a boolean value after compare with those fields of ExteriorService object
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
    ExteriorService that = (ExteriorService) o;
    return BASE_PRICE == that.BASE_PRICE;
  }

  /**
   * Return a hashcode value of the Object
   *
   * @return int, a hashcode value of the object
   */
  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), BASE_PRICE);
  }

  /**
   * Returns the value given to it in string format.
   *
   * @return String, returns the value given to it in string format.
   */
  @Override
  public String toString() {
    return super.toString() + "ExteriorService";
  }
}

