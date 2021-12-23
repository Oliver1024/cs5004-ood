package problem1;

/**
 * Represent a class that implements from the interface of PriorityQueue
 */
public class EmptyPriorityQueue extends AbstractPriorityQueue {
  private static final int HASH_CODE = 45656;

  /**
   * An empty constructor
   */
  public EmptyPriorityQueue() {
  }

  /**
   * {@inheritDoc}
   * Checks if PQ is empty. Returns true if the PQ contains no items, false otherwise
   * @return Boolean, Returns true if the PQ contains no items, false otherwise
   */
  @Override
  public Boolean isEmpty() {
    return true;
  }


  /**
   *{@inheritDoc}
   * Returns the value in the PQ that has the highest priority.
   * @return the value in the PQ that has the highest priority.
   * @throws IllegalQueueOperationException throw exception if condition is matched.
   */
  @Override
  public String peek() throws IllegalQueueOperationException {
    throw new IllegalQueueOperationException("Called peek() on an empty Queue!");
  }

  /**
   * Returns a copy of the PQ without the element with the
   * highest priority.
   * @return a copy of the PQ without the element with the highest priority.
   * @throws IllegalQueueOperationException throw exception if condition is matched.
   */
  @Override
  public PriorityQueue pop() throws IllegalQueueOperationException{
    throw new IllegalQueueOperationException("Called pop() on an empty Queue!");
  }

  /**
   * {@inheritDoc}
   * Returns an integer representation of the object memory address
   * @return int, hash code
   */
  @Override
  public int hashCode() {
    return EmptyPriorityQueue.HASH_CODE;
  }

  /**
   *{@inheritDoc}
   * Indicates whether some other object passed as an argument is "equal to" the
   * current instance
   * @param obj , object, an object to compare
   * @return boolean value
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (!(obj instanceof EmptyPriorityQueue)) {
      return false;
    }
    return true;
  }

  /**
   *{@inheritDoc}
   * Returns an String representation of the object
   * @return an String representation of the object
   */
  @Override
  public String toString() {
    return "EmptyPriorityQueue{}";
  }



}
