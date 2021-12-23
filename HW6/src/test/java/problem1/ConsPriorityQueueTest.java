package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ConsPriorityQueueTest {

  private PriorityQueue rest;
  private PriorityQueue rest2;
  private Integer priority;
  private Integer priority2;

  private String value;
  private String value2;

  private ConsPriorityQueue testConsPriorityQueue;
  private ConsPriorityQueue testConsPriorityQueue2;

  private PriorityQueue testConsPriorityQueue5;

  @Before
  public void setUp() throws Exception {

    rest = new EmptyPriorityQueue();
    rest2 = new EmptyPriorityQueue();
    priority = 1;
    priority2 = 2;
    value = "A";
    value2 = "B";

    testConsPriorityQueue = new ConsPriorityQueue(priority,value,rest);
    testConsPriorityQueue2 = new ConsPriorityQueue(priority2,value2,rest2);
    testConsPriorityQueue5 = PriorityQueue.createEmpty();

  }

  @Test
  public void isEmpty() {
    assertFalse(testConsPriorityQueue.isEmpty());
  }

  @Test
  public void add() {
    testConsPriorityQueue2.add(1,"B");
    testConsPriorityQueue2.add(2,"C");
    testConsPriorityQueue.add(1,"B");
    testConsPriorityQueue.add(2,"C");
    testConsPriorityQueue.add(1,"C");
    testConsPriorityQueue5 = testConsPriorityQueue5.add(1,"A");
    assertEquals(testConsPriorityQueue5,testConsPriorityQueue);
  }

  @Test
  public void peek() {
    testConsPriorityQueue.add(3,"B");
    testConsPriorityQueue.add(2,"C");
    testConsPriorityQueue.add(1,"B");
    testConsPriorityQueue.add(2,"C");
    testConsPriorityQueue.add(5,"F");
    assertEquals("A",testConsPriorityQueue.peek());
    assertNotEquals("C",testConsPriorityQueue.peek());
  }

  @Test
  public void pop() {
    assertEquals(testConsPriorityQueue.pop(),rest);
  }

  @Test
  public void testEquals() {
    rest = new EmptyPriorityQueue();
    rest2 = new EmptyPriorityQueue();

    testConsPriorityQueue = new ConsPriorityQueue(priority,value,rest);
    testConsPriorityQueue2 = new ConsPriorityQueue(priority2,value2,rest2);
    assertEquals(testConsPriorityQueue,testConsPriorityQueue);
    assertNotEquals(testConsPriorityQueue,null);
    assertFalse(testConsPriorityQueue.equals(priority));
    testConsPriorityQueue = (ConsPriorityQueue) testConsPriorityQueue.add(2,"X");
    assertNotEquals(testConsPriorityQueue,testConsPriorityQueue2);

    testConsPriorityQueue = new ConsPriorityQueue(1,"A",rest);
    testConsPriorityQueue2 = new ConsPriorityQueue(1,"A",rest);
    assertTrue(testConsPriorityQueue.equals(testConsPriorityQueue2));

    testConsPriorityQueue = new ConsPriorityQueue(null,"A",rest);
    testConsPriorityQueue2 = new ConsPriorityQueue(1,"A",rest);
    assertFalse(testConsPriorityQueue.equals(testConsPriorityQueue2));

    testConsPriorityQueue = new ConsPriorityQueue(1,"A",rest);
    testConsPriorityQueue2 = new ConsPriorityQueue(null,"A",rest);
    assertFalse(testConsPriorityQueue.equals(testConsPriorityQueue2));

    testConsPriorityQueue = new ConsPriorityQueue(1,null,rest);
    testConsPriorityQueue2 = new ConsPriorityQueue(1,"A",rest);
    assertFalse(testConsPriorityQueue.equals(testConsPriorityQueue2));

    testConsPriorityQueue = new ConsPriorityQueue(1,"A",null);
    testConsPriorityQueue2 = new ConsPriorityQueue(1,"A",rest);
    assertFalse(testConsPriorityQueue.equals(testConsPriorityQueue2));

    testConsPriorityQueue = new ConsPriorityQueue(1,"A",rest);
    testConsPriorityQueue2 = new ConsPriorityQueue(1,"A",null);
    assertFalse(testConsPriorityQueue.equals(testConsPriorityQueue2));

  }

  @Test
  public void testHashCode() {
    int hash = testConsPriorityQueue.hashCode();
    assertEquals(hash,testConsPriorityQueue.hashCode());
    assertNotEquals(0,testConsPriorityQueue.hashCode());

  }

  @Test
  public void testHashCode2() {
    final int prime = 31;

    int result = 1;
    result = (prime * result) + ((priority == null) ? 0 :
        priority.hashCode());
    result = (prime * result) + ((value == null) ? 0 : value.hashCode());
    result = (prime * result) + ((rest == null) ? 0 : rest.hashCode());
    assertEquals(result,testConsPriorityQueue.hashCode());

    result = 1;
    priority = null;
    value = "apple";
    rest = PriorityQueue.createEmpty();
    result = (prime * result) + ((priority == null) ? 0 :
        priority.hashCode());
    result = (prime * result) + ((value == null) ? 0 : value.hashCode());
    result = (prime * result) + ((rest == null) ? 0 : rest.hashCode());
    testConsPriorityQueue = new ConsPriorityQueue(priority,value,rest);
    assertEquals(result,testConsPriorityQueue.hashCode());


    result = 1;
    priority = 1;
    value = null;
    rest = PriorityQueue.createEmpty();
    result = (prime * result) + ((priority == null) ? 0 :
        priority.hashCode());
    result = (prime * result) + ((value == null) ? 0 : value.hashCode());
    result = (prime * result) + ((rest == null) ? 0 : rest.hashCode());
    testConsPriorityQueue = new ConsPriorityQueue(priority,value,rest);
    assertEquals(result,testConsPriorityQueue.hashCode());

    result = 1;
    priority = 1;
    value = "apple";
    rest = null;
    result = (prime * result) + ((priority == null) ? 0 :
        priority.hashCode());
    result = (prime * result) + ((value == null) ? 0 : value.hashCode());
    result = (prime * result) + ((rest == null) ? 0 : rest.hashCode());
    testConsPriorityQueue = new ConsPriorityQueue(priority,value,null);
    assertEquals(result,testConsPriorityQueue.hashCode());
  }


  @Test
  public void testToString() {
    String expectedString = "ConsPriorityQueue{" +
        "first.priority=" + priority +
        ", first.value=" + value +
        ", rest=" + rest +
        '}';

    testConsPriorityQueue = new ConsPriorityQueue(priority,value,rest);
    assertEquals(testConsPriorityQueue.toString(),expectedString);
  }
}