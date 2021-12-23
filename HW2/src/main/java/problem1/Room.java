package problem1;

import java.util.Objects;

/**
 * Room is a simple object that has maxOccupancy, price, numberGuests.
 */
public class Room {

  protected int maxOccupancy;
  protected int price;
  protected int numberGuests = 0;


  /**
   * Constructor that creates a new Room object with  maxOccupancy, price.
   *
   * @param maxOccupancy - int, maxOccupancy of the new Room object
   * @param price        - int, price of the new Room object
   */
  public Room(int maxOccupancy, int price) {
    this.maxOccupancy = maxOccupancy;
    this.price = price;
  }

  /**
   * A method that used to check if the room is empty or not.
   * @return the number of guests
   */
  public boolean isAvailable() {
    int numberOfGuests = 0;
    return this.numberGuests == numberOfGuests;
  }

  /**
   * a BoomRoom method that used to bookm a room if the room is available.
   * @param numberGuests, - int, taking this parameter passing this method
   * @throws IllegalArgumentException when if condition is not reached
   * throw exception
   */
  public void bookRoom(int numberGuests) throws IllegalArgumentException {

    if (this.isAvailable() && validatedGuests(numberGuests)) {
      this.numberGuests = numberGuests;
    } else {
      throw new IllegalArgumentException("Illegal number of guests");
    }
  }

  /**
   * Validate if the number of guests is qualified.
   * @param numberGuests, int, taking numberGuests as a parameter
   * @return the validatedGuests if the number of guests great 0 and less than or equal max
   * occupancy
   */
  private boolean validatedGuests(int numberGuests) {
    int emptyRoomGuests = 0;
    return numberGuests > emptyRoomGuests && numberGuests <= this.maxOccupancy;
  }

  /** Get max occupancy value of the room
   * @return int, representing max occupancy of room
   */
  public int getMaxOccupancy() {
    return this.maxOccupancy;
  }

  /**
   * Get the price of the room
   * @return int, representing price of room
   */
  public int getPrice() {
    return this.price;
  }

  /**
   * Get the number of guests of the room
   * @return int, representing number of guests
   */
  public int getNumberGuests() {
    return this.numberGuests;
  }

  /**
   * Set the number of guest of the room.
   * @param numberGuests, - int, taking numberGuests as a parameter
   */
  public void setNumberGuests(int numberGuests) {
    this.numberGuests = numberGuests;
  }


  /**
   * {@inheritDoc}
   * a method provided by java.lang.Object that indicates whether some other
   * object passed as an argument is "equal to" the current instance.
   *
   * @param o, - Object, taking object as a parameter
   * @return a boolean value after compare with those fields of Room object
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Room room = (Room) o;
    return getMaxOccupancy() == room.getMaxOccupancy() && getPrice() == room.getPrice()
        && getNumberGuests() == room.getNumberGuests();
  }

  /**
   * Return a hash code value of Room object
   * @return a hash code value of Room object
   */
  @Override
  public int hashCode() {
    return Objects.hash(getMaxOccupancy(), getPrice(), getNumberGuests());
  }


  /**
   * Returns the value given to it in string format.
   * @return returns the value given to it in string format.
   */
  @Override
  public String toString() {
    return "Room{" +
        "maxOccupancy=" + maxOccupancy +
        ", price=" + price +
        ", numberGuests=" + numberGuests +
        '}';
  }
}
