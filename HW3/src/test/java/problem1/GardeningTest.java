package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GardeningTest {

  private Gardening testGardening;
  private Gardening testGardening2;
  private Gardening testGardening3;
  private Gardening testGardening4;
  private Gardening gardening;

  @Before
  public void setUp() throws Exception {
    testGardening = new Gardening("105 Ave", PropertySize.SMALL, false);
    testGardening2 = new Gardening("106 Ave", PropertySize.MEDIUM, true);
    testGardening3 = new Gardening("107 Ave", PropertySize.LARGE, true);
    testGardening4 = new Gardening("108 Ave", PropertySize.SMALL, true);
  }

  @Test
  public void calculatePrice() {
    testGardening.setTimeService(0);
    assertEquals(100.0,testGardening.calculatePrice(gardening),0);
    assertNotEquals(105.0,testGardening.calculatePrice(gardening),0);
    assertEquals(90.0,testGardening2.calculatePrice(testGardening2), 0);
    assertNotEquals(115.0,testGardening2.calculatePrice(gardening),0);
    assertEquals(90.0,testGardening4.calculatePrice(testGardening4), 0);
    assertNotEquals(115.0,testGardening4.calculatePrice(gardening),0);

    testGardening.setTimeService(9);
    assertEquals(50.0,testGardening.calculatePrice(gardening),0);
    assertNotEquals(105.0,testGardening.calculatePrice(gardening),0);
    assertEquals(90.0,testGardening3.calculatePrice(gardening), 0);
    assertNotEquals(115.0,testGardening3.calculatePrice(gardening),0);
    testGardening3.setTimeService(9);
    assertEquals(50,testGardening3.calculatePrice(gardening), 0);
    assertNotEquals(115.0,testGardening4.calculatePrice(testGardening4),0);
  }

  @Test
  public void testToString() {
    assertEquals(testGardening.toString(),testGardening.toString());
  }

  @Test
  public void testHashCode() {
    assertEquals(testGardening.hashCode(), testGardening.hashCode());
  }

  @Test
  public void testEquals() {
    assertTrue(testGardening.equals(testGardening));
  }

  @Test
  public void testEquals2() {
    assertFalse(testGardening.equals(testGardening2));
    assertNotEquals(testGardening2,null);
  }

  @Test
  public void equalsDifferentDataTypes() {
    assertFalse(testGardening.equals(PropertySize.SMALL));
  }

  @Test
  public void equalsSameFields()
      throws InvalidPropertyAddressException, InvalidSizePropertyException {
    testGardening2 = new Gardening("105 Ave", PropertySize.SMALL, false);
    assertTrue(testGardening.equals(testGardening2));
  }
}