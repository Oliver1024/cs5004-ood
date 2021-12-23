package problem2;

/**
 * Represent a interface of BagOfWords
 */
public interface BagOfWords {

  /**
   * Creates and returns an empty BagOfWords.
   * @return an empty BagOfWords.
   */
  static BagOfWords emptyBagOfWords(){
    return new EmptyBagOfWords();
  }

  /**
   * Checks if the BagOfWords is empty. Returns true if the BagOfWords contains no items,
   * false otherwise.
   * @return Boolean, return boolean value
   */
  Boolean isEmpty();

  /**
   * Returns the number of elements in the BagOfWords.
   * @return the number of elements in the BagOfWords.
   */
  Integer size();

  /**
   * Returns a new BagOfWords that contains all elements in the original BagOfWords plus s.
   * @param s String, s
   * @return a new BagOfWords that contains all elements in the original BagOfWords plus s.
   */
  BagOfWords add(String s);

  /**
   * Checks if s is in the BagOfWords. Returns true if the
   * BagOfWords contains s and false otherwise.
   * @param s String, s
   * @return true if the BagOfWords contains s and false otherwise
   */
  Boolean contains(String s);

  /**
   * Remove the item
   * @param s String, s
   * @return BagOfWords without that item has been removed
   */
  BagOfWords remove(String s);

//  /**
//   * Return a new ConsBagOfWords without that item has been removed
//   * @param s String, s
//   * @return a new ConsBagOfWords without that item has been removed
//   */
//  BagOfWords removeItem(String s);
//
//  /**
//   * Get the length, return an Integer
//   * @return an Integer
//   */
//  Integer length();

}
