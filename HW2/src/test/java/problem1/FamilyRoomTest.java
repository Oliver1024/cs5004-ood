package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FamilyRoomTest {
  private FamilyRoom testFamilyRoom;

  @Before
  public void setUp() throws Exception {
    testFamilyRoom = new FamilyRoom(299);
  }

  @Test
  public void testFamilyRoom() {
    assertEquals(299,testFamilyRoom.getPrice());
  }
}