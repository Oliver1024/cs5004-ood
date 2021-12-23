package recursiveSet;

/**
 * An empty set of class
 */
public class EmptySet implements Set{

  /**
   * Empty set of the constructor
   */
  public EmptySet() {
  }

  /**
   * Return a new set
   * @return a new set
   */
  @Override
  public Set emptySet() {
    return new EmptySet();
  }

  /**
   * Return boolean to check the set if is empty
   * @return boolean to check the set if is empty
   */
  @Override
  public Boolean isEmpty() {
    return true;
  }

  /**
   * Return a new set after add a value
   * @param value Integer
   * @return a new set after add a value
   */
  @Override
  public Set add(Integer value) {
    return new ConsSet(value,this);
  }

  /**
   * Return a boolean value
   * @param value Integer
   * @return a boolean value
   */
  @Override
  public Boolean contains(Integer value) {
    return false;
  }

  /**
   * Return a new set after remove a value from the set
   * @param value Integer
   * @return a new set after remove a value from the set
   */
  @Override
  public Set remove(Integer value) {
    return this;
  }

  /**
   * Return the size of the set
   * @return the size of the set
   */
  @Override
  public Integer size() {
    return 0;
  }
}

