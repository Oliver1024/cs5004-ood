package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
  private Employee testEmployee;
  private String expectFirstName;
  private String expectLastName;

  @Before
  public void setUp() throws Exception {
    expectFirstName = "Hank";
    expectLastName = "Joe";

    testEmployee = new Employee(expectFirstName, expectLastName);
  }

  @Test
  public void getFirstName() {
    assertEquals(expectFirstName, testEmployee.getFirstName());
  }

  @Test
  public void getLastName() {
    assertEquals(expectLastName, testEmployee.getLastName());
  }
}