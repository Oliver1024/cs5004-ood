package problem1;

/**
 * Owner is a simple object that has a unique Owner firstName, lastName and phoneNumber.
 */
public class Owner {

  private String firstName;
  private String lastName;
  private String phoneNumber;

  /**
   * Constructor that creates a new Owner object with the specified firstName, lastName and
   * phoneNumber.
   *
   * @param firstName   - firstName of Owner
   * @param lastName    - lastName of Owner
   * @param phoneNumber - phoneNUMBER of Owner
   */
  public Owner(String firstName, String lastName, String phoneNumber) {
    this.firstName = firstName;
    this.lastName = lastName;
    if (validatePhoneNumber(phoneNumber)) {
      this.phoneNumber = phoneNumber;
    }
  }

  /**
   * A helper function that return the validated phoneNumber
   *
   * @param phoneNumber - phoneNumber of Owner
   * @return validated phoneNumber
   */
  private boolean validatePhoneNumber(String phoneNumber) {
    Integer maxLength = 10;
    if (phoneNumber.length() == maxLength) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Get firstName of Owner
   *
   * @return firstName
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Get lastName of Owner
   *
   * @return lastName
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Get phoneNumber of Owner
   *
   * @return phoneNumber
   */
  public String getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * Set the firstName of Owner
   *
   * @param firstName - firstName of Owner
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Set the lastName of Owner
   *
   * @param lastName - lastName of Owner
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Set the phoneNumber of Owner
   *
   * @param phoneNumber - phoneNumber of Owner
   */
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

}
