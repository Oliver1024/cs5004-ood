package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NameTest {

  private Name testName;
  private Name testName2;
  private String expectedFirstName;
  private String expectedMiddleName;
  private String expectedLastName;
  private String expectedFirstName2;
  private String expectedMiddleName2;
  private String expectedLastName2;

  @Before
  public void setUp() throws Exception {
    expectedFirstName = "Joe";
    expectedMiddleName = "Cook";
    expectedLastName = "Tim";
    expectedFirstName2 = "York";
    expectedMiddleName2 = "Smith";
    expectedLastName2 = "Jude";
    testName = new Name(expectedFirstName, expectedMiddleName, expectedLastName);

  }

  @Test
  public void equalsReflexivity() {
    testName2 = new Name(expectedFirstName2, expectedMiddleName2, expectedLastName2);
    assertFalse(testName.equals(testName2));
    assertFalse(testName2.equals(null));
  }

  @Test
  public void equalsDifferentDataTypes() {
    assertFalse(testName.equals(expectedFirstName));
  }

  @Test
  public void equalsNotSameFirstName() {
    testName2 = new Name("Peek", expectedMiddleName, expectedLastName);
    assertFalse(testName.equals(testName2));
  }

  @Test
  public void equalsNotSameMiddleName() {
    testName2 = new Name(expectedFirstName, "Smith", expectedLastName);
    assertFalse(testName.equals(testName2));
  }

  @Test
  public void equalsNotSameLastName() {
    testName2 = new Name(expectedFirstName, expectedMiddleName, "Jude");
    assertFalse(testName.equals(testName2));
  }

  @Test
  public void equalsSameFields() {
    testName2 = new Name(expectedFirstName, expectedMiddleName, expectedLastName);
    assertTrue(testName.equals(testName2));
  }
}