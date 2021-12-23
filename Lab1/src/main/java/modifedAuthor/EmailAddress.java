package modifedAuthor;

import java.util.Objects;


/**
 * A class that has 4 fields.
 */
public class EmailAddress {

  private String username;
  private String connection;
  private String domain;

  /**
   * Constructor that creates a new EmailAddress object
   *
   * @param username
   * @param connection
   * @param domain
   */
  public EmailAddress(String username, String connection, String domain) {
    this.username = username;
    this.connection = connection;
    this.domain = domain;
  }

  /**
   * Override equals() function
   *
   * @param o
   * @return
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailAddress that = (EmailAddress) o;
    return Objects.equals(getUsername(), that.getUsername()) && Objects
        .equals(getConnection(), that.getConnection()) && Objects
        .equals(getDomain(), that.getDomain());
  }

  /**
   * Reuturn the username of emailAddress
   *
   * @return the username of emailAddress
   */
  public String getUsername() {
    return username;
  }

  /**
   * Return connection of emailAddress
   *
   * @return connection of emailAddress
   */
  public String getConnection() {
    return connection;
  }

  /**
   * Return domain of emailAddress
   *
   * @return domain of emailAddress
   */
  public String getDomain() {
    return domain;
  }
}
