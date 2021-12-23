package simpleRecursiveList;

import static org.junit.Assert.*;

import java.util.Objects;
import org.junit.Before;
import org.junit.Test;

public class ConsTest {
  private Integer first;
  private Integer first2;
  private List rest;
  private List rest2;
  private List rest3;
  private Cons testCons;
  private Cons testCons2;
  private Cons testCons3;

  private Integer expectedFirst;
  private List expectedRest;



  @Before
  public void setUp() throws Exception {

    expectedFirst = 1;
    expectedRest = new Empty();

    first = 1;
    first2 = 1;

    rest = new Empty();
    rest2 = new Empty();
    rest = rest.add(2);
    rest = rest.add(3);
    rest = rest.add(4);
    rest = rest.add(first);
    testCons = new Cons(first,rest);
    testCons2 = new Cons(first2,rest);
  }

  @Test
  public void getFirst() {
    assertEquals(first,testCons.getFirst());

  }

  @Test
  public void getRest() {
    assertEquals(rest,testCons.getRest());

  }

  @Test
  public void size() {
    assertEquals(5, (int) testCons.size());

  }

  @Test
  public void isEmpty() {
    assertFalse(testCons.isEmpty());
  }

  @Test
  public void add() {
    List list1 = testCons.add(10);
    assertEquals(((Cons)list1).getFirst(),(Integer) 10);
  }


  @Test
  public void last() {
    assertEquals((Integer) 2, testCons.last());
  }

  @Test
  public void contains() {
    assertTrue(testCons.contains(2));
  }

  @Test
  public void elementAt() {
    assertEquals(testCons.elementAt(0),(Integer) 1);
    assertNotEquals(testCons.elementAt(0),(Integer) 2);
    assertEquals(testCons.elementAt(2),(Integer) 4);
  }

  @Test(expected = InvalidCallException.class)
  public void testInvalidCallException() {
    testCons.elementAt(-1);
  }

  @Test(expected = InvalidCallException.class)
  public void testInvalidCallException2() {
    testCons.elementAt(10);
  }


  @Test
  public void sum() {
    assertEquals((Integer)11, testCons.sum());
  }

  @Test
  public void remove() {
    testCons = (Cons) testCons.remove(1);
    testCons = (Cons) testCons.remove(8);
    testCons = (Cons) testCons.remove(2);
    assertEquals((Integer) 3,testCons.size());
  }


  @Test
  public void testEquals() {
    rest2 = rest.add(2);
    rest2 = rest.add(3);
    rest2 = rest.add(4);
    rest2 = rest.add(first);
    testCons2 = new Cons(first2,rest);;

    assertEquals(testCons, testCons);
    assertFalse(testCons.equals(first));
    assertTrue(testCons.equals(testCons2));
    assertNotEquals(null,testCons);
    assertFalse(testCons.equals(rest));

  }

  @Test
  public void testEquals2() {
    rest2 = rest.add(2);
    rest2 = rest.add(3);
    rest2 = rest.add(5);
    rest2 = rest.add(first);
    testCons2 = new Cons(first2,rest2);
    assertFalse(testCons.equals(testCons2));
  }

  @Test
  public void testEquals3() {
    Integer first2 = 6;
    rest2 = rest.add(2);
    rest2 = rest.add(3);
    rest2 = rest.add(5);
    rest2 = rest.add(first2);

    testCons2 = new Cons(first2,rest2);
    assertFalse(testCons.equals(testCons2));

  }


  @Test
  public void testEquals5() {

    testCons = new Cons(first,rest2);

    assertTrue(testCons.equals(testCons));
    assertFalse(testCons.equals(null));
    assertFalse(testCons.equals(expectedFirst));
    testCons2 = new Cons(expectedFirst, expectedRest);
    assertTrue(testCons.equals(testCons2));

    testCons2 = new Cons(null, expectedRest);
    testCons3 = new Cons(null, null);
    assertFalse(testCons3.equals(testCons2));

    testCons2 = new Cons(null, expectedRest);
    assertFalse(testCons.equals(testCons2));
    assertFalse(testCons2.equals(testCons));

    testCons2 = new Cons(expectedFirst, expectedRest);
    assertTrue(testCons.equals(testCons2));

    testCons2 = new Cons(expectedFirst, null);
    assertFalse(testCons.equals(testCons2));

    testCons2 = new Cons(expectedFirst, expectedRest);
    testCons3 = new Cons(expectedFirst, testCons);
    assertFalse(testCons3.equals(testCons2));

    testCons2 = new Cons(expectedFirst, null);
    testCons3 = new Cons(expectedFirst, testCons);
    assertFalse(testCons3.equals(testCons2));

    testCons2 = new Cons(expectedFirst, null);
    testCons3 = new Cons(expectedFirst, null);
    assertTrue(testCons3.equals(testCons2));

    testCons2 = new Cons(3, expectedRest);
    assertFalse(testCons.equals(testCons2));

    testCons2 = new Cons(3, testCons);
    assertFalse(testCons.equals(testCons2));

  }




  @Test
  public void testHashCode() {
    int hash = testCons.hashCode();
    assertEquals(hash,testCons.hashCode());
  }

  @Test
  public void testHashCodeNull() {
    assertNotEquals(0, testCons.hashCode());

  }

  @Test
  public void testHashCodeEquality() {
    rest2 = rest.add(2);
    rest2 = rest.add(3);
    rest2 = rest.add(4);
    rest2 = rest.add(first);
    testCons2 = new Cons(first2,rest);;
    assertEquals(testCons.equals(testCons2), (testCons.hashCode()
        == testCons2.hashCode()));
  }

  @Test
  public void testHashCode2() {
    testCons = new Cons(first,rest2);

    int HASHCODE = 31;
    int hash = expectedFirst.hashCode();
    hash = HASHCODE * hash + expectedRest.hashCode();
    assertEquals(hash, testCons.hashCode());

    testCons2 = new Cons(null,null);
    assertEquals(0,testCons2.hashCode());

    testCons2 = new Cons(null, expectedRest);
    hash = 0 + expectedRest.hashCode();
    assertEquals(hash,testCons2.hashCode());

    testCons2 = new Cons(expectedFirst, null);
    hash = expectedFirst.hashCode() * HASHCODE;
    assertEquals(hash, testCons2.hashCode());

  }

  @Test
  public void testToString() {
    String expectedString = "Cons{"
        + "first=" + first
        + ", rest=" + rest
        + '}';
    assertEquals(expectedString,testCons.toString());
  }
}