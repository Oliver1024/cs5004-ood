package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SingleRoomTest {
  private SingleRoom testSingleRoom;

  @Before
  public void setUp() throws Exception {
    testSingleRoom = new SingleRoom(105);
  }

  @Test
  public void testSingleRoom() {
    assertEquals(105, testSingleRoom.getPrice());
  }
}