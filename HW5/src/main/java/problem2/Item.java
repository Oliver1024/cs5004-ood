package problem2;

import java.util.Objects;

/**
 * Represents an abstract class Item, with creators, title, and year
 */
public abstract class Item {
  private Creator creators;
  private String title;
  private Integer year;

  /**
   * Constructs an Item, with creators, title, and year
   * @param creators - Creator, creator of the Item
   * @param title - String, title of the Item
   * @param year - Integer, releasing year of the Item
   */
  public Item(Creator creators, String title, Integer year) {
    this.creators = creators;
    this.title = title;
    this.year = year;
  }

  /**
   * Returns the creator of the Item
   * @return the creator of the Item
   */
  public Creator getCreators() {
    return creators;
  }

  /**
   * Return the title of the Item
   * @return the title of the Item
   */
  public String getTitle() {
    return title;
  }

  /**
   * Return the year of the Item
   * @return the year of the Item
   */
  public Integer getYear() {
    return year;
  }

  /**
   * Indicates whether some other object passed as an argument is "equal to" the
   * current instance
   * @param o - an object to compare
   * @return boolean value
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(getCreators(), item.getCreators()) && Objects
        .equals(getTitle(), item.getTitle()) && Objects.equals(getYear(), item.getYear());
  }

  /**
   * Returns an integer representation of the object memory address
   * @return int, hash value
   */
  @Override
  public int hashCode() {
    return Objects.hash(getCreators(), getTitle(), getYear());
  }

  /**
   * Returns an String representation of the object
   * @return String, string
   */
  @Override
  public String toString() {
    return "Item{" +
        "creators=" + creators +
        ", title='" + title + '\'' +
        ", year=" + year +
        '}';
  }
}
