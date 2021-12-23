package midtermExam.p1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FordModelATest {
  private FordModelA testFordModelA;
  private FordModelA testFordModelA2;
  private FordModelA testFordModelA3;

  private Double latestAskingPrice;
  private static final Double FACTOR = 3.2;
  private static final Double PERFECT_FACTOR = 2.15;
  private static final Integer MILES_LIMIT = 50000;
  private static final Integer MILES_LIMIT2 = 350000;
  private static final Double PLUS_AMOUNT = 50000.0;
  private ConditionCategory conditionCategory1;
  private ConditionCategory conditionCategory2;



  @Before
  public void setUp() throws Exception {
    latestAskingPrice = 100.0;
    conditionCategory1 = ConditionCategory.PERFECT;
    conditionCategory2 = ConditionCategory.FINE;


    testFordModelA = new FordModelA("1",1,MILES_LIMIT,conditionCategory2,
        latestAskingPrice);

    testFordModelA2 = new FordModelA("2",1,MILES_LIMIT2,conditionCategory1,
        latestAskingPrice);

    testFordModelA3 = new FordModelA("3",1,MILES_LIMIT2,conditionCategory2,
        latestAskingPrice);
  }

  @Test
  public void estimatePrice() {
    Double basePrice2 = latestAskingPrice * FACTOR * PERFECT_FACTOR;
    Double basePrice = latestAskingPrice * FACTOR;

    Double expectedPrice = basePrice + PLUS_AMOUNT;
    Double expectedPrice2 = basePrice2;

    assertEquals(testFordModelA.estimatePrice(),expectedPrice);
    assertEquals(testFordModelA2.estimatePrice(),expectedPrice2);
    assertNotEquals(testFordModelA2.estimatePrice(),expectedPrice);

  }
}