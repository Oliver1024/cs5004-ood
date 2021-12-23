package problem2;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Objects;
import org.junit.Before;
import org.junit.Test;


public class SetImplementTest {
  private Set testSetImplement;
  private Set testSetImplement2;
  private Set testSetImplement3;


  @Before
  public void setUp() throws Exception {
    testSetImplement = new SetImplement();
    testSetImplement2 = new SetImplement();
    testSetImplement3 = new SetImplement();

    testSetImplement2 = testSetImplement2.add(1);
    testSetImplement2 = testSetImplement2.add(2);
  }

  @Test
  public void emptySet() {
    testSetImplement.emptySet();
    assertNotNull(testSetImplement2);
    assertNotEquals(null, testSetImplement2);
  }

  @Test
  public void isEmpty() {
    assertFalse(testSetImplement2.isEmpty());
    assertTrue(testSetImplement.isEmpty());

  }

  @Test
  public void add() {
    testSetImplement3 = testSetImplement3.add(5);
    testSetImplement3 = testSetImplement3.add(5);
    assertNotNull(testSetImplement);
    assertEquals(testSetImplement3.add(5),testSetImplement3.add(5));

  }

  @Test
  public void contains() {
    testSetImplement2.contains(2);
    assertTrue(testSetImplement2.contains(2));
  }

  @Test
  public void remove() {
    testSetImplement2 = testSetImplement2.remove(4);
    testSetImplement2 = testSetImplement2.remove(1);
    testSetImplement2 = testSetImplement2.remove(2);
    testSetImplement2 = testSetImplement2.remove(3);

    assertFalse(testSetImplement2.contains(2));
    assertFalse(testSetImplement2.contains(1));
    assertFalse(testSetImplement2.contains(3));
    testSetImplement3 = testSetImplement3.add(3);
    assertFalse(testSetImplement3.isEmpty());
    assertNotNull(testSetImplement3);

  }


  @Test
  public void size() {
    assertTrue(testSetImplement.size().equals(0));
  }


  @Test
  public void testEquals() {
    testSetImplement3 = new SetImplement();
    testSetImplement3.add(10);
    assertTrue(testSetImplement.equals(testSetImplement));
    testSetImplement2.add(10);
    assertFalse(testSetImplement.equals(testSetImplement2));
    assertNotEquals(testSetImplement,null);
    assertFalse(testSetImplement.equals(""));
    assertTrue(testSetImplement.equals(testSetImplement3));
    assertEquals(testSetImplement,testSetImplement3);
    assertNotEquals(testSetImplement2,testSetImplement3);

  }


  @Test
  public void testHashCode() {
    assertTrue(testSetImplement.hashCode() == testSetImplement.hashCode());
    assertFalse(testSetImplement.hashCode() == 0);
    Integer[] a = new Integer[1];
    a[0] = 2;

    int result = Objects.hash(1);
    result = 31 * result;

    for(int i = 0; i<1; i++){
      result += Objects.hash(a[i]);
    }

    testSetImplement = testSetImplement.add(2);
    assertEquals(result, testSetImplement.hashCode());
  }

  @Test
  public void testToString() {

    testSetImplement = testSetImplement.add(1);
    Integer[] a = new Integer[1];
    a[0] = 1;
    String expectedString = "SetImplement{" +
        "items=" + Arrays.toString(a) +
        ", size=" + 1 +
        '}';
    assertEquals(expectedString, testSetImplement.toString());
  }
}