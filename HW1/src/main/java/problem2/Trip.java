package problem2;

/**
 * Trip is a simple object that has employee, startLocation, endLocation, startTime and endTime.
 */
public class Trip {

  private Employee employee;
  private String startLocation;
  private String endLocation;
  private Time startTime;
  private Time endTime;

  /**
   * Constructor that creates a new Trip object with specified employee,startLocation, endLocation,
   * startTime and endTime.
   *
   * @param employee      - employee of the new Trip object
   * @param startLocation - startLocation of the new Trip object
   * @param endLocation   - endLocation of the new Trip object
   * @param startTime     - startTime of the new Trip object
   * @param endTime       - endTime of the new Trip object
   */
  public Trip(Employee employee, String startLocation, String endLocation, Time startTime,
      Time endTime) {
    this.employee = employee;
    this.startLocation = startLocation;
    this.endLocation = endLocation;
    this.startTime = startTime;
    this.endTime = endTime;
  }

  /**
   * Returns the employee of the Trip.
   *
   * @return the employee of the Trip.
   */
  public Employee getEmployee() {
    return this.employee;
  }

  /**
   * Returns startLocation of the Trip
   *
   * @return startLocation of the Trip
   */
  public String getStartLocation() {
    return this.startLocation;
  }

  /**
   * Returns endLocation of the Trip
   *
   * @return endLocation of the Trip
   */
  public String getEndLocation() {
    return this.endLocation;
  }

  /**
   * Returns startTime of the Trip
   *
   * @return startTime of the Trip
   */
  public Time getStartTime() {
    return this.startTime;
  }

  /**
   * Returns endTime of the Trip
   *
   * @return endTime of the Trip
   */
  public Time getEndTime() {
    return this.endTime;
  }

  /**
   * Returns totalSeconds of the time
   *
   * @param hours   hours of the time
   * @param minutes minutes of the time
   * @param seconds seconds of the time
   * @return the totalSeconds of the time
   */
  private Integer timeToSeconds(int hours, int minutes, int seconds) {

    return (hours * 3600) + (minutes * 60) + seconds;
  }

  /**
   * Returns a new time object with hours, minutes and seconds
   *
   * @param durationSeconds Taking durationSeconds as a parameter
   * @return the durationSeconds of commute
   */
  private Time durationSecondsConvert(Integer durationSeconds) {
    int hours = durationSeconds / 3600;
    int minutes = (durationSeconds % 3600) / 60;
    int seconds = durationSeconds % 60;
    Time timeCommute;
    return timeCommute = new Time(hours, minutes, seconds);
  }

  /**
   * Returns a new object of time with
   *
   * @return total time of the trip
   */
  public Time getDuration() {
    int startSeconds = timeToSeconds(this.startTime.getHours(), this.startTime.getMinutes(),
        this.startTime.getSeconds());
    int endSeconds = timeToSeconds(this.endTime.getHours(), this.endTime.getMinutes(),
        this.endTime.getSeconds());
    int durationSeconds = endSeconds - startSeconds;

    return durationSecondsConvert(durationSeconds);

  }

}
