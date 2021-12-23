package problem1;

import java.util.Objects;

/**
 * Class BaseBallPlayer stores information about a baseball player. This class inherits from
 * Athlete.
 */
public class BaseballPlayer extends Athlete {

  private String team;
  private Double averageBatting;
  private Integer homeRuns;

  /**
   * Constructor for a BaseballPlayer.
   *
   * @param athletesName   - Name, representing baseball player's name
   * @param height         - Double, representing height
   * @param weight         - Double, representing weight
   * @param league         - String, representing league
   * @param team           - String, representing team
   * @param averageBatting - String, representing average batting
   * @param homeRuns       - Integer, representing the number of home runs
   */
  public BaseballPlayer(Name athletesName, Double height, Double weight, String league,
      String team, Double averageBatting, Integer homeRuns) {
    super(athletesName, height, weight, league);
    this.team = team;
    this.averageBatting = averageBatting;
    this.homeRuns = homeRuns;
  }

  /**
   * Constructor for a BaseballPlayer.
   *
   * @param athletesName   - Name, representing baseball player's name
   * @param height         - Double, representing height
   * @param weight         - Double, representing weight
   * @param team           - String, representing team
   * @param averageBatting - String, representing average batting
   * @param homeRuns       - Integer, representing the number of home runs
   */
  public BaseballPlayer(Name athletesName, Double height, Double weight, String team,
      Double averageBatting, Integer homeRuns) {
    super(athletesName, height, weight);
    this.team = team;
    this.averageBatting = averageBatting;
    this.homeRuns = homeRuns;
  }

  /**
   * @return String, representing the team name
   */
  public String getTeam() {
    return team;
  }

  /**
   * @return Double, representing the average batting
   */
  public Double getAverageBatting() {
    return averageBatting;
  }

  /**
   * @return Integer, representing the number of home runs
   */
  public Integer getHomeRuns() {
    return homeRuns;
  }

  /**
   * {@inheritDoc}
   *
   * @param o - Taking object as a parameter
   * @return a boolean value after compare with those fields of Athlete object
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    BaseballPlayer that = (BaseballPlayer) o;
    return Objects.equals(getTeam(), that.getTeam()) && Objects
        .equals(getAverageBatting(), that.getAverageBatting()) && Objects
        .equals(getHomeRuns(), that.getHomeRuns());
  }

  /**
   * {@inheritDoc}
   *
   * @return a hash value after of those fields of BaseBallPlayer object
   */
  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), team, averageBatting, homeRuns);
  }

  /**
   * {@inheritDoc}
   *
   * @return Strings of those fields of BaseBallPlayer object
   */
  @Override
  public String toString() {
    return "BaseballPlayer{" +
        "team='" + team + '\'' +
        ", averageBatting=" + averageBatting +
        ", homeRuns=" + homeRuns +
        '}';
  }
}

