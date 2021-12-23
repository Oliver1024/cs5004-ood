package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BookTest {
  private Book testBook;
  private Book testBook2;
  private Author author;
  private String title;
  private Integer year;


  @Before
  public void setUp() throws Exception {
    author = new Author("Mike", "Joe");
    title = "Sky";
    year = 2021;
    testBook = new Book(author,title,year);
  }

  @Test
  public void testAuthor() {
    assertEquals(author,testBook.getCreators());
  }

  @Test
  public void testGetTitle() {
    assertEquals(title, testBook.getTitle());
  }

  @Test
  public void testGetYear() {
    assertEquals(year,testBook.getYear());
  }

  @Test
  public void testEquals() {
    assertEquals(testBook, testBook);
    assertNotEquals(null, testBook);
    assertFalse(testBook.equals("Sun"));
  }

  @Test
  public void testEquals2() {
    testBook2 = new Book(author, title, year);
    assertTrue(testBook.equals(testBook2));

    title = "Sing";
    author = new Author("good", "author");
    year = 2021;
    testBook2 = new Book(author, title, year);
    assertFalse(testBook.equals(testBook2));
  }
}