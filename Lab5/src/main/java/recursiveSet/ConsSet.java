package recursiveSet;

/**
 * A class that create none-empty set of integers
 */
public class ConsSet implements Set{
  private  Integer value;
  private  Set rest;

  /**
   * Constructor a new object
   * @param value - Integer
   * @param rest - Set
   */
  public ConsSet(Integer value, Set rest) {
    this.value = value;
    this.rest = rest;
  }

  /**
   * Return empty set
   * @return empty set
   */
  @Override
  public Set emptySet() {
    return new EmptySet();
  }

  /**
   * Return boolean value
   * @return boolean value
   */
  @Override
  public Boolean isEmpty() {
    return false;
  }


  /**
   * Return a new set after add a value
   * @param value Integer
   * @return a new set after add a value
   */
  @Override
  public Set add(Integer value) {
    if(this.contains(value))
      return this;
    else return new ConsSet(value,this);

  }

  /**
   * Return a boolean value if set contain the value return true otherwise false
   * @param value Integer
   * @return a boolean value
   */
  @Override
  public Boolean contains(Integer value) {
    if(this.value.equals(value))
      return true;
    else
      return this.rest.contains(value);
  }

  /**
   * Return a new set object after remove a value
   * @param value Integer
   * @return  a new set object after remove a value
   */
  @Override
  public Set remove(Integer value) {
    if(!this.contains(value))
      return this;
    else if(!this.value.equals(value))
      return new ConsSet(this.value,this.rest.remove(value));
    else
      return this.rest;
  }

  /**
   * Return the size of the set
   * @return the size of the set
   */
  @Override
  public Integer size() {
    return 1 + this.rest.size();
  }
}