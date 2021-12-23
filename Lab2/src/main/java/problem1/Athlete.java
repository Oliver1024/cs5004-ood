package problem1;

import java.util.Objects;

/**
 * Athlete is a simple object that has athletesName,height,weight,league.
 */
public class Athlete {

  protected Name athletesName;
  protected Double height;
  protected Double weight;
  protected String league;

  /**
   * Constructors that creates a new Athlete object with athletesName,height,weight,league.
   *
   * @param athletesName - String, athletesName of the new Athlete object.
   * @param height       - Double, height of the new Athlete object.
   * @param weight       - Double, weight of the new Athlete object.
   * @param league       - String, league of the new Athlete object.
   */
  public Athlete(Name athletesName, Double height, Double weight, String league) {
    this.athletesName = athletesName;
    this.height = height;
    this.weight = weight;
    this.league = league;
  }

  /**
   * Constructors that creates a new Athlete object with athletesName,height,weight.
   *
   * @param athletesName - String, athletesName of the new Athlete object.
   * @param height       - Double, height of the new Athlete object.
   * @param weight       - Double, weight of the new Athlete object.
   */
  public Athlete(Name athletesName, Double height, Double weight) {
    this.athletesName = athletesName;
    this.height = height;
    this.weight = weight;
    this.league = null;
  }

  /**
   * Returns the athletesName.
   *
   * @return the athletesName
   */
  public Name getAthletesName() {
    return athletesName;
  }

  /**
   * Returns height
   *
   * @return height
   */
  public Double getHeight() {
    return height;
  }

  /**
   * Returns weight
   *
   * @return weight
   */
  public Double getWeight() {
    return weight;
  }

  /**
   * Returns league
   *
   * @return league
   */
  public String getLeague() {
    return league;
  }

  /**
   * Returns a boolean value after compare with those fields of Athlete object
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
    Athlete athlete = (Athlete) o;
    return Objects.equals(getAthletesName(), athlete.getAthletesName()) && Objects
        .equals(getHeight(), athlete.getHeight()) && Objects
        .equals(getWeight(), athlete.getWeight()) && Objects
        .equals(getLeague(), athlete.getLeague());
  }


  /**
   * Returns a hash value after of those fields of Athlete object.
   *
   * @return a hash value after of those fields of Athlete object.
   */
  @Override
  public int hashCode() {
    return Objects.hash(getAthletesName(), getHeight(), getWeight(), getLeague());
  }

  /**
   * Returns strings of those fields of Athlete object.
   *
   * @return strings of those fields of Athlete object.
   */
  @Override
  public String toString() {
    return "Athlete{" +
        "athletesName=" + athletesName +
        ", height=" + height +
        ", weight=" + weight +
        ", league='" + league + '\'' +
        '}';
  }
}
