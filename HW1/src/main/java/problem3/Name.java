package problem3;

/**
 * Name is a simple object that has firstName and lastName
 */
public class Name {
  private String firstName;
  private String lastName;

  /**
   * Constructor that creates a new name object with specified fistName and lastName.
   * @param firstName - firstName of the new Name object
   * @param lastName - lastName of the new Name object
   */
  public Name(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  /**
   * Returns the firstName of the Name
   * @return the firstName of the Name
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * Returns the lastName of the Name
   * @return the lastName of the Name
   */
  public String getLastName() {
    return this.lastName;
  }
}
