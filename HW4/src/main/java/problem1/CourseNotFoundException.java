package problem1;

/**
 * A exceptional classes that will throw exceptions when condition is matched.
 */
public class CourseNotFoundException extends Exception{

  public CourseNotFoundException(){
    super("Course is not found");
  }
}
