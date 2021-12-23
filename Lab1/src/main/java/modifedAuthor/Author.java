package modifedAuthor;

/**
 * A author class that includes four fields
 */
public class Author {

  private Name name;
  private EmailAddress emailAddress;
  private Address address;

  /**
   * Constructor that creates a new Author object with specified fields
   *
   * @param name
   * @param emailAddress
   * @param address
   */
  public Author(Name name, EmailAddress emailAddress, Address address) {
    this.name = name;
    this.emailAddress = emailAddress;
    this.address = address;
  }

  /**
   * @return name of author
   */
  public Name getName() {
    return name;
  }

  /**
   * @return emailAddress of author
   */
  public EmailAddress getEmailAddress() {
    return emailAddress;
  }

  /**
   * @return address of author
   */
  public Address getAddress() {
    return address;
  }
}
