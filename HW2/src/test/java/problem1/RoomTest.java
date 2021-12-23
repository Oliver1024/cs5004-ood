package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RoomTest {
  private Room testRoom;
  private Room testRoom4;
  private int maxOccupancy;
  private int price;
  private int numberGuests;
  private Room testRoom2;
  private int maxOccupancy2;
  private int price2;
  private int numberGuests2;
  private int numberEmptyGuest;


  @Before
  public void setUp() throws Exception {
    maxOccupancy = 4;
    price = 197;
    numberGuests = 0;
    testRoom = new Room(maxOccupancy, price);

    maxOccupancy2 = 3;
    price2 = 198;
    numberGuests2 = 0;
    testRoom2 = new Room(maxOccupancy2, price2);
  }

  @Test
  public void getMaxOccupancy() {
    assertEquals(maxOccupancy, testRoom.getMaxOccupancy());
  }

  @Test
  public void getPrice() {
    assertEquals(price, testRoom.getPrice());
  }

  @Test
  public void getNumberGuests() {
    assertEquals(numberGuests, testRoom.getNumberGuests());
  }

  @Test
  public void isAvailable() {
    assertTrue(testRoom.isAvailable());
  }

  @Test
  public void bookRoom() {
    int numberOfGuest = 2;
    int invalidNumberOfGuest = 5;
    numberEmptyGuest = 0;
    testRoom.bookRoom(numberOfGuest);
    testRoom.setNumberGuests(2);
    assertFalse(testRoom.isAvailable());

    assertTrue(testRoom.getNumberGuests() == numberOfGuest);
    assertFalse(testRoom.getNumberGuests() == invalidNumberOfGuest);
    assertFalse(testRoom.getNumberGuests() == numberEmptyGuest);


  }

  @Test(expected = IllegalArgumentException.class)
  public void invalidEmptyOfGuests() throws IllegalArgumentException {
    int numberOfGuest = 0;
    testRoom.bookRoom(0);
  }

  @Test(expected = IllegalArgumentException.class)
  public void invalidNumberAndNotEmptyOfGuests() throws IllegalArgumentException {
    int numberOfGuest = 0;
    testRoom.setNumberGuests(4);
    testRoom.bookRoom(2);
  }


  @Test(expected = IllegalArgumentException.class)
  public void invalidNumberOfGuests() throws IllegalArgumentException {
    int numberOfGuest = 2;
    testRoom.bookRoom(6);
  }


  @Test
  public void equalsReflexivity() {
    assertTrue(testRoom.equals(testRoom));
  }

  @Test
  public void equalsReflexivity2() {
    assertFalse(testRoom.equals(testRoom2));
    assertNotEquals(testRoom, null);

  }

  @Test
  public void equalsDifferentDataTypes(){
    assertFalse(testRoom.equals(maxOccupancy));
    assertFalse(testRoom.equals(price));
  }

  @Test
  public void equalsSameFields(){
   testRoom2 = new Room(maxOccupancy, price);
    assertTrue(testRoom.equals(testRoom2));
  }

  @Test
  public void equalNotSamePrice() {
    int price4 = 201;
    testRoom4 = new Room(maxOccupancy, price4 );
    assertFalse(testRoom.equals(testRoom4));
  }

  @Test
  public void equalNotSameMaxOccupancy() {
    int maxOccupancy = 1;
    testRoom2 = new Room(maxOccupancy, price);
    assertFalse(testRoom.equals(testRoom2));
  }

  @Test
  public void equalSetNumberOfGuests(){
    Room testRoom5 = new Room(maxOccupancy, price);
    testRoom.setNumberGuests(3);
    assertFalse(testRoom.equals(testRoom5));
  }

  @Test
  public void testHashCodeNull() {
    assertFalse(0 == testRoom.hashCode());
  }

  @Test
  public void testHashCodeEquality() {
    testRoom2 = new Room(maxOccupancy, price);
    assertTrue(testRoom.equals(testRoom2) == (testRoom.hashCode()
        == testRoom2.hashCode()));
  }

  @Test
  public void testHashCodeConsistency() {
    int hash = testRoom.hashCode();
    assertEquals(hash, testRoom.hashCode());
  }

  @Test
  public void testToString() {
    String expectedString = "Room{" +
        "maxOccupancy=" + maxOccupancy +
        ", price=" + price +
        ", numberGuests=" + numberGuests +
        '}';
    assertEquals(expectedString, testRoom.toString());
  }
}