package problem1;

import java.time.LocalDate;

/**
 * A concrete class that inherits from its parent class of PerishableFood
 */
public class Vegetable extends PerishableFood{

  /**
   * Constructor that creates a new object of Vegetable
   * @param name - String, name of the new object
   * @param currentPricePerUnit - Double, currentPricePerUnit of the new object
   * @param currentAvailableQuantity - Integer, currentAvailableQuantity of the new object
   * @param maxAllowedQuantity - Integer, maxAllowedQuantity of the new object
   * @param orderDate - LocalDate, orderDate of the new object
   * @param expirationDate - LocalDate, expirationDate of the new object
   */
  public Vegetable(String name, Double currentPricePerUnit,
      Integer currentAvailableQuantity, Integer maxAllowedQuantity, LocalDate orderDate,
      LocalDate expirationDate) {

    super(name, currentPricePerUnit, currentAvailableQuantity, maxAllowedQuantity, orderDate,
        expirationDate);
  }
}
