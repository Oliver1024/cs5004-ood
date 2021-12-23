package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BaseballPlayerTest {

  private BaseballPlayer testPlayer;
  private BaseballPlayer testPlayer2;
  private Name name;
  private Double height;
  private Double weight;
  private String league;
  private String team;
  private Double averageBatting;
  private Integer homeRuns;
  private Name name2;
  private Double height2;
  private Double weight2;
  private String league2;
  private String team2;
  private Double averageBatting2;
  private Integer homeRuns2;


  @Before
  public void setUp() throws Exception {
    name = new Name("Kyle", "Duk", "Hook");
    weight = 180.0;
    height = 6.0;
    team = "Mariners";
    averageBatting = 5129.0;
    homeRuns = 1307;
    league = "Hawk";

    name2 = new Name("Egle", "Mike", "Wale");
    weight2 = 182.0;
    height2 = 7.0;
    team2 = "Sky";
    averageBatting2 = 5120.0;
    homeRuns2 = 1301;
    league2 = "Sun";

    testPlayer = new BaseballPlayer(name, height, weight, team, averageBatting, homeRuns);
    testPlayer2 = new BaseballPlayer(name, height, weight, league, team, averageBatting, homeRuns);
  }

  @Test
  public void getTeam() {
    assertEquals(team, testPlayer.getTeam());
    assertEquals(team, testPlayer2.getTeam());
  }

  @Test
  public void getAverageBatting() {
    assertEquals(averageBatting, testPlayer.getAverageBatting());
    assertEquals(averageBatting, testPlayer2.getAverageBatting());
  }

  @Test
  public void getHomeRuns() {
    assertEquals(homeRuns, testPlayer.getHomeRuns());
    assertEquals(homeRuns, testPlayer2.getHomeRuns());
  }

  @Test
  public void equalsReflexivity() {
    assertTrue(testPlayer.equals(testPlayer));
    assertTrue(testPlayer2.equals(testPlayer2));
  }

  @Test
  public void equalsReflexivity2() {
    testPlayer2 = new BaseballPlayer(name2, height2, weight2, team2, averageBatting2, homeRuns2);
    assertFalse(testPlayer.equals(testPlayer2));
    assertFalse(testPlayer.equals(null));
    assertFalse(testPlayer2.equals(null));
  }

  @Test
  public void equalsDifferentDataTypes() {
    assertFalse(testPlayer.equals(name));
  }

  @Test
  public void equalsSameFields() {
    testPlayer2 = new BaseballPlayer(name, height, weight, team, averageBatting, homeRuns);
    assertTrue(testPlayer.equals(testPlayer2));
  }

  @Test
  public void equalsNotSameName() {
    testPlayer2 = new BaseballPlayer(name2, height, weight, team, averageBatting, homeRuns);
    assertFalse(testPlayer.equals(testPlayer2));
  }

  @Test
  public void equalsNotSameHeight() {
    testPlayer2 = new BaseballPlayer(name2, 22.0, weight, team, averageBatting, homeRuns);
    assertFalse(testPlayer.equals(testPlayer2));
  }

  @Test
  public void equalsNotSameWeight() {
    testPlayer2 = new BaseballPlayer(name2, 102.0, weight, team, averageBatting, homeRuns);
    assertFalse(testPlayer.equals(testPlayer2));
  }

  @Test
  public void equalsNotSameTeam() {
    testPlayer2 = new BaseballPlayer(name, height, weight, "Lakers", averageBatting, homeRuns);
    assertFalse(testPlayer.equals(testPlayer2));
  }

  @Test
  public void equalsNotSameAverageBatting() {
    testPlayer2 = new BaseballPlayer(name, height, weight, team, 5120.5, homeRuns);
    assertFalse(testPlayer.equals(testPlayer2));
  }

  @Test
  public void equalsNotSameHomeRuns() {
    testPlayer2 = new BaseballPlayer(name, height, weight, team, averageBatting, 1269);
    assertFalse(testPlayer.equals(testPlayer2));
  }

  @Test
  public void testHashCodeConsistency() {
    int hash = testPlayer.hashCode();
    assertEquals(hash, testPlayer.hashCode());
  }

  @Test
  public void testHashCodeNull() {
    assertFalse(0 == testPlayer.hashCode());
  }

  @Test
  public void testHashCodeEquality() {
    testPlayer2 = new BaseballPlayer(name, height, weight, league, team, averageBatting, homeRuns);
    assertTrue(testPlayer.equals(testPlayer2) ==
        (testPlayer.hashCode() == testPlayer2.hashCode()));
  }

  @Test
  public void testToString() {
    String expectedString = "BaseballPlayer{" +
        "team='" + team + '\'' +
        ", averageBatting=" + averageBatting +
        ", homeRuns=" + homeRuns +
        '}';
    assertEquals(expectedString, testPlayer.toString());
  }

}