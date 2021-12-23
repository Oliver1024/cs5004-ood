package simpleRecursiveList;

/**
 * Represents the empty list of integers.
 */


public class Empty implements List {

  /**
   *
   * @return
   */
  @Override
  public Integer size() {
    return 0;
  }

  /**
   *
   * @return
   */
  @Override
  public Boolean isEmpty() {
    return true;
  }

  /**
   *
   * @param element new element to add to the list
   * @return
   */
  @Override
  public List add(Integer element) {

    return new Cons(element, this);
  }

  /**
   *
   * @return
   * @throws InvalidCallException
   */
  @Override
  public Integer last() throws InvalidCallException {
    throw new InvalidCallException("Called last() on empty!");
  }

  /**
   *
   * @param number
   * @return
   */
  @Override
  public Boolean contains(Integer number){return false;}

  /**
   * Returns the element found at index in the list. If an index provided is outside
   * the bounds of the list, the method throws exception.
   *
   * @param index
   * @return
   */
  @Override
  public Integer elementAt(Integer index) throws InvalidCallException{
    throw new InvalidCallException("Called elementAt() on empty list.");
  }

  /**
   *
   * @return
   */
  @Override
  public Integer sum() {
    return 0;
  }

  /**
   *
   * @param value
   * @return
   */
  @Override
  public List remove(Integer value) {
    return this;
  }


  /**
   * {@inheritDoc}
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    else return true;
  }


  /**
   * {@inheritDoc}
   */
  @Override
  public int hashCode() {
    return 42;
  }


  /**
   *
   * @return
   */
  @Override
  public String toString() {
    return "Empty{}";
  }
}

