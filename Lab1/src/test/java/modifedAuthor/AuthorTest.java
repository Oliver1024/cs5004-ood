package modifedAuthor;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class is a AuthorTest, which has 4 fields.
 */
public class AuthorTest {

  private Author testAuthor;
  private Name expectedName;
  private Address expectedAddress;
  private EmailAddress expectedEmailAddress;

  @Before
  public void setUp() throws Exception {
    expectedName = new Name("Jim", "King", "Jude");
    expectedAddress = new Address("481 Terry Ave N", "Seattle", "WA", "98109");
    expectedEmailAddress = new EmailAddress("Oliver", "@", "gmail.com");

    testAuthor = new Author(new Name("Jim", "King", "Jude"),
        new EmailAddress("Oliver", "@", "gmail.com"),
        new Address("481 Terry Ave N", "Seattle", "WA", "98109"));
  }

  /**
   * Test getName() function
   */
  @Test
  public void getName() {
    assertEquals(expectedName.getFirstName(), testAuthor.getName().getFirstName());
    assertEquals(expectedName.getMiddleName(), testAuthor.getName().getMiddleName());
    assertEquals(expectedName.getLastName(), testAuthor.getName().getLastName());
  }

  /**
   * Test getEmailAddress() function
   */
  @Test
  public void getEmailAddress() {
    assertEquals(expectedEmailAddress, testAuthor.getEmailAddress());
  }

  /**
   * Test getAddress() function
   */
  @Test
  public void getAddress() {
    assertEquals(expectedAddress, testAuthor.getAddress());
  }
}