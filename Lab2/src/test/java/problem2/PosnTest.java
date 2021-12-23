package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PosnTest {

  private Posn testPosn;
  private Posn testPosn2;
  private Integer expectedX;
  private Integer expectedY;

  @Before
  public void setUp() throws Exception {
    expectedX = 2;
    expectedY = 6;

    testPosn = new Posn(expectedX, expectedY);
    testPosn2 = new Posn(3, 9);
  }

  @Test
  public void getX() {
    assertEquals(expectedX, testPosn.getX());
  }

  @Test
  public void getY() {
    assertEquals(expectedY, testPosn.getY());
  }

  @Test
  public void equalsReflexivity() {
    assertTrue(testPosn.equals(testPosn));
  }

  @Test
  public void equalsReflexivity2() {
    assertFalse(testPosn2.equals(null));
    assertFalse(testPosn.equals(testPosn2));
  }

  @Test
  public void equalsDifferentDataTypes() {
    assertFalse(testPosn.equals(expectedX));
  }

  @Test
  public void equalsSameFields() {
    testPosn2 = new Posn(expectedX, expectedY);
    assertTrue(testPosn.equals(testPosn2));
  }

  @Test
  public void equalsNotSameValueY() {
    int notSameY = 25;
    testPosn2 = new Posn(expectedX, notSameY);
    assertFalse(testPosn.equals(testPosn2));
  }

  @Test
  public void equalsNotSameValueX() {
    int notSameX = 30;
    testPosn2 = new Posn(notSameX, expectedY);
    assertFalse(testPosn.equals(testPosn2));
  }


  @Test
  public void HashCodeSame() {
    int expectedResult = expectedX.hashCode();
    expectedResult = expectedResult * 31 + expectedY.hashCode();
    assertEquals(expectedResult, testPosn.hashCode());
  }

  @Test
  public void HashCodeSame2() {
    testPosn2 = new Posn(null, null);
    int expectedResult = 0;
    assertEquals(expectedResult, testPosn2.hashCode());
  }

  @Test
  public void testToString() {
    String expectedString = "Posn{" +
        "x=" + expectedX +
        ", y=" + expectedY +
        '}';
    assertEquals(expectedString, testPosn.toString());
  }
}