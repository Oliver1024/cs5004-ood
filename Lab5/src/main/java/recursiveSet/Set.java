package recursiveSet;

/**
 * Create an interface represent a set of Integers
 */
public interface Set {

  /**
   * Empty set
   * @return empty set
   */
  Set emptySet();

  /**
   * Check if set is empty
   * @return boolean value
   */
  Boolean isEmpty();

  /**
   * Add a value to set
   * @param value Integer
   * @return a value of set
   */
  Set add(Integer value);

  /**
   * Return boolean value
   * @param value Integer
   * @return boolean value
   */
  Boolean contains(Integer value);

  /**
   * Return a new set that remove a value
   * @param value Integer
   * @return a new set that remove a value
   */
  Set remove(Integer value);

  /**
   * Get the size of the Set
   * @return the size of the Set
   */
  Integer size();

}
