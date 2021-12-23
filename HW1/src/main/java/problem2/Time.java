package problem2;

/**
 * Time is a very simple object that has hours, minutes and seconds.
 */
public class Time {

  private Integer hours;
  private Integer minutes;
  private Integer seconds;

  /**
   * Constructor that creates a new Time object with hours, minutes and seconds.
   *
   * @param hours   - hours of new Time object
   * @param minutes - minutes of new Time object
   * @param seconds - seconds of new Time object
   */
  public Time(Integer hours, Integer minutes, Integer seconds) {
    if (this.validateHoursNumber(hours)) {
      this.hours = hours;
    }
    if (this.validateMinutesNumber(minutes)) {
      this.minutes = minutes;
    }
    if (this.validateSecondsNumber(seconds)) {
      this.seconds = seconds;
    }
  }

  /**
   * A helper function that use to validate hours number
   *
   * @param hours - hours is passwd into this function as a parameter
   * @return the boolean value
   */
  private Boolean validateHoursNumber(Integer hours) {
    Integer maxHourValue = 23;
    if (hours >= 0 && hours <= maxHourValue) {
      return true;
    }
    return false;
  }

  /**
   * A helper function that use to validate minutes number
   *
   * @param minutes Taking minutes as a parameter
   * @return the boolean value
   */
  private boolean validateMinutesNumber(Integer minutes) {
    Integer maxMinutesValue = 59;
    if (minutes >= 0 && minutes <= maxMinutesValue) {
      return true;
    }
    return false;
  }

  /**
   * A helper function that use to validate seconds number
   *
   * @param seconds Taking seconds as a parameter
   * @return the boolean value
   */
  private boolean validateSecondsNumber(Integer seconds) {
    Integer maxSecondsValue = 59;
    if (seconds >= 0 && seconds <= maxSecondsValue) {
      return true;
    }
    return false;
  }

  /**
   * Returns the hours of Time
   *
   * @return the hours of Time
   */
  public Integer getHours() {
    return this.hours;
  }

  /**
   * Returns the minutes of Time
   *
   * @return the minutes of Time
   */
  public Integer getMinutes() {
    return this.minutes;
  }

  /**
   * Returns the seconds of Time
   *
   * @return the hours of Time
   */
  public Integer getSeconds() {
    return this.seconds;
  }
}


