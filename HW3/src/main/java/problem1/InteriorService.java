package problem1;

import java.util.Objects;

/**
 * An abstract class that inherits from AService.
 */
public abstract class InteriorService extends AService {

  protected Integer numberOfPets;
  protected static final Integer BASE_PRICE = 80;

  /**
   * A constructor that creates a new object of InteriorService.
   *
   * @param propertyAddress - String, propertyAddress of the new InteriorService object
   * @param sizeOfProperty  - enumerate, sizeOfProperty of the new InteriorService object
   * @param monthlyService  - boolean, monthlyService of the new InteriorService object
   * @param numberOfFloors  - Integer, numberOfFloors of the new InteriorService object
   * @param numberOfPets    - Integer, numberOfPets of the new InteriorService object
   * @throws InvalidSizePropertyException    when if condition is not matched
   * @throws InvalidPropertyAddressException when if condition is not matched
   */
  public InteriorService(String propertyAddress, PropertySize sizeOfProperty,
      boolean monthlyService, Integer numberOfFloors,
      Integer numberOfPets) throws InvalidSizePropertyException, InvalidPropertyAddressException {
    super(propertyAddress, sizeOfProperty, monthlyService);
    this.numberOfPets = numberOfPets;
    super.setNumberOfFloors(numberOfFloors);
  }

  /**
   * A constructor that creates a new object of InteriorService with different parameters.
   *
   * @param propertyAddress - String, propertyAddress of the new InteriorService object
   * @param sizeOfProperty  - enumerate, sizeOfProperty of the new InteriorService object
   * @param monthlyService  - boolean, monthlyService of the new InteriorService object
   * @param numberOfPets    - Integer, numberOfPets of the new InteriorService object
   * @throws InvalidSizePropertyException    when if condition is not matched
   * @throws InvalidPropertyAddressException when if condition is not matched
   */
  public InteriorService(String propertyAddress, PropertySize sizeOfProperty,
      boolean monthlyService,
      Integer numberOfPets) throws InvalidSizePropertyException, InvalidPropertyAddressException {
    super(propertyAddress, sizeOfProperty, monthlyService);
    this.numberOfPets = numberOfPets;
  }

  /**
   * Return number of pets
   *
   * @return number of pets
   */
  public Integer getNumberOfPets() {
    return numberOfPets;
  }

  /**
   * {@inheritDoc} A method provided by java.lang.Object that indicates whether some other object
   * passed as an argument is "equal to" the current instance.
   *
   * @param o, - Object, taking this object as a parameter
   * @return a boolean value after compare with those fields of InteriorService object
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
    InteriorService that = (InteriorService) o;
    return Objects.equals(getNumberOfPets(), that.getNumberOfPets()) && Objects
        .equals(BASE_PRICE, that.BASE_PRICE);
  }

  /**
   * Return a hashcode value of the Object
   *
   * @return int, a hashcode value of the object
   */
  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getNumberOfPets(), BASE_PRICE);
  }

  /**
   * Returns the value given to it in string format.
   *
   * @return String, returns the value given to it in string format.
   */
  @Override
  public String toString() {
    return "InteriorService{" +
        "numberOfPets=" + numberOfPets +
        ", BASE_PRICE=" + BASE_PRICE +
        '}';
  }
}
