package P3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class CourseRecommender {

  private static final Integer YEAR_VALUE = 2020;
  private static final Integer MONTH_VALUE = 9;
  private static final Integer DAY_VALUE = 1;
  private List<Student> listOfStudents;
  private List<Student> listOfALIGNStudents;
  private Map<String, CourseStatistics> courseStatisticsMap;
  private final LocalDate COURSE_YEAR_TAKEN = LocalDate.of(YEAR_VALUE,MONTH_VALUE,DAY_VALUE);
  private final Float GRADE_VALUE = 0f;
  private static final Integer NEGATIVE_ONE = -1;

  public CourseRecommender(List<Student> listOfStudents,
      List<Student> listOfALIGNStudents,
      Map<String, CourseStatistics> courseStatisticsMap) {
    this.listOfStudents = listOfStudents;
    this.listOfALIGNStudents = listOfALIGNStudents;
    this.courseStatisticsMap = courseStatisticsMap;
  }

  public CourseRecommender(List<Student> listOfStudents) {
    this.listOfStudents = listOfStudents;
    this.listOfALIGNStudents = this.filterOutAlignStudents(listOfStudents);
    this.courseStatisticsMap = this.computeCollegeCoursesStatistics(listOfStudents,
        listOfALIGNStudents);
  }


  /**
   * Get List of Align students
   * @param allStudents List
   * @return List of Align students
   */
  private List<Student> filterOutAlignStudents(List<Student> allStudents) {
    return this.checkALLALIGNStudents();
  }


  /**
   * Helper function that is used tot get Align students of List.
   * @return align students of list
   */
  private List<Student> checkALLALIGNStudents() {
    List<Student> allALIGNStudents = new ArrayList<>();
    for (Student student : listOfStudents) {
      Set<Course> courseSet = student.getTakenCourses().stream().filter(c -> c.getCourseCode()
          .equals("CS 5001") || c.getCourseCode().equals("CS 5002") ||
          c.getCourseCode().equals("CS 5004") ||
          c.getCourseCode().equals("CS 5008")).collect(Collectors.toSet());
      if(courseSet.size() > 0) {
        allALIGNStudents.add(student);
      }
    }
    return allALIGNStudents;
  }

  private Map<String, CourseStatistics> computeCollegeCoursesStatistics(List<Student>
      listOfStudents, List<Student> listOfALIGNStudents){
    Map<String, String> courseMap = new HashMap<>();
    Map<String, CourseStatistics> outputResult = new HashMap<>();

    for(Student student : listOfStudents){
      for(Course course : student.getTakenCourses() ){
        courseMap.put(course.getCourseName(), course.getCourseCode());
      }
    }

    for (Map.Entry<String, String> entry : courseMap.entrySet()){
      outputResult.put(entry.getKey(), new CourseStatistics(entry.getKey(), entry.getValue(),
          listOfStudents,listOfALIGNStudents));
    }
    return outputResult;
  }

  /**
   * Return recommended list of courses
   * @param student Student
   * @return recommended list of courses
   */
  public List<Course> recommendCourses(Student student) {
    List<Course> recommendCourses = new ArrayList<>();

    recommendCourses.add(this.firstRecommendCourse(student));
    recommendCourses.add(this.secondRecommendCourse(student));
    recommendCourses.add(this.thirdRecommendCourse(student));
    return recommendCourses;
  }

  /**
   * Helper function to get the CourseStatistics of List
   * @return get the CourseStatistics of List
   */
  private List<CourseStatistics> getCourseStatisticsList(){
    List<CourseStatistics> courseStatisticsList = new ArrayList<>();
    for(String courseName : courseStatisticsMap.keySet()) {
      courseStatisticsList.add(courseStatisticsMap.get(courseName));
    }
    return courseStatisticsList;
  }

  /**
   * Helper function that is used to get the first recommend course
   * @param student Student
   * @return get the first recommend course
   */
  private Course firstRecommendCourse(Student student){
    Course firstRecommendCourse = null;
    List<CourseStatistics>  courseStatisticsList = this.getCourseStatisticsList();

    courseStatisticsList.sort((o1, o2) -> {
      if(o1.getAllStudents() < o2.getAllStudents()) return NEGATIVE_ONE;
      else if (o1.getAllStudents() > o2.getAllStudents()) return 1;
      return 0;
    });

    for (CourseStatistics courseStatistics : courseStatisticsList){
      for (Course course : student.getTakenCourses()){
        if(!course.getCourseCode().equals(courseStatistics.getCourseCode())){
          firstRecommendCourse = new Course(courseStatistics.getCourseName(),
              courseStatistics.getCourseCode(),COURSE_YEAR_TAKEN, GRADE_VALUE);
        }
      }
    }
    return firstRecommendCourse;
  }

  /**
   * Helper function that is used to get the second recommend course
   * @param student Student
   * @return get the second recommend course
   */
  private Course secondRecommendCourse(Student student){
    Course secondRecommendCourse = null;
    List<CourseStatistics> courseStatisticsList = this.getCourseStatisticsList();

    courseStatisticsList.sort((o1, o2) -> {
      if(o1.getAverageGradeOfAllStudents() < o2.getAverageGradeOfAllStudents()) return NEGATIVE_ONE;
      else if(o1.getAverageGradeOfAllStudents() > o2.getAverageGradeOfAllStudents()) return 1;
      return 0;
    });

    for(CourseStatistics courseStatistics : courseStatisticsList){
      for(Course course : student.getTakenCourses()){
        if(!course.getCourseCode().equals(courseStatistics.getCourseCode())){
          secondRecommendCourse = new Course(courseStatistics.getCourseName(),
              courseStatistics.getCourseCode(),COURSE_YEAR_TAKEN, GRADE_VALUE);
        }
      }
    }
    return secondRecommendCourse;
  }


  /**
   * Helper function that is used to get the third recommend course
   * @param student Student
   * @return the second recommend course
   */
  private Course thirdRecommendCourse(Student student){
    Course thirdRecommendCourse = null;
    List<CourseStatistics> courseStatisticsList = this.getCourseStatisticsList();

    courseStatisticsList.sort((o1, o2) -> {
      if(o1.getAllALIGNStudents() < o2.getAllALIGNStudents()) return NEGATIVE_ONE;
      else if (o1.getAllALIGNStudents() > o2.getAllALIGNStudents()) return 1;
      return 0;
    });

    for (CourseStatistics courseStatistics : courseStatisticsList){
      for(Course course : student.getTakenCourses()){
        if (!course.getCourseCode().equals(courseStatistics.getCourseCode())){
          thirdRecommendCourse = new Course(courseStatistics.getCourseName(),
              courseStatistics.getCourseCode(),COURSE_YEAR_TAKEN, GRADE_VALUE);
        }
      }
    }
    return thirdRecommendCourse;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CourseRecommender that = (CourseRecommender) o;
    return Objects.equals(listOfStudents, that.listOfStudents) && Objects
        .equals(listOfALIGNStudents, that.listOfALIGNStudents) && Objects
        .equals(courseStatisticsMap, that.courseStatisticsMap) && Objects
        .equals(COURSE_YEAR_TAKEN, that.COURSE_YEAR_TAKEN) && Objects
        .equals(GRADE_VALUE, that.GRADE_VALUE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listOfStudents, listOfALIGNStudents, courseStatisticsMap, COURSE_YEAR_TAKEN,
        GRADE_VALUE);
  }

  @Override
  public String toString() {
    return "CourseRecommender{" +
        "listOfStudents=" + listOfStudents +
        ", listOfALIGNStudents=" + listOfALIGNStudents +
        ", courseStatisticsMap=" + courseStatisticsMap +
        ", COURSE_YEAR_TAKEN=" + COURSE_YEAR_TAKEN +
        ", GRADE_VALUE=" + GRADE_VALUE +
        '}';
  }
}
