package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AuthorTest {
  private Author testAuthor;
  private Author testAuthor2;


  @Before
  public void setUp() throws Exception {
    testAuthor = new Author("Joe", "Sam");
  }

  @Test
  public void testGetName() {
    String expectName = "Joe" + " " + "Sam";
    assertEquals(expectName, testAuthor.getName());
  }

  @Test
  public void testEquals() {
    assertEquals(testAuthor, testAuthor);
    assertNotEquals(null, testAuthor);
    assertFalse(testAuthor.equals("Joe"));
  }

  @Test
  public void testEquals2() {
    testAuthor2 = new Author("Joe", "Sam");
    assertEquals(testAuthor, testAuthor2);

    testAuthor2 = new Author("Joe", "Peter");
    assertFalse(testAuthor.equals(testAuthor2));

    testAuthor2 = new Author("Joo", "Peter");
    assertFalse(testAuthor.equals(testAuthor2));
  }
}