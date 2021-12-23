package problem2;

/**
 * Recipient is a simple class that has firstName, lastName and emailAddress.
 */
public class Recipient {

  private String firstName;
  private String lastName;
  private String emailAddress;

  /**
   * Constructor for a recipient
   *
   * @param firstName    - String, representing firstname of a recipient
   * @param lastName     - String, representing lastname of a recipient
   * @param emailAddress - String, representing emailAddress of a recipient
   */
  public Recipient(String firstName, String lastName, String emailAddress) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.emailAddress = emailAddress;
  }

  /**
   * Return firstname of a recipient
   * @return String, firstname of a recipient
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Return lastname of a recipient
   * @return String, lastname of a recipient
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Return emailAddress of a recipient
   * @return String, return emailAddress of a recipient
   */
  public String getEmailAddress() {
    return emailAddress;
  }
}
