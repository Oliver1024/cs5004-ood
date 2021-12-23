package problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NameTest {
  private Name testName;
  private String expectedFirstName;
  private String getExpectedLastName;

  @Before
  public void setUp() throws Exception {
    expectedFirstName = "Jade";
    getExpectedLastName = "Nick";

    testName = new Name(expectedFirstName, getExpectedLastName);
  }

  @Test
  public void getFirstName() {
    assertEquals(expectedFirstName, testName.getFirstName());
  }

  @Test
  public void getLastName() {
    assertEquals(getExpectedLastName, testName.getLastName());
  }
}