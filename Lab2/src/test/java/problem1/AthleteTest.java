package problem1;

import static org.junit.Assert.*;

import java.util.Objects;
import org.junit.Before;
import org.junit.Test;

public class AthleteTest {

  private Athlete testAthlete;
  private Athlete testAthlete2;
  private Name expectedName;
  private Double expectedWeight;
  private Double expectedHeight;
  private String expectedLeague;

  private Name name2;
  private Double weight2;
  private Double height2;

  @Before
  public void setUp() throws Exception {
    expectedName = new Name("Simone", "Afar", "Jude");
    expectedWeight = 56.0;
    expectedHeight = 104.0;
    expectedLeague = "N/A";

    testAthlete = new Athlete(expectedName, expectedHeight, expectedWeight, expectedLeague);
    name2 = new Name("Kyle", "Duk", "Hook");
    weight2 = 180.0;
    height2 = 6.0;
  }

  @Test
  public void getAthletesName() {
    assertEquals(expectedName, testAthlete.getAthletesName());

  }

  @Test
  public void getHeight() {
    assertEquals(expectedHeight, testAthlete.getHeight());
  }

  @Test
  public void getWeight() {
    assertEquals(expectedWeight, testAthlete.getWeight());
  }

  @Test
  public void getLeague() {
    assertEquals(expectedLeague, testAthlete.getLeague());
  }

  @Test
  public void equalsReflexivity() {
    assertTrue(testAthlete.equals(testAthlete));
  }

  @Test
  public void equalsReflexivity2() {
    testAthlete2 = new Athlete(name2, height2, weight2);
    assertFalse(testAthlete.equals(testAthlete2));
    assertFalse(testAthlete2.equals(null));
  }

  @Test
  public void equalsDifferentDataTypes() {
    assertFalse(testAthlete.equals(expectedName));
  }

  @Test
  public void equalsSameFields() {
    testAthlete2 = new Athlete(expectedName, expectedHeight, expectedWeight, expectedLeague);
    assertTrue(testAthlete.equals(testAthlete2));
  }

  @Test
  public void equalsNotSameHeight() {
    testAthlete2 = new Athlete(expectedName, 6.0, expectedWeight, expectedLeague);
    assertFalse(testAthlete.equals(testAthlete2));
  }

  @Test
  public void equalsNotSameWeight() {
    testAthlete2 = new Athlete(expectedName, expectedHeight, 200.0, expectedLeague);
    assertFalse(testAthlete.equals(testAthlete2));
  }

  @Test
  public void equalsNotSameLeague() {
    testAthlete2 = new Athlete(expectedName, expectedHeight, expectedWeight, "Little league");
    assertFalse(testAthlete.equals(testAthlete2));
  }

  @Test
  public void hasCodeSame() {
    int hash = Objects.hash(expectedName, expectedHeight,
        expectedWeight, expectedLeague);
    assertEquals(hash, testAthlete.hashCode());
  }

  @Test
  public void testToString() {
    String expectedString = "Athlete{" +
        "athletesName=" + expectedName +
        ", height=" + expectedHeight +
        ", weight=" + expectedWeight +
        ", league='" + expectedLeague + '\'' +
        '}';
    assertEquals(expectedString, testAthlete.toString());
  }
}