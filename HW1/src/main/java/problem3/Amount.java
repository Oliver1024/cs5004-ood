package problem3;

/**
 * Amount is a simple object that has dollarValue and centsValue.
 */
public class Amount {

  private Integer dollarValue;
  private Integer centsValue;

  /**
   * Constructor that creates a new Amount object with dollarValue and centsValue.
   *
   * @param dollarValue - dollarValue of new Amount object
   * @param centsValue  - centsValue of new Amount object
   */
  public Amount(Integer dollarValue, Integer centsValue) {
    if (validateDollar(dollarValue)) {
      this.dollarValue = dollarValue;
    } else {
      this.dollarValue = -1;
    }
    if (validateCent(centsValue)) {
      this.centsValue = centsValue;
    } else {
      this.centsValue = -1;
    }
  }

  /**
   * Returns DollarValue of the Amount
   *
   * @return DollarValue of the Amount
   */
  public Integer getDollarValue() {
    return this.dollarValue;
  }

  /**
   * Returns CentsValue of the Amount
   *
   * @return CentsValue of the Amount
   */
  public Integer getCentsValue() {
    return this.centsValue;
  }

  /**
   * A helper function that used to validate dollar value
   *
   * @param dollarValue Taking this dollarValue as a parameter in this function
   * @return boolean value
   */
  private boolean validateDollar(Integer dollarValue) {
    if (dollarValue >= 0) {
      return true;
    }
    return false;
  }

  /**
   * A helper function that used to validate cents value
   *
   * @param centsValue Taking this centsValue as parameter in this function
   * @return boolean value
   */
  private boolean validateCent(Integer centsValue) {
    Integer maxCentValue = 99;
    if (centsValue >= 0 && centsValue <= maxCentValue) {
      return true;
    }
    return false;
  }
}
