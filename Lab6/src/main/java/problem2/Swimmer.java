package problem2;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**Class Swimmer contains information about a swimmer, and the list of their swimming times, when
swimming 50m. Four swimming styles are considered: butterfly, backstroke, breaststroke,
 and freestyle.
 */
public class Swimmer implements Comparable<Swimmer>{
  private String name;
  private List<Double> butterfly50mTimes;
  private List<Double> backstroke50mTimes;
  private List<Double> breaststroke50mTimes;
  private List<Double> freestyle50mTimes;

  /**
   *  A constructor that create a new object of Swimmer
   * @param name String
   * @param butterfly50mTimes - List<Double>
   * @param backstroke50mTimes - List<Double>
   * @param breaststroke50mTimes - List<Double>
   * @param freestyle50mTimes - List<Double>
   */
  public Swimmer(String name, List<Double> butterfly50mTimes, List<Double> backstroke50mTimes,
      List<Double> breaststroke50mTimes, List<Double> freestyle50mTimes) {
    this.name = name;
    this.butterfly50mTimes = butterfly50mTimes;
    this.backstroke50mTimes = backstroke50mTimes;
    this.breaststroke50mTimes = breaststroke50mTimes;
    this.freestyle50mTimes = freestyle50mTimes;
  }

  /**
   * Return name
   * @return String, name
   */
  public String getName() {
    return name;
  }

  /**
   * Return butterfly50mTimes
   * @return List<Double>
   */
  public List<Double> getButterfly50mTimes() {
    return butterfly50mTimes;
  }

  /**
   * Return backstroke50mTimes
   * @return List<Double>
   */
  public List<Double> getBackstroke50mTimes() {
    return backstroke50mTimes;
  }

  /**
   * Return breaststroke50mTimes
   * @return List<Double>
   */
  public List<Double> getBreaststroke50mTimes() {
    return breaststroke50mTimes;
  }

  /**
   * Return freestyle50mTimes
   * @return List<Double>
   */
  public List<Double> getFreestyle50mTimes() {
    return freestyle50mTimes;
  }

  /**
   * Return int
   * @param otherSwimmer Swimmer
   * @return int
   */
  @Override
  //Your code here
  public int compareTo(Swimmer otherSwimmer) {
    return Double.compare(this.computeAverageSwimTime(this.freestyle50mTimes),
        otherSwimmer.computeAverageSwimTime(otherSwimmer.getFreestyle50mTimes()));
  }

  /**
   * A helper method
   * @param swimTimes List<Double>
   * @return Double value
   */
  private Double computeAverageSwimTime(List<Double> swimTimes){
    Double averageTime = 0d;
    for(Double swimTime: swimTimes){
      averageTime += swimTime;
    }
    return averageTime/swimTimes.size();
  }

  /**
   * A method return fastest swim time
   * @param swimTimes List<Double>
   * @return Double value
   */
  protected Double getFastestSwimTime(List<Double> swimTimes){
    Collections.sort(swimTimes);
    return swimTimes.get(swimTimes.size() - 1);
  }

  /**
   * Compare object s1 and s2
   */
  Comparator<Swimmer> fastestButterflyTime = new Comparator<Swimmer>(){
    @Override
    public int compare(Swimmer s1, Swimmer s2){
      return Double.compare(s1.getFastestSwimTime(s1.butterfly50mTimes),
          s2.getFastestSwimTime(s2.butterfly50mTimes));
    }
  };
}
