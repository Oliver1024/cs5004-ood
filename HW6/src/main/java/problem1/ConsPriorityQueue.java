package problem1;

/**
 * Represent a class ConsPriorityQueue.
 */
public class ConsPriorityQueue extends AbstractPriorityQueue {

  /**
   * Represent a  class Node.
   */
  static class Node{
    private Integer priority;
    private String value;

    /**
     * Constructor that a new object with two arguments
     * @param priority - Integer, priority
     * @param value - String, value
     */
    public Node(Integer priority, String value){
      this.priority = priority;
      this.value = value;
    }
  }

  private final Node first;
  private final PriorityQueue rest;


  /**
   * Constructor a new object with three arguments
   * @param priority - Integer, priority
   * @param value - String value
   * @param rest - PriorityQueue rest of the new object
   */
  public ConsPriorityQueue(Integer priority,String value,PriorityQueue rest) {
    this.first = new Node(priority,value);
    this.rest = rest;
  }

  /**
   * {@inheritDoc}
   * Return false if the queue is not empty otherwise true
   * @return a boolean value
   */
  @Override
  public Boolean isEmpty() {
    return false;
  }

  /**
   * {@inheritDoc}
   * Return a new priority queue after adding a queue
   * @param priority Integer, priority
   * @param value String, value
   * @return a new priority queue after adding a queue
   */
  @Override
  public PriorityQueue add(Integer priority, String value) {

    if(this.first.priority < priority){
      return new ConsPriorityQueue(priority,value,this);
    }
    return new ConsPriorityQueue(this.first.priority,this.first.value,
        this.rest.add(priority,value));
  }


  /**
   * {@inheritDoc}
   * Returns the value in the PQ that has the highest priority
   *
   * @return String,  the value in the PQ that has the highest priority
   */
  @Override
  public String peek() {
    return this.first.value;
  }

  /**
   * Returns a copy of the PQ without the element with the
   * highest priority.
   * @return PriorityQueue, a copy of the PQ without the element with the highest priority.
   */
  @Override
  public PriorityQueue pop(){
   return this.rest;
  }

  /**
   * {@inheritDoc}
   * Indicates whether some other object passed as an argument is "equal to" the
   * current instance
   * @param o - object, an object to compare
   * @return boolean value
   */
  @Override
  public boolean equals(Object o) {

    if(this == o) return true;
    if( o == null) return false;
    if(!(o instanceof  ConsPriorityQueue)) return false;

    ConsPriorityQueue that = (ConsPriorityQueue) o;
    if(this.first.priority == null){
      if(that.first.priority != null) return  false;
    }
    else if(!this.first.priority.equals(that.first.priority)) return false;

    if(this.first.value == null){
      if(that.first.value != null) return false;
    }

    if(this.rest == null){
      if(that.rest != null) return false;
    }
    else if (!this.rest.equals(that.rest)) return false;
    return true;
  }


  /**
   * {@inheritDoc}
   * Returns an integer representation of the object memory address
   * @return int, an integer representation of the object memory address
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = (prime * result) + ((this.first.priority == null) ? 0 :
        this.first.priority.hashCode());
    result = (prime * result) + ((this.first.value == null) ? 0 : this.first.value.hashCode());
    result = (prime * result) + ((this.rest == null) ? 0 : this.rest.hashCode());
    return result;
  }

  /**
   * {@inheritDoc}
   * Returns an String representation of the object
   * @return String, string
   */
  @Override
  public String toString() {
    return "ConsPriorityQueue{" +
        "first.priority=" + first.priority +
        ", first.value=" + first.value +
        ", rest=" + rest +
        '}';
  }
}
