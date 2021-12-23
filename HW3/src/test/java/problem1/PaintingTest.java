package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PaintingTest {
  private Painting testPainting;
  private Painting testPainting2;
  private Painting testPainting3;
  private Painting testPainting7;
  private Painting testPainting8;

  @Before
  public void setUp() throws Exception {
    testPainting = new Painting("105", PropertySize.SMALL, false,
        0);
    testPainting2 = new Painting("106", PropertySize.SMALL, true,
        0);
    testPainting3 = new Painting("107", PropertySize.SMALL, false,
        1);
    testPainting7 = new Painting("107", PropertySize.LARGE, false,
        1);
    testPainting8 = new Painting("108", PropertySize.LARGE, true,
        3);
  }

  @Test
  public void calculatePrice() {
    testPainting.setTimeService(1);
    assertEquals(1280,testPainting.calculatePrice(testPainting),0);
    assertNotEquals(1000,testPainting2.calculatePrice(testPainting2));
    assertEquals(1152,testPainting2.calculatePrice(testPainting2),0);
    assertEquals(1848.96,testPainting8.calculatePrice(testPainting8),0);
    assertEquals(1344,testPainting3.calculatePrice(testPainting3),0);

    testPainting8.setTimeService(9);
    assertEquals(1027.2,testPainting8.calculatePrice(testPainting8),0);
    testPainting7.setTimeService(9);
    assertEquals(1008,testPainting7.calculatePrice(testPainting7),0);
  }

  @Test
  public void testHashCode() {
    int hash = testPainting.hashCode();
    assertEquals(testPainting.hashCode(),hash);
  }

  @Test
  public void testToString() {
    String expectedString = testPainting.toString();
    assertEquals(expectedString, testPainting.toString());
  }

  @Test
  public void testEquals() {
    assertTrue(testPainting.equals(testPainting));
    assertTrue(testPainting3.equals(testPainting3));
    assertTrue(testPainting2.equals(testPainting2));
  }

  @Test
  public void testEquals2() {
    assertFalse(testPainting.equals(testPainting2));
    assertNotEquals(testPainting,null);
    assertEquals(java.util.Optional.of(1),
        java.util.Optional.ofNullable(testPainting3.getNumberOfPets()));
  }

  @Test
  public void equalsDifferentDataTypes() {
    assertFalse(testPainting.equals(PropertySize.SMALL));
  }

  @Test
  public void equalsSameFields()
      throws InvalidPropertyAddressException, InvalidSizePropertyException {
    testPainting = new Painting("106", PropertySize.SMALL, true,
        0);
    assertTrue(testPainting.equals(testPainting2));
  }

  @Test
  public void equalNotSamePets()
      throws InvalidPropertyAddressException, InvalidSizePropertyException {
    testPainting = new Painting("108", PropertySize.LARGE, true,
        0);
    testPainting8 = new Painting("108", PropertySize.LARGE, true,
        3);
    assertFalse(testPainting.equals(testPainting8));
  }
}