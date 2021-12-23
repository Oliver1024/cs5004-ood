package problem1;

import java.util.Objects;

/**
 * An abstract class that implements from the interface of FoodItem.
 */
public abstract class AbstractFoodItem implements FoodItem{
  private String name;
  private Double currentPricePerUnit;
  private Integer currentAvailableQuantity;
  private Integer maxAllowedQuantity;

  /**
   * Constructor that creates a new object of AbstractFoodItem.
   * @param name - String, name of the new object
   * @param currentPricePerUnit - Double, currentPricePerUnit of the new object
   * @param currentAvailableQuantity - Integer, currentAvailableQuantity of the new object
   * @param maxAllowedQuantity - Integer, maxAllowedQuantity of the new object
   */
  public AbstractFoodItem(String name, Double currentPricePerUnit,
      Integer currentAvailableQuantity, Integer maxAllowedQuantity) {
    this.name = name;
    this.currentPricePerUnit = currentPricePerUnit;
    this.currentAvailableQuantity = currentAvailableQuantity;
    this.maxAllowedQuantity = maxAllowedQuantity;
  }

  /**
   * Return name of object
   * @return String, name of object
   */
  public String getName() {
    return name;
  }

  /**
   * Return CurrentPricePerUnit of object
   * @return Double, CurrentPricePerUnit of object
   */
  public Double getCurrentPricePerUnit() {
    return currentPricePerUnit;
  }

  /**
   * Return CurrentAvailableQuantity of object
   * @return Integer, CurrentAvailableQuantity of object
   */
  public Integer getCurrentAvailableQuantity() {
    return currentAvailableQuantity;
  }

  /**
   * Return MaxAllowedQuantity of object
   * @return Integer, MaxAllowedQuantity of object
   */
  public Integer getMaxAllowedQuantity() {
    return maxAllowedQuantity;
  }

  /**
   * {@inheritDoc}
   * A method provided by java.lang.Object that indicates whether some other object
   * passed as an argument is "equal to" the current instance.
   * @param o - Object, taking this object as a parameter
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
    AbstractFoodItem that = (AbstractFoodItem) o;
    return Objects.equals(getName(), that.getName()) && Objects
        .equals(getCurrentPricePerUnit(), that.getCurrentPricePerUnit()) && Objects
        .equals(getCurrentAvailableQuantity(), that.getCurrentAvailableQuantity())
        && Objects.equals(getMaxAllowedQuantity(), that.getMaxAllowedQuantity());
  }

  /**
   * Return a hashcode value of the Object
   * @return int, a hashcode value of the object
   */
  @Override
  public int hashCode() {
    return Objects.hash(getName(), getCurrentPricePerUnit(), getCurrentAvailableQuantity(),
        getMaxAllowedQuantity());
  }

  /**
   * Returns the value given to it in string format.
   * @return String, returns the value given to it in string format.
   */
  @Override
  public String toString() {
    return "AbstractFoodItem{" +
        "name='" + name + '\'' +
        ", currentPricePerUnit='" + currentPricePerUnit + '\'' +
        ", currentAvailableQuantity=" + currentAvailableQuantity +
        ", maxAllowedQuantity=" + maxAllowedQuantity +
        '}';
  }
}
