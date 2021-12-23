package problem2;

/**
 * Represent a class inherit from abstract class of AbstractBagOfWords
 */
public class EmptyBagOfWords extends AbstractBagOfWords{
  private static final Integer HASH_CODE = 113;

  /**
   * Constructor an empty constructor
   */
  public EmptyBagOfWords() {
  }

  /**
   *{@inheritDoc}
   * Checks if the BagOfWords is empty.
   * Returns true if the BagOfWords contains no items, false otherwise.
   * @return true if the BagOfWords contains no items, false otherwise.
   */
  @Override
  public Boolean isEmpty() {
    return true;
  }

  /**
   *{@inheritDoc}
   * Returns the number of elements in the BagOfWords
   * @return the number of elements in the BagOfWords
   */
  @Override
  public Integer size() {
    return 0;
  }

  /**
   *{@inheritDoc}
   * Checks if s is in the BagOfWords, Returns true if the BagOfWords contains s
   * and false otherwise.
   * @param s String, s
   * @return true if the BagOfWords contains s and false otherwise.
   */
  @Override
  public Boolean contains(String s) {
    return false;
  }


  /**
   *{@inheritDoc}
   * Remove a string
   * @param s String, s
   * @return return bag of words without string has been removed
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
