package problem1;

import java.util.Objects;

/**
 * Class Runner stores information about a Runner. This class inherits from Athlete.
 */
public class Runner extends Athlete {

  private Double best5kTime;
  private Double bestHalfMarathonTime;
  private String favouriteRunningEvent;

  /**
   * Constructor for Runner.
   *
   * @param athletesName          - Name, representing a runner's name
   * @param height                - Double, representing height
   * @param weight                - Double, representing weight
   * @param league                - String, representing league
   * @param best5kTime            - Double, representing best time of 5k running
   * @param bestHalfMarathonTime  - Double, representing best time of half marathon time
   * @param favouriteRunningEvent - String, representing best running event
   */
  public Runner(Name athletesName, Double height, Double weight, String league,
      Double best5kTime, Double bestHalfMarathonTime, String favouriteRunningEvent) {
    super(athletesName, height, weight, league);
    this.best5kTime = best5kTime;
    this.bestHalfMarathonTime = bestHalfMarathonTime;
    this.favouriteRunningEvent = favouriteRunningEvent;
  }

  /**
   * Constructor for Runner.
   *
   * @param athletesName          - Name, representing a runner's name
   * @param height                - Double, representing height
   * @param weight                - Double, representing weight
   * @param best5kTime            - Double, representing best time of 5k running
   * @param bestHalfMarathonTime  - Double, representing best time of half marathon time
   * @param favouriteRunningEvent - String, representing best running event
   */
  public Runner(Name athletesName, Double height, Double weight, Double best5kTime,
      Double bestHalfMarathonTime, String favouriteRunningEvent) {
    super(athletesName, height, weight);
    this.best5kTime = best5kTime;
    this.bestHalfMarathonTime = bestHalfMarathonTime;
    this.favouriteRunningEvent = favouriteRunningEvent;
  }

  /**
   * @return Double, representing best time of 5k running
   */
  public Double getBest5kTime() {
    return best5kTime;
  }

  /**
   * @return Double, representing best time of half marathon time
   */
  public Double getBestHalfMarathonTime() {
    return bestHalfMarathonTime;
  }

  /**
   * @return String, representing best running event
   */
  public String getFavouriteRunningEvent() {
    return favouriteRunningEvent;
  }

  /**
   * {@inheritDoc}
   *
   * @param o - Taking object as a parameter
   * @return a boolean value after compare with those fields of Runner object
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
    Runner runner = (Runner) o;
    return Objects.equals(getBest5kTime(), runner.getBest5kTime()) && Objects
        .equals(getBestHalfMarathonTime(), runner.getBestHalfMarathonTime()) && Objects
        .equals(getFavouriteRunningEvent(), runner.getFavouriteRunningEvent());
  }

  /**
   * {@inheritDoc}
   *
   * @return a hash value after of those fields of Runner object
   */
  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), best5kTime, bestHalfMarathonTime, favouriteRunningEvent);
  }

  /**
   * {@inheritDoc}
   *
   * @return Strings of those fields of Runner object
   */
  @Override
  public String toString() {
    return "Runner{" +
        "best5kTime=" + best5kTime +
        ", bestHalfMarathonTime=" + bestHalfMarathonTime +
        ", favouriteRunningEvent='" + favouriteRunningEvent + '\'' +
        '}';
  }
}
