package simpleRecursiveList;

import static org.junit.Assert.*;

import java.util.Objects;
import org.junit.Before;
import org.junit.Test;

public class EmptyTest {
  private Empty testEmpty;
  private Empty testEmpty2;

  @Before
  public void setUp() throws Exception {
    testEmpty = new Empty();
    testEmpty2 = new Empty();

  }

  @Test
  public void size() {
    assertEquals((Integer) 0,testEmpty.size());
  }

  @Test
  public void isEmpty() {
    assertEquals(true,testEmpty.isEmpty());
  }

  @Test
  public void add() {
     testEmpty.add(1);
  }

  @Test(expected = InvalidCallException.class)
  public void lastException() {
    assertNotEquals(0, (int) testEmpty.last());

  }

  @Test
  public void contains() {
    assertFalse(testEmpty.contains(0));

  }

  @Test(expected = InvalidCallException.class)
  public void elementAt() {
    testEmpty.elementAt(0);
  }

  @Test
  public void sum() {
    assertEquals((Integer)0,testEmpty.sum());
  }

  @Test
  public void remove() {
    testEmpty.remove(1);
    assertEquals(testEmpty,testEmpty.remove(1));
  }

  @Test
  public void testEquals() {
    assertEquals(testEmpty, testEmpty);
    assertEquals(false, testEmpty.equals(0));
    assertTrue(testEmpty.equals(testEmpty2));
    assertNotEquals(null,testEmpty);
  }

  @Test
  public void testHashCode() {
    assertFalse(0 == testEmpty.hashCode());
    assertTrue(testEmpty.equals(testEmpty2) ==
        (testEmpty.hashCode()==testEmpty2.hashCode()));
    int hash = testEmpty.hashCode();
    assertEquals(hash,testEmpty.hashCode());
  }

  @Test
  public void testToString() {
    String expectedString = "Empty{}";
    assertEquals(expectedString,testEmpty.toString());
  }
}