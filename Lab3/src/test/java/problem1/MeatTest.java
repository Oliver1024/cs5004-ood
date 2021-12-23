package problem1;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;
import org.junit.Before;
import org.junit.Test;

public class MeatTest {
  private Meat testMeat;

  @Before
  public void setUp() throws Exception {
    testMeat = new Meat("Beef", 10.5,10,20,
        LocalDate.of(2021, Month.MAY,15),
        LocalDate.of(2021, Month.DECEMBER,31) );
  }

  @Test
  public void testMeat() {
    assertEquals(testMeat.getName(),"Beef");
  }
}