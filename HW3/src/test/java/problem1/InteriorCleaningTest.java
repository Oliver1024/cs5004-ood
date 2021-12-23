package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class InteriorCleaningTest {
  private InteriorCleaning testInteriorCleaning;
  private InteriorCleaning testInteriorCleaning1;
  private InteriorCleaning testInteriorCleaning2;
  private InteriorCleaning testInteriorCleaning3;
  private InteriorCleaning testInteriorCleaning5;
  private InteriorCleaning testInteriorCleaning6;

  @Before
  public void setUp() throws Exception {
    testInteriorCleaning = new InteriorCleaning("105 Ave", PropertySize.SMALL,
        false,1,0);
    testInteriorCleaning1 = new InteriorCleaning("105 Ave", PropertySize.SMALL,
        false,1,1);
    testInteriorCleaning2 = new InteriorCleaning("106 Ave", PropertySize.SMALL,
        true,1,0);

    testInteriorCleaning3 = new InteriorCleaning("107 Ave", PropertySize.LARGE,
        false,1,3);

    testInteriorCleaning5 = new InteriorCleaning("109 Ave", PropertySize.MEDIUM,
        false,2,2);
    testInteriorCleaning6 = new InteriorCleaning("110 Ave", PropertySize.MEDIUM,
        true,2,1);
    testInteriorCleaning6 = new InteriorCleaning("110 Ave", PropertySize.MEDIUM,
        true,5,1);
  }

  @Test
  public void calculatePrice() {
    testInteriorCleaning.setTimeService(1);
    assertEquals(80,testInteriorCleaning.calculatePrice(testInteriorCleaning),0);
    assertNotEquals(50,testInteriorCleaning.calculatePrice(testInteriorCleaning));
    assertNotEquals(50,testInteriorCleaning3.calculatePrice(testInteriorCleaning3));
    assertNotEquals(50,testInteriorCleaning5.calculatePrice(testInteriorCleaning3));
    assertNotEquals(50,testInteriorCleaning6.calculatePrice(testInteriorCleaning3));

    testInteriorCleaning.setTimeService(9);
    assertEquals(40,testInteriorCleaning.calculatePrice(testInteriorCleaning),0);
    assertEquals(72,testInteriorCleaning2.calculatePrice(testInteriorCleaning),0);
    assertEquals(75.6,testInteriorCleaning6.calculatePrice(testInteriorCleaning),0.1);
    testInteriorCleaning6.setTimeService(9);
    assertEquals(42,testInteriorCleaning6.calculatePrice(testInteriorCleaning),0.1);
    assertNotEquals(100,testInteriorCleaning6.calculatePrice(testInteriorCleaning));
  }
}