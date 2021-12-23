package problem2;

/**
 * Represent a class that with two fields.
 */
public class ConsBagOfWords extends AbstractBagOfWords {

  private String first;
  private BagOfWords rest;
  private static final int HASHCODE = 31;

  /**
   * Constructor a new object
   * @param first - String, first
   * @param rest - AbstractBagOfWords, rest
   */
  public ConsBagOfWords(String first, BagOfWords rest) {
    this.first = first;
    this.rest = rest;
  }


  /**
   * {@inheritDoc}
   * Checks if the BagOfWords is empty. Returns true if the BagOfWords contains no items,
   * false otherwise.
   * @return boolean value
   */
  @Override
  public Boolean isEmpty() {
    return this.size().equals(0);
  }

  /**
   *{@inheritDoc}
   * Returns the number of elements in the BagOfWords.
   * @return the number of elements in the BagOfWords.
   */
  @Override
  public Integer size() {
    return 1 + this.rest.size();
  }

  /**
   *{@inheritDoc}
   * Checks if s is in the BagOfWords. Returns true if the BagOfWords
   * contains s and false otherwise.
   * @param s String, s
   * @return boolean value
   */
  @Override
  public Boolean contains(String s) {
    if (this.first.equals(s)) {
      return true;
    }
    return this.rest.contains(s);
  }


  /**
   * Return a new ConsBagOfWords without that item has been removed
   * @param s String, s
   * @return a new ConsBagOfWords without that item has been removed
   */
  @Override
  protected AbstractBagOfWords removeItem(String s) {
    if (this.first.equals(s)) {
      return (AbstractBagOfWords) this.rest;
    }
    return new ConsBagOfWords(this.first, ((AbstractBagOfWords)this.rest).removeItem(s));
  }

  /**
   * Indicates whether some other object passed as an argument is "equal to" the
   * current instance
   * @param o Object, an object to compare
   * @return boolean value
   */
  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null)
      return false;
    if (!(o instanceof ConsBagOfWords))
      return false;
    final ConsBagOfWords that = (ConsBagOfWords) o;
    if (!this.size().equals(that.size()))
      return false;
    if (!that.contains(this.first))
      return false;

    return this.rest.equals(that.removeItem(this.first));

  }

  /**
   * Returns an integer representation of the object memory address
   * @return int, hash code
   */
  @Override
  public int hashCode() {
    final int prime = HASHCODE;
    int result = 1;
    result = (prime * result) + ((this.first == null) ? 0 : this.first.hashCode());
    result = (prime * result) + ((this.rest == null) ? 0 : this.rest.hashCode());
    return result;
  }

  /**
   * Returns an String representation of the object
   * @return an String representation of the object
   */
  @Override
  public String toString() {
    return "ConsBagOfWords [first=" + this.first + ", rest=" + this.rest + "]";
  }

}
