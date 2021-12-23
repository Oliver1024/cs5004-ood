package practicePackage;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This is a AuthorTest class, which has 4 fields.
 */
public class AuthorTest {

  private Author testAuthor;
  private String expectName;
  private String expectEmail;
  private String expectAddress;

  @Before
  public void setUp() throws Exception {
    expectName = "Helmi the Mouse";
    expectEmail = "helmi@mouse.com";
    expectAddress = "Zurich, Swiss";
    testAuthor = new Author(expectName, expectEmail, expectAddress);

  }

  /**
   * Test getName() function
   */
  @Test
  public void getName() {
    assertEquals(expectName, testAuthor.getName());
  }

  /**
   * Test getEmail() function
   */
  @Test
  public void getEmail() {
    assertEquals(expectEmail, testAuthor.getEmail());
  }

  /**
   * Test getAddress function
   */
  @Test
  public void getAddress() {
    assertEquals(expectAddress, testAuthor.getAddress());
  }
}