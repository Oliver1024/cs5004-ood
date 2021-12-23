package midtermExam.p1;

import java.util.Objects;

/**
 * Represent abstract class that inherit from AbstractAntiqueCars.
 * This class has a Boolean value that is isAccident as a field to check if a car had accident
 * or not.
 */
public abstract class ClassicCars extends AbstractAntiqueCars{
  private Boolean isAccident;
  private static final Double SUBTRACT_VALUE = 10000.0;
  private static final Double SUBTRACT_VALUE_ZERO = 0.0;

  /**
   * Constructor that creates a new object of ClassicCars.
   * @param uniqueID - String, uniqueID
   * @param age - Integer, age
   * @param mileage - Integer, mileage
   * @param conditionCategory - ConditionCategory, conditionCategory
   * @param latestAskingPrice - Double, latestAskingPrice
   * @param isAccident - Boolean, isAccident
   */
  public ClassicCars(String uniqueID, Integer age, Integer mileage,
      ConditionCategory conditionCategory, Double latestAskingPrice, Boolean isAccident) {
    super(uniqueID, age, mileage, conditionCategory, latestAskingPrice);
    this.isAccident = isAccident;
  }

  /**
   * Return the estimated price of this type of cars
   * @return Double, the estimated price of this type of cars
   */
  @Override
  public Double estimatePrice() {
    return super.estimatePrice() - subtractExtraValue();
  }

  /**
   * A helper function that is used to calculate the subtract extra value of price
   * @return Double, get the subtract extra value of price
   */
  private Double subtractExtraValue(){
    if(isAccident)
      return SUBTRACT_VALUE;
    return SUBTRACT_VALUE_ZERO;
  }

  /**
   * {@inheritDoc}
   * Indicates whether some other object passed as an argument is "equal to" the current instance.
   * @param o - object, an object to compare
   * @return boolean value
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
    ClassicCars that = (ClassicCars) o;
    return Objects.equals(isAccident, that.isAccident);
  }

  /**
   * {@inheritDoc}
   * Returns an integer representation of the object memory address.
   * @return int, an integer representation of the object memory address
   */
  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), isAccident);
  }


  /**
   * {@inheritDoc}
   * Returns an String representation of the object
   * @return String, string
   */
  @Override
  public String toString() {
    return "ClassicCars{" +
        "uniqueID='" + uniqueID + '\'' +
        ", age=" + age +
        ", mileage=" + mileage +
        ", conditionCategory=" + conditionCategory +
        ", latestAskingPrice=" + latestAskingPrice +
        ", isAccident=" + isAccident +
        '}';
  }
}
