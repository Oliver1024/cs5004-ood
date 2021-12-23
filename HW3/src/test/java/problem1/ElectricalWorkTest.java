package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ElectricalWorkTest {
  private ElectricalWork testElectricalWork;
  private ElectricalWork testElectricalWork2;
  private ElectricalWork testElectricalWork3;
  private ElectricalWork testElectricalWork4;


  @Before
  public void setUp() throws Exception {
    testElectricalWork = new ElectricalWork("105Ave",PropertySize.SMALL,
        false,1,false);
    testElectricalWork2 = new ElectricalWork("105Ave",PropertySize.LARGE,
        false,2,true);
    testElectricalWork3 = new ElectricalWork("105Ave",PropertySize.MEDIUM,
        true,1,false);
    testElectricalWork4 = new ElectricalWork("105Ave",PropertySize.SMALL,
        true,2,true);
  }

  @Test
  public void calculatePrice() {
    testElectricalWork.setTimeService(1);
    assertEquals(250,testElectricalWork.calculatePrice(testElectricalWork),0);
    assertNotEquals(100,testElectricalWork.calculatePrice(testElectricalWork2),0);
    assertEquals(450,testElectricalWork2.calculatePrice(testElectricalWork2),0);
    assertNotEquals(450,testElectricalWork4.calculatePrice(testElectricalWork4),0);

    testElectricalWork4.setTimeService(9);
    assertEquals(450,testElectricalWork2.calculatePrice(testElectricalWork2),0);
    assertNotEquals(100,testElectricalWork4.calculatePrice(testElectricalWork4),0);
    testElectricalWork2.setTimeService(9);
    assertNotEquals(150,testElectricalWork2.calculatePrice(testElectricalWork2),0);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testIllegalArgumentException()
      throws IllegalArgumentException, InvalidPropertyAddressException,
      InvalidSizePropertyException {
    ElectricalWork testElectricalWork = new ElectricalWork("105Ave",PropertySize.SMALL,
        true,5,true);

  }

  @Test(expected = InvalidPropertyAddressException.class)
  public void testInvalidPropertyAddressException()
      throws InvalidPropertyAddressException, InvalidSizePropertyException {
    ElectricalWork testElectricalWork = new ElectricalWork(null,PropertySize.SMALL,
        true,2,true);
    ElectricalWork testElectricalWork2 = new ElectricalWork("",PropertySize.SMALL,
        true,2,true);

  }

  @Test(expected = InvalidSizePropertyException.class)
  public void testInvalidSizePropertyException()
      throws InvalidPropertyAddressException, InvalidSizePropertyException {
    ElectricalWork testElectricalWork = new ElectricalWork("105Ave",null,
        true,2,true);

  }
}