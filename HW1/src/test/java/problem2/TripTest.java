package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TripTest {
  private Trip testTrip;
  private Employee expectedEmployee;
  private String expectedStartLocation;
  private String expectedEndLocation;
  private Time expectedStartTime;
  private Time expectedEndTime;
  private Integer expectedTotalSeconds;
  private Integer durationSeconds;
  private Integer expectConvertHours;
  private Integer expectConvertMinutes;
  private Integer expectConvertSeconds;
  private Integer secondsToHours = 3600;
  private Integer minutesToSeconds = 60;

  @Before
  public void setUp() throws Exception {
    expectedEmployee = new Employee("Joe", "Lucky");
    expectedStartLocation = "105 Ave";
    expectedEndLocation = "115 Road";
    expectedStartTime = new Time(10,22,32);
    expectedEndTime = new Time(11,29,55);
    expectedTotalSeconds = 10 * secondsToHours + 22 * minutesToSeconds + 32;
    durationSeconds = 6606;
    expectConvertHours = 1;
    expectConvertMinutes= 50;
    expectConvertSeconds = 6;

    testTrip = new Trip(new Employee("Joe", "Lucky"), expectedStartLocation, expectedEndLocation,
        new Time(10,22,32), new Time(11,29,55));
  }

  @Test
  public void getEmployee() {
    assertEquals(expectedEmployee.getFirstName(), testTrip.getEmployee().getFirstName());
    assertEquals(expectedEmployee.getLastName(),testTrip.getEmployee().getLastName());
  }

  @Test
  public void getStartLocation() {
    assertEquals(expectedStartLocation, testTrip.getStartLocation());

  }

  @Test
  public void getEndLocation() {
    assertEquals(expectedEndLocation, testTrip.getEndLocation());
  }

  @Test
  public void getStartTime() {
    assertEquals(expectedStartTime.getHours(), testTrip.getStartTime().getHours());
    assertEquals(expectedStartTime.getMinutes(), testTrip.getStartTime().getMinutes());
    assertEquals(expectedStartTime.getSeconds(), testTrip.getStartTime().getSeconds());
  }

  @Test
  public void getEndTime() {
    assertEquals(expectedEndTime.getHours(), testTrip.getEndTime().getHours());
    assertEquals(expectedEndTime.getMinutes(), testTrip.getEndTime().getMinutes());
    assertEquals(expectedEndTime.getSeconds(), testTrip.getEndTime().getSeconds());
  }

  @Test
  public void getDuration() {

    Time expectedDuration = testTrip.getDuration();
    Integer expectHour = 1;
    Integer expectMinute = 7;
    Integer expectSecond = 23;

    assertEquals(expectHour, testTrip.getDuration().getHours());
    assertEquals(expectMinute, testTrip.getDuration().getMinutes());
    assertEquals(expectSecond, testTrip.getDuration().getSeconds());

  }
}