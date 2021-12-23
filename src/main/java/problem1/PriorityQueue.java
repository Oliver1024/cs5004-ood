package problem1;

/**
 * Represents a priority queue strings.
 */
public interface PriorityQueue {

  /**
   * Return a new empty priority queue
   * @return a new empty priority queue
   */
  static PriorityQueue createEmpty(){
    return new EmptyPriorityQueue();
  }

  /**
   * Return a boolean value if it is empty return true otherwise false
   * @return boolean value
   */
  Boolean isEmpty();

  /**
   * Add a new priority queue to current priority queue
   * @param priority Integer, priority
   * @param value String, value
   * @return a new priority queue
   */
  PriorityQueue add(Integer priority, String value);

  /**
   * Returns the value in the PQ that has the highest priority.
   * @return the value in the PQ that has the highest priority.
   * @throws IllegalQueueOperationException throw exception when condition is matched
   */
  String peek() throws IllegalQueueOperationException;

  /**
   *  Returns a copy of the PQ without the element with the
   * highest priority.
   * @return a copy of the PQ without the element with the highest priority.
   * @throws IllegalQueueOperationException throw exception when condition is matched.
   */
  PriorityQueue pop() throws IllegalQueueOperationException;
}
