package simpleRecursiveList;

/**
 * Represents a non-empty list of integers
 *
 */
public class Cons implements List {
  private Integer first;
  private List rest;


  /**
   * Given an integer and a list create a new list with the
   * same elements as {@code rest} and with {@code first} prepended.
   *
   * @param first new element to add to the beginning of the list
   * @param rest the list we are going to use to add our new element
   */
  public Cons(Integer first, List rest) {
    this.first = first;
    this.rest = rest;
  }

  /**
   * Getter for property 'first'.
   *
   * @return Value for property 'first'.
   */
  public Integer getFirst() {
    return first;
  }

  /**
   * Getter for property 'rest'.
   *
   * @return Value for property 'rest'.
   */
  public List getRest() {
    return rest;
  }

  /**
   * Return size of the list
   * @return size of the list
   */
  @Override
  public Integer size() {
    return 1 + this.getRest().size(); }

  /**
   * Return boolean to check if list is empty or not
   * @return boolean to check if list is empty or not
   */
  @Override
  public Boolean isEmpty() {
    return false;
  }

  /**
   *  Return new Cons object
   * @param element new element to add to the list
   * @return new Cons object
   */
  @Override
  public List add(Integer element) {

    return new Cons(element, this);
  }

  /**
   * Return last value of the list
   * @return last value of the list
   */
  @Override
  public Integer last() {
    if (this.rest.isEmpty()) {
      return this.first;
    } else {
      return this.rest.last();
    }
  }

  /**
   * returns true if element is in the list and false otherwise
   *
   * @param number Integer
   * @return  true if element is in the list and false otherwise
   */
  @Override
  public Boolean contains(Integer number) {
    if(this.first.equals(number))
      return true;
    else return this.rest.contains(number);
  }

  /**
   * Returns the element found at index in the list. If an index provided is outside
   * the bounds of the list, the method throws exception.
   *
   * @param index Integer
   * @return the element found at index in the list. If an index provided is outside
   * the bounds of the list, the method throws exception.
   */
  @Override
  public Integer elementAt(Integer index) throws InvalidCallException{
    if(index < 0 || index >= this.size())
      throw new InvalidCallException("Index out of bounds!");
    else if(index == 0)
      return this.first;
    else return this.rest.elementAt(index - 1);
  }

  /**
   * Return the total sum of the list
   * @return the total sum of the list
   */
  @Override
  public Integer sum() {
    return this.first + this.rest.sum();
  }

  /**
   * Remove a value from the list
   * @param value Integer
   * @return a value from the list
   */
  @Override
  public List remove(Integer value) {
    if(!this.contains(value))
      return this;
    else if (this.first.equals(value)) {
      return this.rest;
    } else {
      return new Cons(this.first,this.rest.remove(value));
    }
  }


  /**
   * Indicates whether some other object passed as an argument is "equal to" the
   * current instance
   * @param o Object
   * @return boolean value
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Cons cons = (Cons) o;

    if (getFirst() != null ? !getFirst().equals(cons.getFirst()) : cons.getFirst() != null)
      return false;
    return getRest() != null ? getRest().equals(cons.getRest()) : cons.getRest() == null;
  }

  /**
   * returns an integer representation of the object memory address
   * @return an integer representation of the object memory address
   */
  @Override
  public int hashCode() {
    int result = getFirst() != null ? getFirst().hashCode() : 0;
    result = 31 * result + (getRest() != null ? getRest().hashCode() : 0);
    return result;
  }

  /**
   * Returns an String representation of the object
   * @return String
   */
  @Override
  public String toString() {
    return "Cons{"
        + "first=" + first
        + ", rest=" + rest
        + '}';
  }


}