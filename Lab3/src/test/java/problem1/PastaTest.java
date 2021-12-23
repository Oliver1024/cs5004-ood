package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PastaTest {
  private Pasta testPasta;

  @Before
  public void setUp() throws Exception {
    testPasta = new Pasta("Pasta", 1.1,2,5);
  }

  @Test
  public void testPasta() {
    assertEquals(testPasta.getName(),"Pasta");
  }
}