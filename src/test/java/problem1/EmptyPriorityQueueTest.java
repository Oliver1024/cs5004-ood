package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmptyPriorityQueueTest {
  private EmptyPriorityQueue testEmptyPriorityQueue;
  private EmptyPriorityQueue testEmptyPriorityQueue2;
  private PriorityQueue testEmptyPriorityQueue3;


  @Before
  public void setUp() throws Exception {
    testEmptyPriorityQueue = new EmptyPriorityQueue();
    testEmptyPriorityQueue2 = new EmptyPriorityQueue();
    testEmptyPriorityQueue3 = PriorityQueue.createEmpty();

  }

  @Test
  public void createEmpty() {
    assertTrue(testEmptyPriorityQueue3.isEmpty());
  }

  @Test
  public void isEmpty() {
    assertTrue(testEmptyPriorityQueue.isEmpty());
  }


  @Test(expected = IllegalQueueOperationException.class)
  public void peek() throws IllegalQueueOperationException{
    testEmptyPriorityQueue.peek();

  }

  @Test(expected = IllegalQueueOperationException.class)
  public void pop() throws IllegalQueueOperationException{
    testEmptyPriorityQueue.pop();
  }

  @Test
  public void testEquals() {
    assertEquals(testEmptyPriorityQueue,testEmptyPriorityQueue);
    assertEquals(testEmptyPriorityQueue,testEmptyPriorityQueue2);
    assertNotEquals(testEmptyPriorityQueue,null);
    testEmptyPriorityQueue.add(5,"D");
    assertFalse(testEmptyPriorityQueue.equals(5));
  }

  @Test
  public void testHashCode() {
    assertEquals(45656,testEmptyPriorityQueue.hashCode());
  }

  @Test
  public void testToString() {
    String expectedString = "EmptyPriorityQueue{}";
    assertEquals(expectedString,testEmptyPriorityQueue.toString());
  }
}