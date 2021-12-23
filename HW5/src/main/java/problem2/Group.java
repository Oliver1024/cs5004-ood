package problem2;

import java.util.Objects;
import java.util.Set;

/**
 * Represents an abstract class Group, extending its parent class Creator
 */
public abstract class Group extends Creator {
  private String name;
  private Set<Person> members;

  /**
   * Constructs a Band, with name and a collection of members
   * @param name - String, name of the group
   * @param members - Set of Person, collection of members
   */
  public Group(String name, Set<Person> members) {
    this.name = name;
    this.members = members;
  }

  /**
   * Return name
   * @return String, name
   */
  @Override
  public String getName() {
    return this.name;
  }

  /**
   * Return members of the group
   * @return Set of members
   */
  @Override
  public Set<Person> getMembers() {
    return this.members;
  }

  /**
   * Indicates whether some other object passed as an argument is "equal to" the
   * @param o an object to compare
   * @return boolean
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Group group = (Group) o;
    return Objects.equals(getName(), group.getName()) && Objects
        .equals(getMembers(), group.getMembers());
  }

  /**
   * Returns an integer representation of the object memory address
   * @return int, hash code
   */
  @Override
  public int hashCode() {
    return Objects.hash(getName(), getMembers());
  }

  /**
   * Returns an String representation of the object
   * @return String, string
   */
  @Override
  public String toString() {
    return "Group{" +
        "name='" + name + '\'' +
        ", members=" + members +
        '}';
  }
}
