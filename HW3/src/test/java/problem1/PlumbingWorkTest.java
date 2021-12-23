package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PlumbingWorkTest {
  private PlumbingWork testPlumbingWork;
  private PlumbingWork testPlumbingWork2;
  private PlumbingWork testPlumbingWork3;
  private PlumbingWork testPlumbingWork4;
  private String testPropertyAddress;

  @Before
  public void setUp() throws Exception {
    testPlumbingWork = new PlumbingWork("105Ave",PropertySize.SMALL,
        false,1,false);
    testPlumbingWork2 = new PlumbingWork("106Ave",PropertySize.MEDIUM,
        true,1,false);
    testPlumbingWork3 = new PlumbingWork("105Ave",PropertySize.LARGE,
        false,2,true);
    testPlumbingWork4 = new PlumbingWork("105Ave",PropertySize.SMALL,
        false,3,false);
  }

  @Test
  public void calculatePrice() {
    testPlumbingWork.setTimeService(1);
    assertEquals(220,testPlumbingWork.calculatePrice(testPlumbingWork),0);
    assertNotEquals(500,testPlumbingWork.calculatePrice(testPlumbingWork2));
    assertEquals(420,testPlumbingWork3.calculatePrice(testPlumbingWork3),0);
    assertNotEquals(500,testPlumbingWork4.calculatePrice(testPlumbingWork4));
    assertEquals(200,testPlumbingWork2.calculatePrice(testPlumbingWork2),0);

    testPlumbingWork4.setTimeService(9);
    assertEquals(320,testPlumbingWork4.calculatePrice(testPlumbingWork4),0);
    assertNotEquals(500,testPlumbingWork2.calculatePrice(testPlumbingWork2));
    testPlumbingWork2.setTimeService(9);
    assertNotEquals(500,testPlumbingWork2.calculatePrice(testPlumbingWork2));
  }

  @Test
  public void testHashCode() {
    int hash = testPlumbingWork.hashCode();
    assertEquals(testPlumbingWork.hashCode(),hash);
  }

  @Test
  public void testToString() {
    String expectString = testPlumbingWork.toString();
    assertEquals(expectString, testPlumbingWork.toString());
  }

  @Test
  public void testEquals() {
    assertTrue(testPlumbingWork.equals(testPlumbingWork));
    assertTrue(testPlumbingWork2.equals(testPlumbingWork2));
  }

  @Test
  public void testEquals2() {
    assertFalse(testPlumbingWork.equals(testPlumbingWork2));
    assertNotEquals(testPlumbingWork,null);
  }

  @Test
  public void equalsDifferentDataTypes() {
    assertFalse(testPlumbingWork.equals(testPropertyAddress));
  }

  @Test
  public void equalsSameFields()
      throws InvalidPropertyAddressException, InvalidSizePropertyException {
    testPlumbingWork2 = new PlumbingWork("105Ave",PropertySize.SMALL,
        false,1,false);
    assertTrue(testPlumbingWork.equals(testPlumbingWork2));

    testPlumbingWork = new PlumbingWork("105Ave", PropertySize.SMALL,
        false, 1,false);
    assertTrue(testPlumbingWork.equals(testPlumbingWork2));
  }

  @Test
  public void equalNotSameComplex()
      throws InvalidPropertyAddressException, InvalidSizePropertyException {
    testPlumbingWork = new PlumbingWork("105Ave",PropertySize.SMALL,
        true,1,false);
    testPlumbingWork2 = new PlumbingWork("105Ave",PropertySize.SMALL,
        true,1,true);
    assertFalse(testPlumbingWork.equals(testPlumbingWork2));
  }

  @Test
  public void equalNotSameLicensedEmployee()
      throws InvalidPropertyAddressException, InvalidSizePropertyException {
    testPlumbingWork = new PlumbingWork("105Ave",PropertySize.SMALL,
        true,1,true);
    testPlumbingWork2 = new PlumbingWork("105Ave",PropertySize.SMALL,
        true,2,true);
    assertFalse(testPlumbingWork.equals(testPlumbingWork2));
  }

}