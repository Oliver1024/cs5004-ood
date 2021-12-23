package P3;

import java.util.List;
import java.util.Objects;

public class CourseStatistics {
  private String courseName;
  private String courseCode;
  private Integer allStudents;
  private Integer allALIGNStudents;
  private List<Student> listOfAlignStudents;
  private Float averageGradeOfAllStudents;
  private Float averageGradeOfAllALIGNStudents;


  public CourseStatistics(String courseName, String courseCode, List<Student> listOfStudents,
      List<Student> listOfAlignStudents) {
    this.courseName = courseName;
    this.courseCode = courseCode;
    this.listOfAlignStudents = listOfAlignStudents;

    Integer tempAllStudents = 0;
    Float totalGrade = 0f;

    for(Student student : listOfStudents){
      for(Course course : student.getTakenCourses()){
        if(course.getCourseName().equals(courseName)){
          tempAllStudents++;
          totalGrade += course.getGrade();
        }
      }
    }

    this.allStudents = tempAllStudents;
    if(tempAllStudents != 0){
      this.averageGradeOfAllStudents = (float) (totalGrade / tempAllStudents);
    }else{
      this.averageGradeOfAllStudents = 0f;
    }

    Integer tempAllALIGNStudents = 0;
    Float totalALIGNGrade = 0f;

    for(Student student : listOfAlignStudents){
      for(Course course : student.getTakenCourses()){
        if(course.getCourseName().equals(courseName)){
          tempAllALIGNStudents++;
          totalALIGNGrade += course.getGrade();
        }
      }
    }

    this.allALIGNStudents = tempAllALIGNStudents;
    if(tempAllALIGNStudents != 0){
      this.averageGradeOfAllALIGNStudents = (float) (totalALIGNGrade / tempAllALIGNStudents);
    }else {
      this.averageGradeOfAllALIGNStudents = 0f;
    }
  }


  public String getCourseName() {
    return courseName;
  }

  public String getCourseCode() {
    return courseCode;
  }

  public Integer getAllStudents() {
    return allStudents;
  }

  public Integer getAllALIGNStudents() {
    return allALIGNStudents;
  }

  public List<Student> getListOfAlignStudents() {
    return listOfAlignStudents;
  }

  public Float getAverageGradeOfAllStudents() {
    return averageGradeOfAllStudents;
  }

  public Float getAverageGradeOfAllALIGNStudents() {
    return averageGradeOfAllALIGNStudents;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CourseStatistics that = (CourseStatistics) o;
    return Objects.equals(getCourseName(), that.getCourseName()) && Objects
        .equals(getCourseCode(), that.getCourseCode()) && Objects
        .equals(getAllStudents(), that.getAllStudents()) && Objects
        .equals(getAllALIGNStudents(), that.getAllALIGNStudents()) && Objects
        .equals(getListOfAlignStudents(), that.getListOfAlignStudents()) && Objects
        .equals(getAverageGradeOfAllStudents(), that.getAverageGradeOfAllStudents())
        && Objects
        .equals(getAverageGradeOfAllALIGNStudents(), that.getAverageGradeOfAllALIGNStudents());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getCourseName(), getCourseCode(), getAllStudents(), getAllALIGNStudents(),
        getListOfAlignStudents(), getAverageGradeOfAllStudents(),
        getAverageGradeOfAllALIGNStudents());
  }

  @Override
  public String toString() {
    return "CourseStatistics{" +
        "courseName='" + courseName + '\'' +
        ", courseCode='" + courseCode + '\'' +
        ", allStudents=" + allStudents +
        ", allALIGNStudents=" + allALIGNStudents +
        ", listOfAlignStudents=" + listOfAlignStudents +
        ", averageGradeOfAllStudents=" + averageGradeOfAllStudents +
        ", averageGradeOfAllALIGNStudents=" + averageGradeOfAllALIGNStudents +
        '}';
  }
}
