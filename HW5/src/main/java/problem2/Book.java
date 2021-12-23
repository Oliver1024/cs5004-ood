package problem2;

/**
 * Represents a concrete class Book, extending its parent class Item
 */
public class Book extends Item{

  /**
   * Constructs a Book, with author, title, and year
   * @param author - Creator, creator of the Book
   * @param title - String, title of the Book
   * @param year  Integer, releasing year of the Book
   */
  public Book(Author author, String title, Integer year) {
    super(author, title, year);
  }
}
