package problem1;

import java.util.Arrays;
import java.util.Objects;

/**
 * A class that is defined a course catalog and implements from interface of ICourseCatalog.
 */
public class CourseCatalog implements ICourseCatalog {

  private Course[] courses;
  private int courseIndex;
  private static final int NUM_ONE = 1;
  private static final int NUM_NEGATIVE_ONE = -1;
  private int zero = 0;

  /**
   * A constructor that creates a new object of the CourseCatalog.
   */
  public CourseCatalog() {
    this.courses = new Course[NUM_ONE];
    this.courseIndex = zero;
  }

  /**
   * Append a course to current array
   *
   * @param courseName Course, a parameter that is appended to the array.
   */
  @Override
  public void append(Course courseName) {
    if (!this.isFull()) {
      this.courses[courseIndex] = courseName;
    } else {
      Course[] newestCourse = new Course[this.count() + NUM_ONE];
      for (int j = zero; j < courseIndex; j++) {
        newestCourse[j] = courses[j];
      }
      newestCourse[courseIndex] = courseName;
      this.courses = newestCourse;
    }
    this.courseIndex++;

  }

  /**
   * Check if the current array if is full or not. If full return true otherwise false.
   *
   * @return true if the the current array is full otherwise is false
   */
  private boolean isFull() {
    return this.courses[this.courses.length - NUM_ONE] != null;
  }


  /**
   * Remove a specific courseName from the array given the courseName as a parameter
   *
   * @param courseName Course, given the courseName as a parameter
   * @throws CourseNotFoundException if the course is not found in the array
   */
  @Override
  public void remove(Course courseName) throws CourseNotFoundException {
    if (!this.contains(courseName)) {
      throw new CourseNotFoundException();
    } else {
      for (int i = zero; i < this.courseIndex; i++) {
        if (this.courses[i].equals(courseName)) {
          for (int j = i; j < this.courseIndex - NUM_ONE; j++) {
            this.courses[j] = this.courses[j + NUM_ONE];
            break;
          }
        }
      }
      this.courses[this.courseIndex - NUM_ONE] = null;
      this.courseIndex--;
    }
  }

  /**
   * Check if the array contain a specific course given the parameter
   *
   * @param courseName Course, given the courseName as a parameter
   * @return boolean, if contain a specific course, return true otherwise false
   */
  @Override
  public boolean contains(Course courseName) {
    for (int i = zero; i < this.courseIndex; i++) {
      if (courseName.equals(this.courses[i])) {
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the index of the specified Course in the CourseCatalog
   *
   * @param courseName Course, given the parameter
   * @return int, the index of the specified Course in the CourseCatalog, otherwise return -1
   */
  @Override
  public int indexOf(Course courseName) {
    for (int i = zero; i < this.courseIndex; i++) {
      if (courseName.equals(this.courses[i])) {
        return i;
      }
    }
    return NUM_NEGATIVE_ONE;
  }

  /**
   * Gets the number of Courses in the CourseCatalog.
   *
   * @return int, the number of Courses in the CourseCatalog
   */
  @Override
  public int count() {
    return this.courses.length;
  }

  /**
   * Returns the Course at the given index in the CourseCatalog.
   *
   * @param courseIndex int, given the index of the course
   * @return Course, the Course at the given index in the CourseCatalog
   * @throws InvalidIndexException if the index doesn’t exist
   */
  @Override
  public Course get(int courseIndex) throws InvalidIndexException {
    if (courseIndex < this.courseIndex && courseIndex >= zero) {
      return this.courses[courseIndex];
    }
    throw new InvalidIndexException();
  }


  /**
   * Check the array if is empty or not.If empty return true otherwise false.
   *
   * @return boolean, return true if the array is empty otherwise false
   */
  @Override
  public boolean isEmpty() {
    Course[] a = new Course[NUM_ONE];
    return (this.courseIndex == zero && Arrays.equals(a, this.courses));
  }

  /**
   * {@inheritDoc}
   * A method provided by java.lang.Object that indicates whether some other object
   * passed as an argument is "equal to" the current instance.
   *
   * @param o Object, taking this object as a parameter
   * @return boolean, a boolean value after compare with those fields of CourseCatalog object
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CourseCatalog that = (CourseCatalog) o;
    if (this.courseIndex != that.courseIndex) {
      return false;
    }
    return courseIndex == that.courseIndex && Arrays.equals(courses, that.courses);
  }

  /**
   * {@inheritDoc}
   * Return a hashcode value of the Object
   *
   * @return int, a hashcode value of the object
   */
  @Override
  public int hashCode() {
    int result = Objects.hash(courseIndex);
    int number = 31;
    result = number * result + Arrays.hashCode(courses);
    return result;
  }

  /**
   * Returns the value given to it in string format.
   *
   * @return String, returns the value given to it in string format.
   */
  @Override
  public String toString() {
    return "CourseCatalog{" +
        "courses=" + Arrays.toString(courses) +
        ", courseIndex=" + courseIndex +
        '}';
  }
}
