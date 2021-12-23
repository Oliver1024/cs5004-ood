package problem1;

/**
 * An abstract class that implements from interface of priority queue
 */
public abstract class AbstractPriorityQueue implements PriorityQueue {

  /**
   * {@inheritDoc}
   * Return a new cons priority queue after adding a queue
   * @param priority Integer, priority
   * @param value String, value
   * @return a new cons priority queue after adding a queue
   */
  @Override
  public PriorityQueue add(Integer priority, String value) {
    return new ConsPriorityQueue(priority,value,this);
  }
}
