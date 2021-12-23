package problem2;

/**
 *
 */
public class EmptyBagOfWords extends AbstractBagOfWords{
  private static final Integer HASH_CODE = 113;

  /**
   *
   */
  public EmptyBagOfWords() {
  }

  /**
   *{@inheritDoc}
   *
   * @return
   */
  @Override
  public Boolean isEmpty() {
    return true;
  }

  /**
   *{@inheritDoc}
   *
   * @return
   */
  @Override
  public Integer size() {
    return 0;
  }

  /**
   *{@inheritDoc}
   *
   * @param s String, s
   * @return
   */
  @Override
  public Boolean contains(String s) {
    return false;
  }


  /**
   *{@inheritDoc}
   *
   * @param s String, s
   * @return
   */
  @Override
  public AbstractBagOfWords removeItem(String s) {
    return this;
  }

  /**
   * {@inheritDoc}
   * Indicates whether some other object passed as an argument is "equal to" the
   * current instance.
   * @param obj Object, an object to compare
   * @return boolean value
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (!(obj instanceof EmptyBagOfWords)) {
      return false;
    }
    return true;
  }

  /**
   *{@inheritDoc}
   * Returns an integer representation of the object memory address
   * @return an integer representation of the object memory address
   */
  @Override
  public int hashCode() {
    return EmptyBagOfWords.HASH_CODE;
  }

  /**
   *{@inheritDoc}
   * Returns an String representation of the object
   * @return an String representation of the object
   */
  @Override
  public String toString() {
    return "EmptyBagOfWords{}";
  }
}
