package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VehicleTest {
  private Vehicle testVehicle;
  private Owner expectedOwner;
  private Integer expectedVIN;
  private String  expectedLicensePlate;


  @Before
  public void setUp() throws Exception {
    expectedOwner = new Owner("Tom","Smith", "2066061111");
    expectedVIN = 1234567898;
    expectedLicensePlate = "0001AAA";

    testVehicle = new Vehicle(new Owner("Tom", "Smith", "2066061111"),
        1234567898, "0001AAA");
  }

  @Test
  public void getOwner() {
    assertEquals(expectedOwner.getFirstName(), testVehicle.getOwner().getFirstName());
    assertEquals(expectedOwner.getLastName(), testVehicle.getOwner().getLastName());
    assertEquals(expectedOwner.getPhoneNumber(), testVehicle.getOwner().getPhoneNumber());
  }

  @Test
  public void getVIN() {
    assertEquals(expectedVIN, testVehicle.getVIN());
  }

  @Test
  public void getLicensePlate() {
    assertEquals(expectedLicensePlate, testVehicle.getLicensePlate());
  }

  @Test
  public void setOwner() {

    Owner expectOwner = new Owner("Jude", "Coco", "2062069999");
    testVehicle.setOwner(new Owner("Jude", "Coco", "2062069999"));
    assertEquals(expectOwner.getFirstName(), testVehicle.getOwner().getFirstName());
    assertEquals(expectOwner.getLastName(), testVehicle.getOwner().getLastName());
    assertEquals(expectOwner.getPhoneNumber(), testVehicle.getOwner().getPhoneNumber());
  }


  @Test
  public void setVIN() {
    int expectedVIN = 1234567800;
    testVehicle.setVIN(1234567800);
    int actualVIN = testVehicle.getVIN();

    assertTrue(testVehicle.getVIN() == 1234567800);
    assertEquals(expectedVIN, actualVIN);

  }

  @Test
  public void setLicensePlate() {
    String expectedLicensePlate = "0001BBB";
    testVehicle.setLicensePlate("0001BBB");
    String actualLicensePlate = testVehicle.getLicensePlate();

    assertTrue(testVehicle.getLicensePlate() == "0001BBB");
    assertEquals(expectedLicensePlate, actualLicensePlate);
  }

}