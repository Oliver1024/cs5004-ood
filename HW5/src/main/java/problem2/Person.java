package problem2;

import java.util.Objects;
import java.util.Set;

/**
 * Represents an abstract class Person, extending its parent class Creator
 */
public abstract class Person extends Creator{
  private String firstName;
  private String lastName;

  /**
   * Constructs a Person, with firstName and lastName
   * @param firstName - String, first name of the person
   * @param lastName - String, last name of the person
   */
  public Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  /**
   * Return first name and last name
   * @return first name and last name
   */
  @Override
  public String getName() {
    return this.firstName + " " + this.lastName;
  }


  /**
   * Overrides getMembers(), returns null
   * @return null
   */
  @Override
  public Set<Person> getMembers() {
    return null;
  }


  /**
   * Indicates whether some other object passed as an argument is "equal to" the
   * current instance
   * @param o - an object to compare
   * @return boolean value
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return Objects.equals(firstName, person.firstName) && Objects
        .equals(lastName, person.lastName);
  }

  /**
   * Returns an integer representation of the object memory address
   * @return hash value
   */
  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName);
  }


  /**
   * Returns an String representation of the object
   * @return String, string
   */
  @Override
  public String toString() {
    return "Person{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        '}';
  }
}
