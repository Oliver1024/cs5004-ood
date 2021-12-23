package problem2;

/**
 * Employee is a simple object that has firstName and lastName.
 */
public class Employee {

  private String firstName;
  private String lastName;

  /**
   * Constructor that creates a new Employee object with firstName and lastName
   *
   * @param firstName - firstName of the new Employee object
   * @param lastName - lastName of the new Employee object
   */
  public Employee(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  /**
   * Returns the firstName of Employee
   *
   * @return the firstName of Employee
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * Returns the lastName of Employee
   *
   * @return the lastName of Employee
   */
  public String getLastName() {
    return this.lastName;
  }
}
