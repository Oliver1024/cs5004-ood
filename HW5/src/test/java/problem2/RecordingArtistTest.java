package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RecordingArtistTest {
  private RecordingArtist testRecordingArtist;

  @Before
  public void setUp() throws Exception {
    testRecordingArtist = new RecordingArtist("Joe", "Mike");
  }

  @Test
  public void testGetName() {
    String expectedName = "Joe" + " " + "Mike";
    assertEquals(expectedName, testRecordingArtist.getName());
  }

  @Test
  public void testGetMembers() {
    assertNull(testRecordingArtist.getMembers());
  }
}