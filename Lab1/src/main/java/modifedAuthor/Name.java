package modifedAuthor;

/**
 * This is a Name class that has 4 fields.
 */
public class Name {

  private String firstName;
  private String middleName;
  private String lastName;

  /**
   * Constructor that creates a new name object with specified firstName, middleName and lastName.
   *
   * @param firstName
   * @param middleName
   * @param lastName
   */
  public Name(String firstName, String middleName, String lastName) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
  }

  /**
   * A class that gets the firstname of a person
   *
   * @return a person's firstname
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * A class that gets the middle of a person
   *
   * @return a person's middle
   */
  public String getMiddleName() {
    return middleName;
  }

  /**
   * A class that gets the lastname of a person
   *
   * @return a person's lastname
   */
  public String getLastName() {
    return lastName;
  }
}

