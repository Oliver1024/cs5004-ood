package problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ListOfStringTest {
  private ImmutableListOfStrings testListOfString;
  private ImmutableListOfStrings testListOfString2;
  private ImmutableListOfStrings testListOfString3;
  private ImmutableListOfStrings testListOfString4;
  private ImmutableListOfStrings testListOfString5;



  @Before
  public void setUp() throws Exception {

    testListOfString = new ListOfString();
    testListOfString2 = new ListOfString();
    testListOfString3 = new ListOfString();
    testListOfString4 = new ListOfString();
    testListOfString5 = new ListOfString();
  }

  @Test
  public void add() {
    testListOfString = testListOfString.add("Sky");
    testListOfString = testListOfString.add("Apple");
    testListOfString.contains("Sky");
    testListOfString.contains("Apple");
    assertEquals(testListOfString.size(), (Integer) 2 );
  }


  @Test
  public void isEmpty() {
    testListOfString = new ListOfString();
    assertTrue(testListOfString.isEmpty());
    testListOfString = testListOfString.add("ABC");
    assertFalse(testListOfString.isEmpty());
  }


  @Test
  public void containsAll() {

    testListOfString2 = testListOfString2.add("Apple");
    testListOfString2 = testListOfString2.add("Peak");
    testListOfString2 = testListOfString2.add("Bob");
    testListOfString = testListOfString.add("Sky");
    testListOfString = testListOfString.add("Orange");
    testListOfString = testListOfString.add("Apple");
    testListOfString = testListOfString.add("Peak");
    testListOfString = testListOfString.add("Bob");
    testListOfString3= testListOfString3.add("Sky");
    testListOfString3 = testListOfString3.add("Orange");
    testListOfString3 = testListOfString3.add("Apple");

    testListOfString.containsAll(testListOfString2);
    assertTrue(testListOfString.containsAll(testListOfString2));
    assertFalse(testListOfString3.containsAll(testListOfString));
    assertTrue(testListOfString4.containsAll(testListOfString5));
    assertTrue(testListOfString4.containsAll(testListOfString5));
    testListOfString5 = testListOfString5.add("ABC");
    assertFalse(testListOfString4.containsAll(testListOfString5));

  }

  @Test
  public void testHasDuplicates() {
    testListOfString2 = testListOfString2.add("Apple");
    testListOfString2 = testListOfString2.add("Peak");
    testListOfString2 = testListOfString2.add("Bob");
    testListOfString2 = testListOfString2.add("Bob");
    assertTrue(testListOfString2.hasDuplicates());

  }

  @Test
  public void testRemoveDuplicates() {
    testListOfString2.add("Apple");
    testListOfString2.add("Peak");
    testListOfString2.add("Bob");
    testListOfString2.add("Bob");

  }
}