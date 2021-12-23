package problem1;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;
import org.junit.Before;
import org.junit.Test;

public class FruitTest {
  private Fruit testFruit;

  @Before
  public void setUp() throws Exception {
    testFruit = new Fruit("Apple", 3.1,10,20,
        LocalDate.of(2021, Month.MAY,15),
            LocalDate.of(2021, Month.DECEMBER,31));
    
  }

  @Test
  public void testFruit() {
    assertEquals(testFruit.getName(),"Apple");
  }
}