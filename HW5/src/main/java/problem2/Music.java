package problem2;

/**
 * Represents a concrete class Music, extending its parent class Item
 */
public class Music extends Item{

  /**
   * Constructs a Music, with creators, title, and year
   * @param creators - Creator, creator of the Music
   * @param title - String, title of the Music
   * @param year - Integer, releasing year of the Music
   */
  public Music(Creator creators, String title, Integer year) {
    super(creators, title, year);
  }
}
