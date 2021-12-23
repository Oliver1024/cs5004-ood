package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MusicTest {
  private Music testMusic;
  private Creator testCreator;
  private String title;
  private Integer year;

  @Before
  public void setUp() throws Exception {
    testCreator = new RecordingArtist("Joe","Mike");
    year = 2021;
    title = "Fast&Speed";
    testMusic = new Music(testCreator, title, year);
  }

  @Test
  public void testGetTitle() {
    assertEquals(title,testMusic.getTitle());
  }
}