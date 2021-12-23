package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RunnerTest {

  private Runner testRunner;
  private Runner testRunner2;
  private Name name;
  private Double height;
  private Double weight;
  private Name name2;
  private Double height2;
  private Double weight2;
  private String league;
  private String league2;
  private Double best5kTime;
  private Double bestHalfMarathonTime;
  private String favouriteRunningEvent;
  private Double best5kTime2;
  private Double bestHalfMarathonTime2;
  private String favouriteRunningEvent2;


  @Before
  public void setUp() throws Exception {
    name = new Name("Kyle", "Duk", "Hook");
    height = 6.0;
    weight = 180.0;
    league = "Peak";

    name2 = new Name("Egle", "Mike", "Wale");
    height2 = 7.0;
    weight2 = 182.0;
    league2 = "Moon";

    best5kTime = 33.0;
    bestHalfMarathonTime = 105.6;
    favouriteRunningEvent = "Field";

    best5kTime2 = 31.0;
    bestHalfMarathonTime2 = 101.6;
    favouriteRunningEvent2 = "Climb";

    testRunner = new Runner(name, height, weight, league, best5kTime,
        bestHalfMarathonTime, favouriteRunningEvent);
    testRunner2 = new Runner(name, height, weight, best5kTime,
        bestHalfMarathonTime, favouriteRunningEvent);

  }

  @Test
  public void getBest5kTime() {
    assertEquals(best5kTime, testRunner.getBest5kTime());
  }

  @Test
  public void getBestHalfMarathonTime() {
    assertEquals(bestHalfMarathonTime, testRunner.getBestHalfMarathonTime());
  }

  @Test
  public void getFavouriteRunningEvent() {
    assertEquals(favouriteRunningEvent, testRunner.getFavouriteRunningEvent());
  }

  @Test
  public void equalsReflexivity() {
    assertTrue(testRunner.equals(testRunner));
    assertTrue(testRunner2.equals(testRunner2));
  }

  @Test
  public void equalsReflexivity2() {
    testRunner2 = new Runner(name2, height2, weight2, league2, best5kTime2,
        bestHalfMarathonTime2, favouriteRunningEvent2);
    assertFalse(testRunner.equals(testRunner2));
    assertFalse(testRunner.equals(null));
    assertFalse(testRunner2.equals(null));
  }

  @Test
  public void equalsDifferentDataTypes() {
    assertFalse(testRunner.equals(name));
  }

  @Test
  public void equalsSameFields() {
    testRunner2 = new Runner(name, height, weight, league, best5kTime,
        bestHalfMarathonTime, favouriteRunningEvent);
    assertTrue(testRunner.equals(testRunner2));
  }

  @Test
  public void equalsNotSameBest5kTime() {
    testRunner2 = new Runner(name, height, weight, league, 11.5,
        bestHalfMarathonTime, favouriteRunningEvent);
    assertFalse(testRunner.equals(testRunner2));
  }

  @Test
  public void equalsNotSameBestHalfMarathonTime() {
    testRunner2 = new Runner(name, height, weight, league, best5kTime,
        22.1, favouriteRunningEvent);
    assertFalse(testRunner.equals(testRunner2));
  }

  @Test
  public void equalsNotSameFavouriteRunningEvent() {
    testRunner2 = new Runner(name, height, weight, league, best5kTime,
        bestHalfMarathonTime, "SpeedRunning");
    assertFalse(testRunner.equals(testRunner2));
  }

  @Test
  public void testHashCodeConsistency() {
    int hash = testRunner.hashCode();
    assertEquals(hash, testRunner.hashCode());
  }

  @Test
  public void testHashCodeNull() {
    assertFalse(0 == testRunner.hashCode());
  }

  @Test
  public void testHashCodeEquality() {
    testRunner2 = new Runner(name, height, weight, league, best5kTime,
        bestHalfMarathonTime, favouriteRunningEvent);
    assertTrue(testRunner.equals(testRunner2) ==
        (testRunner.hashCode() == testRunner2.hashCode()));
  }

  @Test
  public void testToString() {
    String expectedString = "Runner{" +
        "best5kTime=" + best5kTime +
        ", bestHalfMarathonTime=" + bestHalfMarathonTime +
        ", favouriteRunningEvent='" + favouriteRunningEvent + '\'' +
        '}';
    assertEquals(expectedString, testRunner.toString());
  }
}