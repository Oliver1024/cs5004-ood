package problem1;

import java.time.LocalDate;
import java.util.Objects;

/**
 * A abstract class that inherits from its parent class of AbstractFoodItem.
 */
public abstract class PerishableFood extends AbstractFoodItem {
  private LocalDate orderDate;
  private LocalDate expirationDate;
  private static final int MAX_NUM = 100;
  private static final int MIN_NUM = 0;

  /**
   * Constructor that creates a new object of PerishableFood.
   * @param name - String, name of the new object
   * @param currentPricePerUnit - Double, currentPricePerUnit of the new object
   * @param currentAvailableQuantity - Integer, currentAvailableQuantity of the new object
   * @param maxAllowedQuantity - Integer, maxAllowedQuantity of the new object
   * @param orderDate - LocalDate, orderDate of the new object
   * @param expirationDate - LocalDate, expirationDate of the new object
   */
  public PerishableFood(String name, Double currentPricePerUnit,
      Integer currentAvailableQuantity, Integer maxAllowedQuantity, LocalDate orderDate,
      LocalDate expirationDate) {
    super(name, currentPricePerUnit, currentAvailableQuantity, maxAllowedQuantity);
    this.orderDate = orderDate;
    this.expirationDate = expirationDate;
    if(!this.validMaxAllowedQuantity(maxAllowedQuantity)){
      throw new IllegalArgumentException("Invalid max allowed quantity");
    }
  }

  /**
   * A helper function that used to validate the max allowed number of the quantity.
   * @param numAllowedQuantity, Integer, numAllowedQuantity as a parameter passed into function
   * @return a boolean value
   */
  private boolean validMaxAllowedQuantity(Integer numAllowedQuantity){
    return (numAllowedQuantity <= MAX_NUM & numAllowedQuantity >= MIN_NUM);
  }

  /**
   * Return the order date
   * @return LocalDate, the order date
   */
  public LocalDate getOrderDate() {
    return orderDate;
  }

  /**
   * Return ExpirationDate
   * @return LocalDate, the ExpirationDate
   */
  public LocalDate getExpirationDate() {
    return expirationDate;
  }

  /**
   * {@inheritDoc}
   * A method provided by java.lang.Object that indicates whether some other object
   * passed as an argument is "equal to" the current instance.
   *
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
    if (!super.equals(o)) {
      return false;
    }
    PerishableFood that = (PerishableFood) o;
    return Objects.equals(getOrderDate(), that.getOrderDate()) && Objects
        .equals(getExpirationDate(), that.getExpirationDate());
  }

  /**
   * Return a hashcode value of the Object
   * @return int, a hashcode value of the object
   */
  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getOrderDate(), getExpirationDate());
  }

  /**
   * Returns the value given to it in string format.
   * @return String, returns the value given to it in string format.
   */
  @Override
  public String toString() {
    return "PerishableFood{" +
        "orderDate=" + orderDate +
        ", expirationDate=" + expirationDate +
        '}';
  }
}
