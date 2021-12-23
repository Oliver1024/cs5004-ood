package problem1;

import java.util.Objects;

/**
 * A class that is defined with name, prefix and number
 */
public class Course {

  private final String name;
  private final String prefix;
  private final int number;

  /**
   * A constructor that creates a new object of Course
   *
   * @param name,  - String, name of the new object of Course
   * @param prefix - String, prefix of the new object of Course
   * @param number - int, number of the new object of Course
   */
  public Course(String name, String prefix, int number) {
    this.name = name;
    this.prefix = prefix;
    this.number = number;
  }

  /**
   * Returns the value given to it in string format.
   *
   * @return String, returns the value given to it in string format.
   */
  @Override
  public String toString() {
    return prefix + number + ": " + name;
  }

  /**
   * {@inheritDoc} A method provided by java.lang.Object that indicates whether some other object
   * passed as an argument is "equal to" the current instance.
   *
   * @param o Object, taking this object as a parameter
   * @return boolean, a boolean value after compare with those fields of Course object
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Course course = (Course) o;
    return number == course.number &&
        name.equals(course.name) &&
        prefix.equals(course.prefix);
  }

  /**
   * Return a hashcode value of the Object
   *
   * @return int, a hashcode value of the object
   */
  @Override
  public int hashCode() {
    return Objects.hash(name, prefix, number);
  }

}
