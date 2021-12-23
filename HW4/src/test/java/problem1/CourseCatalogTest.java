package problem1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Objects;
import org.junit.Before;
import org.junit.Test;

public class CourseCatalogTest {
  private CourseCatalog testCourseCatalog;
  private CourseCatalog testCourseCatalog2;
  private CourseCatalog testCourseCatalog3;
  private Course testCourse;
  private Course testCourse2;
  private Course testCourse3;
  private Course courses;
  private Integer courseIndex;

  @Before
  public void setUp() throws Exception {
    testCourse = new Course("Java","001",0001);
    testCourse2 = new Course("Python","002",0002);
    testCourse3 = new Course("Database","003",0003);

    testCourseCatalog = new CourseCatalog();
    testCourseCatalog2 = new CourseCatalog();
    testCourseCatalog3 = new CourseCatalog();
    courseIndex = 0;
  }

  @Test
  public void append() throws InvalidIndexException {
    testCourseCatalog.append(testCourse);
    testCourseCatalog.append(testCourse2);
    assertNotNull(testCourseCatalog);
    assertEquals(2, testCourseCatalog.count());
    assertEquals(testCourseCatalog.get(1), testCourse2);
    assertEquals(testCourseCatalog.get(0), testCourse);
  }

  @Test
  public void remove() throws CourseNotFoundException, InvalidIndexException {
    testCourseCatalog.append(testCourse);
    testCourseCatalog.append(testCourse2);
    testCourseCatalog.append(testCourse3);
    testCourseCatalog.remove(testCourse2);
    testCourseCatalog.remove(testCourse3);

    assertEquals(testCourseCatalog.get(0),testCourse);
  }


  @Test(expected = CourseNotFoundException.class)
  public void testCourseNotFoundException() throws CourseNotFoundException{
    testCourseCatalog.remove(testCourse);
  }

  @Test
  public void contains() {
    testCourseCatalog.append(testCourse);
    testCourseCatalog.contains(testCourse);
    assertTrue(testCourseCatalog.contains(testCourse));

  }

  @Test
  public void indexOf() {
    testCourseCatalog.append(testCourse);
    testCourseCatalog.append(testCourse2);
    testCourseCatalog.indexOf(testCourse);

    assertEquals(testCourseCatalog.indexOf(testCourse2),1);
    assertEquals(testCourseCatalog.indexOf(testCourse3),-1);
  }

  @Test
  public void count() {
    testCourseCatalog.count();
    assertEquals(testCourseCatalog.count(),1);
  }

  @Test
  public void get() throws InvalidIndexException {
    testCourseCatalog.append(testCourse);
    testCourseCatalog.append(testCourse2);
//    assertTrue(String.valueOf(testCourseCatalog.get(0)),true);
    assertEquals(testCourseCatalog.get(0),testCourse);
    assertEquals(testCourseCatalog.get(1),testCourse2);


  }


  @Test(expected = InvalidIndexException.class)
  public void testInvalidIndexException() throws InvalidIndexException{
    testCourseCatalog.get(-1);

  }

  @Test(expected = InvalidIndexException.class)
  public void testInvalidIndexException2() throws InvalidIndexException{
    testCourseCatalog.get(1);

  }

  @Test
  public void isEmpty() throws CourseNotFoundException, InvalidIndexException {
    assertTrue(testCourseCatalog.isEmpty());
    testCourseCatalog.append(testCourse);
    assertFalse(testCourseCatalog.isEmpty());


  }

  @Test
  public void testEquals() {
    assertTrue(testCourseCatalog.equals(testCourseCatalog));
  }

  @Test
  public void testEquals2() {
    testCourseCatalog.append(testCourse);
    testCourseCatalog2.append(testCourse);
    assertTrue(testCourseCatalog.equals(testCourseCatalog2));
//    assertNotEquals(testCourseCatalog,null);
  }

  @Test
  public void testEquals3() {
    testCourseCatalog2.append(testCourse2);
    assertFalse(testCourseCatalog.equals(testCourseCatalog2));
  }

  @Test
  public void testEquals4() {
    assertNotEquals(testCourseCatalog,null);
  }

  @Test
  public void testNotSameTotalCourseNum() {
    testCourseCatalog.append(testCourse);
    testCourseCatalog2.append(testCourse2);
    assertFalse(testCourseCatalog.equals(testCourseCatalog2));
  }

  @Test
  public void equalsDifferentDataTypes() {
    assertFalse(testCourseCatalog.equals(testCourse));
  }


  @Test
  public void testHashCode() {
    testCourseCatalog.append(testCourse);
    Course[] aCourse = new Course[1];
    aCourse[0] = testCourse;
    int result = Objects.hash(1);
    result = 31 * result + Arrays.hashCode(aCourse);
    assertEquals(result,testCourseCatalog.hashCode());
  }

  @Test
  public void testToString() {
    testCourseCatalog.append(testCourse);
    Course[] a =  new Course[1];
    a[0] = testCourse;
    String expectedString = "CourseCatalog{" +
        "courses=" + Arrays.toString(a) +
        ", courseIndex=" + 1 +
        '}';
    assertEquals(expectedString, testCourseCatalog.toString());
  }
}