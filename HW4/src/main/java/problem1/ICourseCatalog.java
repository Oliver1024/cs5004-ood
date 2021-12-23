package problem1;

/**
 * Represent an immutable, unordered collection of Integer.
 */
public interface ICourseCatalog {

  /**
   * Append a courseName given by the argument
   *
   * @param courseName Course taking this parameter
   */
  void append(Course courseName);

  /**
   * Remove the specific courseName given by the argument
   *
   * @param courseName Course, taking this courseName as parameter
   * @throws CourseNotFoundException if the condition is not matched
   */
  void remove(Course courseName) throws CourseNotFoundException;

  /**
   * Check if the array contain a specific course name given by the argument
   *
   * @param courseName Course, taking this parameter
   * @return boolean, if contain the specific course name return true otherwise false
   */
  boolean contains(Course courseName);

  /**
   * Get the number of index of the specific course name in the array
   *
   * @param courseName Course, taking this course name as parameter
   * @return the number of index of the specific course name in the array
   */
  int indexOf(Course courseName);

  /**
   * Gets the number of Courses in the CourseCatalog.
   *
   * @return int, the number of Courses in the CourseCatalog.
   */
  int count();

  /**
   * Returns the Course at the given index in the CourseCatalog.
   *
   * @param courseIndex int, taking this parameter as given by the users
   * @return Course, the Course at the given index in the CourseCatalog.
   * @throws InvalidIndexException if condition is not matched, throw this exception
   */
  Course get(int courseIndex) throws InvalidIndexException;

  /**
   * Checks if the CourseCatalog is empty
   *
   * @return boolean, if the course catalog is empty return true otherwise false
   */
  boolean isEmpty();

}
