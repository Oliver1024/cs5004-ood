package problem1;

/**
 * A concrete class that inherits from its parent class of NonPerishableFood.
 */
public class Pasta extends NonPerishableFood{

  /**
   * Constructor that creates a new object of Pasta.
   * @param name - String, name of the new object
   * @param currentPricePerUnit - Double, currentPricePerUnit of the new object
   * @param currentAvailableQuantity - Integer, currentAvailableQuantity of the new object
   * @param maxAllowedQuantity - Integer, maxAllowedQuantity of the new object
   */
  public Pasta(String name, Double currentPricePerUnit, Integer currentAvailableQuantity,
      Integer maxAllowedQuantity) {
    super(name, currentPricePerUnit, currentAvailableQuantity, maxAllowedQuantity);
  }
}
