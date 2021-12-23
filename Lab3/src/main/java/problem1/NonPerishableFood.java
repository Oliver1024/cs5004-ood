package problem1;

/**
 * A abstract class that inherits from its parent class of AbstractFoodItem.
 */
public abstract class NonPerishableFood extends AbstractFoodItem{
  private static final int MAX_NUM = 250;
  private static final int MIN_NUM = 0;

  /**
   * Constructor that creates a new object of NonPerishableFood.
   * @param name - String, name of the new object
   * @param currentPricePerUnit - Double, currentPricePerUnit of the new object
   * @param currentAvailableQuantity - Integer, currentAvailableQuantity of the new object
   * @param maxAllowedQuantity - Integer, maxAllowedQuantity of the new object
   */
  public NonPerishableFood(String name, Double currentPricePerUnit,
      Integer currentAvailableQuantity, Integer maxAllowedQuantity) {
    super(name, currentPricePerUnit, currentAvailableQuantity, maxAllowedQuantity);
    if(!this.validMaxAllowedQuantity(maxAllowedQuantity)){
      throw new IllegalArgumentException("Invalid max allowed quantity for non perishable food");
    }
  }

  /**
   * A helper function that used to validate the max allowed number of the quantity.
   * @param numAllowedQuantity Integer, as a parameter passed in the function
   * @return a boolean value
   */
  private boolean validMaxAllowedQuantity(Integer numAllowedQuantity){
    return (numAllowedQuantity <= MAX_NUM && numAllowedQuantity >= MIN_NUM);
  }
}
