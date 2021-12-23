package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DoubleRoomTest {
  private DoubleRoom testDoubleRoom;

  @Before
  public void setUp() throws Exception {
    testDoubleRoom = new DoubleRoom(201);
  }

  @Test
  public void testDoubleRoom() {
    assertEquals(201,testDoubleRoom.getPrice());
  }
}