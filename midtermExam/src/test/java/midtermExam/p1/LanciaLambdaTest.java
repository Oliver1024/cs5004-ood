package midtermExam.p1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LanciaLambdaTest {
  private LanciaLambda testLanciaLambda;
  private LanciaLambda testLanciaLambda2;
  private LanciaLambda testLanciaLambda3;

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

    testLanciaLambda = new LanciaLambda("1",1,MILES_LIMIT,conditionCategory2,
        latestAskingPrice);

    testLanciaLambda2 = new LanciaLambda("2",1,MILES_LIMIT2,conditionCategory1,
        latestAskingPrice);

    testLanciaLambda3 = new LanciaLambda("3",1,MILES_LIMIT2,conditionCategory2,
        latestAskingPrice);

  }

  @Test
  public void estimatePrice() {

    Double basePrice2 = latestAskingPrice * FACTOR * PERFECT_FACTOR;
    Double basePrice = latestAskingPrice * FACTOR;

    Double expectedPrice = basePrice + PLUS_AMOUNT;
    Double expectedPrice2 = basePrice2;

    assertEquals(testLanciaLambda.estimatePrice(),expectedPrice);
    assertEquals(testLanciaLambda2.estimatePrice(),expectedPrice2);
    assertNotEquals(testLanciaLambda2.estimatePrice(),expectedPrice);
  }
}