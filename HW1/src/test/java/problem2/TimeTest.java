package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TimeTest {
  private Time testTime;
  private Time testTime2;
  private Time testTime3;
  private Integer expectedHours;
  private Integer expectedMinutes;
  private Integer expectedSeconds;
  private Integer expectedHours2;
  private Integer expectedMinutes2;
  private Integer expectedSeconds2;
  private Integer expectedHours3;
  private Integer expectedMinutes3;
  private Integer expectedSeconds3;

  @Before
  public void setUp() throws Exception {
    expectedHours = 10;
    expectedMinutes = 22;
    expectedSeconds = 32;
    testTime = new Time(expectedHours, expectedMinutes, expectedSeconds);

    expectedHours2 = 25;
    expectedMinutes2 = 66;
    expectedSeconds2 = 68;
    testTime2 = new Time(expectedHours2, expectedMinutes2, expectedSeconds2);

    expectedHours3 = -1;
    expectedMinutes3 = -5;
    expectedSeconds3 = -10;
    testTime3 = new Time(expectedHours3, expectedMinutes3, expectedSeconds3);

  }

  @Test
  public void getHours() {
    assertEquals(expectedHours, testTime.getHours());
    assertEquals(null, testTime2.getHours());
    assertEquals(null, testTime3.getHours());
  }

  @Test
  public void getMinutes() {
    assertEquals(expectedMinutes, testTime.getMinutes());
    assertEquals(null, testTime2.getMinutes());
    assertEquals(null, testTime3.getMinutes());
  }

  @Test
  public void getSeconds() {
    assertEquals(expectedSeconds, testTime.getSeconds());
    assertEquals(null, testTime2.getSeconds());
    assertEquals(null, testTime3.getSeconds());
  }

}