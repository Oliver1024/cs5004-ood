package problem2;

/**
 * Represent an abstract class that implements from interface of BagOfWords
 */
public abstract class AbstractBagOfWords implements BagOfWords{

  /**
   * Return a new ConsBagOfWords
   * @param s String, s
   * @return a new ConsBagOfWords
   */
  @Override
  public BagOfWords add(String s) {
    return new ConsBagOfWords(s,this);
  }

  /**
   * Remove item
   * @param s String, s
   * @return BagOfWords without that item has been removed
   */
  @Override
  public BagOfWords remove(String s) {
    return removeItem(s);
  }

  /**
   * Return a new ConsBagOfWords without that item has been removed
   * @param s String, s
   * @return a new ConsBagOfWords without that item has been removed
   */
  protected abstract AbstractBagOfWords removeItem(String s);
}
