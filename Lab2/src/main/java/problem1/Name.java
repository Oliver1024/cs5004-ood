package problem1;

import java.util.Objects;

/**
 * A class define a name object with firstName, middleName and lastName
 */
public class Name {

  private String firstName;
  private String middleName;
  private String lastName;

  /**
   * Constructor a new object with firstName, middleName and lastName
   *
   * @param firstName  - String, firstName;
   * @param middleName - String, middleName
   * @param lastName   - String, lastName
   */
  public Name(String firstName, String middleName, String lastName) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
  }

  /**
   * @return the firstName
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * @return the middleName
   */
  public String getMiddleName() {
    return middleName;
  }

  /**
   * @return the lastName
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * {@inheritDoc}
   *
   * @param o Object, taking this object as a parameter
   * @return boolean value after comparing with those two objects
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Name name = (Name) o;
    return Objects.equals(getFirstName(), name.getFirstName()) && Objects
        .equals(getMiddleName(), name.getMiddleName()) && Objects
        .equals(getLastName(), name.getLastName());
  }

  /**
   * {@inheritDoc}
   *
   * @return hasCode value
   */
  @Override
  public int hashCode() {
    return Objects.hash(getFirstName(), getMiddleName(), getLastName());
  }

  /**
   * {@inheritDoc}
   *
   * @return strings
   */
  @Override
  public String toString() {
    return "Name{" +
        "firstName='" + firstName + '\'' +
        ", middleName='" + middleName + '\'' +
        ", lastName='" + lastName + '\'' +
        '}';
  }
}
