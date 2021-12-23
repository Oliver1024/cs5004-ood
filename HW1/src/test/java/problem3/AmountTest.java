package problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AmountTest {
  private Amount testAmount;
  private Amount testAmount2;
  private Amount testAmount3;
  private Integer expectedDollarValue;
  private Integer expectedCentsValue;
  private Integer expectInvalidDollarValue2;
  private Integer expectInvalidCentsValue2;
  private Integer expectInvalidCentsValue3;


  @Before
  public void setUp() throws Exception {
    expectedDollarValue = 20;
    expectedCentsValue = 15;
    expectInvalidDollarValue2 = -10;
    expectInvalidCentsValue2 = -5;
    expectInvalidCentsValue3 = 110;

    testAmount = new Amount(expectedDollarValue, expectedCentsValue);
    testAmount2 = new Amount(expectInvalidDollarValue2, expectInvalidCentsValue2);
    testAmount3 = new Amount(expectedDollarValue, expectInvalidCentsValue3);
  }

  @Test
  public void getDollarValue() {
    assertEquals(expectedDollarValue, testAmount.getDollarValue());
    assertEquals(-1, testAmount2.getDollarValue(),0);
  }

  @Test
  public void getCentsValue() {
    assertEquals(expectedCentsValue, testAmount.getCentsValue());
    assertEquals(-1, testAmount2.getCentsValue(),0);
    assertEquals(-1, testAmount3.getCentsValue(),0);
  }
}