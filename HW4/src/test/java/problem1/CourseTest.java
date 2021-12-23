package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CourseTest {
  private Course testCourse;
  private Course testCourse2;
  private Course testCourse3;
  private String name;
  private String prefix;
  private int number;


  @Before
  public void setUp() throws Exception {
    testCourse = new Course("Java","001",0001);
    testCourse2 = new Course("Python","002",0002);
    testCourse3 = new Course("Database","003",0003);
    name = "Java";
    prefix = "001";
    number = 0001;
  }

  @Test
  public void testToString() {
    String expectedString = prefix + number + ": " + name;
    assertEquals(expectedString,testCourse.toString());
  }

  @Test
  public void testEquals() {
    assertTrue(testCourse.equals(testCourse));
  }


  @Test
  public void testEquals2() {
    testCourse = new Course("Java","001",0001);
    testCourse2 = new Course("Java","001",0001);
    assertTrue(testCourse.equals(testCourse2));
    assertFalse(testCourse.equals(testCourse3));
    assertNotEquals(testCourse,null);
  }

  @Test
  public void equalsDifferentDataTypes() {
    assertFalse(testCourse.equals(name));
  }

  @Test
  public void testSameFields() {
    testCourse = new Course("Java","001",0001);
    testCourse2 = new Course("Python","001",0001);
    assertFalse(testCourse.equals(testCourse2));
    testCourse = new Course("Java","001",0001);
    testCourse2 = new Course("Java","002",0001);
    assertFalse(testCourse.equals(testCourse2));
  }


  @Test
  public void testHashCodeNull() {
    assertFalse(testCourse.hashCode() == 0);
  }
}