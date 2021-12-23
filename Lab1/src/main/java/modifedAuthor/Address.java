package modifedAuthor;

import java.util.Objects;

/**
 * Address is a simple class that contains four fields
 */
public class Address {

  private String street;
  private String city;
  private String state;
  private String zipCode;

  /**
   * Constructor that creates a new Address object with specified fields
   *
   * @param street
   * @param city
   * @param state
   * @param zipCode
   */
  public Address(String street, String city, String state, String zipCode) {
    this.street = street;
    this.city = city;
    this.state = state;
    this.zipCode = zipCode;
  }

  /**
   * Override equals() function
   *
   * @param o
   * @returna boolean
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(getStreet(), address.getStreet()) && Objects
        .equals(getCity(), address.getCity()) && Objects.equals(getState(), address.getState())
        && Objects.equals(getZipCode(), address.getZipCode());
  }

  /**
   * @return the street of address
   */
  public String getStreet() {
    return street;
  }

  /**
   * @return city of address
   */
  public String getCity() {
    return city;
  }

  /**
   * @return state of address
   */
  public String getState() {
    return state;
  }

  /**
   * @return return zipCode of address
   */
  public String getZipCode() {
    return zipCode;
  }
}
