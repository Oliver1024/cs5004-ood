package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WindowCleaningTest {
  private WindowCleaning testWindowCleaning;
  private WindowCleaning testWindowCleaning2;
  private WindowCleaning testWindowCleaning3;
  private WindowCleaning testWindowCleaning4;
  private WindowCleaning testWindowCleaning5;
  private WindowCleaning testWindowCleaning6;
  private WindowCleaning windowCleaning;
  private String testPropertyAddress;


  @Before
  public void setUp() throws Exception {
    testWindowCleaning = new WindowCleaning("105 Ave", PropertySize.SMALL,
        false,2);
    testWindowCleaning2 = new WindowCleaning("105 Ave", PropertySize.SMALL,
        true,2);
    testWindowCleaning3 = new WindowCleaning("107 Ave", PropertySize.LARGE,
        false,1);
    testWindowCleaning4 = new WindowCleaning("108 Ave", PropertySize.LARGE,
        true,1);
    testWindowCleaning5 = new WindowCleaning("109 Ave", PropertySize.MEDIUM,
        false,3);
    testWindowCleaning6 = new WindowCleaning("110 Ave", PropertySize.MEDIUM,
        true,1);
  }

  @Test
  public void calculatePrice() {
    testWindowCleaning.setTimeService(1);
    assertEquals(84.0, testWindowCleaning.calculatePrice(windowCleaning), 0);
    assertNotEquals(81.0, testWindowCleaning.calculatePrice(windowCleaning), 0);
    assertEquals(80.0, testWindowCleaning3.calculatePrice(windowCleaning), 0);
    assertNotEquals(50.0, testWindowCleaning3.calculatePrice(windowCleaning), 0);
    assertEquals(84.0, testWindowCleaning5.calculatePrice(windowCleaning), 0);

    testWindowCleaning.setTimeService(9);
    assertNotEquals(81.0, testWindowCleaning4.calculatePrice(windowCleaning), 0);
    assertNotEquals(50.0, testWindowCleaning6.calculatePrice(windowCleaning), 0);
    assertEquals(72.0, testWindowCleaning4.calculatePrice(windowCleaning), 0);
    assertEquals(84.0, testWindowCleaning5.calculatePrice(windowCleaning), 0);

    testWindowCleaning4.setTimeService(9);
    assertNotEquals(81.0,
        testWindowCleaning4.calculatePrice(testWindowCleaning4), 0);
    assertNotEquals(50.0, testWindowCleaning6.calculatePrice(windowCleaning), 0);
    testWindowCleaning5.setTimeService(9);
    assertNotEquals(81.0,
        testWindowCleaning5.calculatePrice(testWindowCleaning5), 0);
    assertNotEquals(50.0, testWindowCleaning5.calculatePrice(windowCleaning), 0);
  }

  @Test
  public void testEquals() {
    assertTrue(testWindowCleaning.equals(testWindowCleaning));
  }

  @Test
  public void testEquals2() {
    assertFalse(testWindowCleaning.equals(testWindowCleaning2));
    assertNotEquals(testWindowCleaning,null);
  }

  @Test
  public void equalsDifferentDataTypes() {
    assertFalse(testWindowCleaning.equals(testPropertyAddress));
  }

  @Test
  public void equalsSameFields()
      throws InvalidPropertyAddressException, InvalidSizePropertyException {
    testWindowCleaning2 = new WindowCleaning("105 Ave",PropertySize.SMALL,
        false,2);
    assertTrue(testWindowCleaning.equals(testWindowCleaning2));
  }

  @Test
  public void equalNotSameAddress() {
    assertFalse(testWindowCleaning.equals(testWindowCleaning3));
  }

  @Test
  public void equalNotSamePropertySize() {
    assertFalse(testWindowCleaning.equals(testWindowCleaning3));
  }

  @Test
  public void equalNotSameMonthlyService() {
    assertFalse(testWindowCleaning.equals(testWindowCleaning2));
  }

  @Test
  public void testHashCode() {
    assertEquals(testWindowCleaning.hashCode(), testWindowCleaning.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals(testWindowCleaning.toString(), testWindowCleaning.toString());
  }
}