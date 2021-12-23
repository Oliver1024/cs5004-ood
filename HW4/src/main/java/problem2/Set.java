package problem2;

/**
 * An interface is used to declare some methods.
 */
public interface Set {

  /**
   * An emptySet() is declared.
   * @return Set, Creates and returns an empty Set
   */
  Set emptySet();

  /**
   * An isEmpty method declared that used to check if the array is empty and return ture if it is
   * empty, otherwise false.
   * @return Boolean, check if the array is empty and return ture if it is
   * empty, otherwise false.
   */
  Boolean isEmpty();

  /**
   * Adds the given Integer to the Set if and only if that Integer is not already in the Set.
   *
   * @param n, Integer, taking this as parameter
   * @return Set, a new array with adding number
   */
  Set add(Integer n);

  /**
   * Declare a contains method that check if a specific number is in the array
   *
   * @param n, Integer, taking this number as a parameter
   * @return a Boolean value, if contain return ture otherwise false
   */
  Boolean contains(Integer n);

  /**
   * Remove a specific integer and return a new array set if this method is implemented
   *
   * @param n Integer, taking this number as a parameter
   * @return a new array set if this method is implemented
   */
  Set remove(Integer n);

  /**
   * Check the size of the array if this method is implemented
   *
   * @return the size of the array if this method is implemented
   */
  Integer size();

}