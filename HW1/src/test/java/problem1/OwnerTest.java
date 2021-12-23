package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OwnerTest {

  private Owner testOwner;
  private Owner testOwner1;
  private String expectedFirstName;
  private String expectedLastName;
  private String expectedPhoneNumber;
  private String expectInvalidPhoneNumber;

  @Before
  public void setUp() throws Exception {
    expectedFirstName = "Tom";
    expectedLastName = "Smith";
    expectedPhoneNumber = "2066061111";
    expectInvalidPhoneNumber = "666";

    testOwner = new Owner("Tom", "Smith", "2066061111");
    testOwner1 = new Owner(expectedFirstName, expectedLastName, expectInvalidPhoneNumber);

  }

  @Test
  public void getFirstName() {
    assertEquals(expectedFirstName, testOwner.getFirstName());
  }

  @Test
  public void getLastName() {
    assertEquals(expectedLastName, testOwner.getLastName());
  }

  @Test
  public void getPhoneNumber() {
    assertEquals(expectedPhoneNumber, testOwner.getPhoneNumber());
    assertEquals(null, testOwner1.getPhoneNumber());
  }

  @Test
  public void setFirstName() {
    String expectFirstName = "Tim";
    testOwner.setFirstName("Tim");
    assertEquals(expectFirstName, testOwner.getFirstName());
  }

  @Test
  public void setLastName() {
    String expectLastName = "Jim";
    testOwner.setLastName("Jim");
    assertEquals(expectLastName, testOwner.getLastName());
  }

  @Test
  public void setPhoneNumber() {
    String expectPhoneNumber = "2066065555";
    testOwner.setPhoneNumber("2066065555");
    assertEquals(expectPhoneNumber, testOwner.getPhoneNumber());
  }
}