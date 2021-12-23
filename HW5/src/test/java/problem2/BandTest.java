package problem2;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;

public class BandTest {
  private Band testBand;
  private Band testBand2;
  private Set<Person> testMember;
  private RecordingArtist testMember2;
  private String expectedName;


  @Before
  public void setUp() throws Exception {
    testMember = new HashSet<>();
    testMember2 = new RecordingArtist("Joe", "Mike");
    testMember.add(testMember2);
    expectedName = "Rock";

    testBand = new Band("Rock",testMember);
  }

  @Test
  public void testGetMembers() {
    assertEquals(testMember,testBand.getMembers());
  }

  @Test
  public void testGetName() {
    assertEquals("Rock", testBand.getName());
  }

  @Test
  public void testEquals() {
    assertEquals(testBand, testBand);
    assertNotEquals(null, testBand);
    assertFalse(testBand.equals("Rock"));
  }


  @Test
  public void testEquals2() {
    testBand2 = new Band("Rock", testMember);
    assertEquals(testBand, testBand2);

    testBand2 = new Band("Moon", testMember);
    assertFalse(testBand.equals(testBand2));
  }

  @Test
  public void testToString() {
    String expectedString = "Group{" +
        "name='" + expectedName + '\'' +
        ", members=" + testMember +
        '}';
    assertEquals(expectedString, testBand.toString());
  }
}