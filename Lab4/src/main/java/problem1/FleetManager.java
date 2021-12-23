package problem1;

/**
 * A class that defined as fleet manager and return a new trip report given the parameters
 */
public class FleetManager {

  TripReport drive(float distance, Vehicle vehicle) {
    float speed = vehicle.getAverageSpeed();
    Integer duration = (int) (distance / speed);
    return new TripReport(vehicle, speed, distance, duration);
  }

  /**
   * Overload method passing different types of parameters
   *
   * @param vehicle  Vehicle, a type of vehicle passing in this method
   * @param duration Integer, the duration calculated by time and speed
   * @return TripReport, a new trip report with given parameters
   */
  public TripReport drive(Vehicle vehicle, Integer duration) {
    float speed = vehicle.getAverageSpeed();
    float distance = duration * speed;
    return new TripReport(vehicle, speed, distance, duration);
  }

  /**
   * Overload method passing different types of parameters
   *
   * @param vehicle  Vehicle, a type of vehicle passing in this method
   * @param duration Integer, the duration calculated by time and speed
   * @param distance float, the distance of the new object
   * @param speed    float, the speed of the new object
   * @return TripReport, a new trip report with given parameters
   */
  public TripReport drive(Vehicle vehicle, Integer duration, float distance, float speed) {
    return new TripReport(vehicle, speed, distance, duration);
  }

  /**
   * Overload method passing different types of parameters
   *
   * @param vehicle  Vehicle, a type of vehicle passing in this method
   * @param distance float, the distance of the new object
   * @param speed    float, the speed of the new object
   * @param duration Integer, the duration calculated by time and speed
   * @return TripReport, a new trip report with given parameters
   */
  public TripReport drive(Vehicle vehicle, float distance, float speed, Integer duration) {
    return new TripReport(vehicle, speed, distance, duration);
  }

  /**
   * Main method to call other methods with different parameters
   *
   * @param args String, passing arguments
   */
  public static void main(String[] args) {
    Vehicle testVehicle1 = new Bus("V1", 10f, 50f);
    Vehicle testVehicle2 = new Boat("V2", 15f, 40f);
    Vehicle testVehicle3 = new Train("V3", 12.5f, 30.5f);

    int duration1 = 600;
    int duration2 = 800;
    int duration3 = 505;
    float distance1 = 1000f;
    float distance2 = 888f;
    float distance3 = 1215f;

    FleetManager fleetManager = new FleetManager();
    // calling the first overloading method
    TripReport report1 = fleetManager.drive(distance1, testVehicle1);
    // calling the second overloading method
    TripReport report2 = fleetManager.drive(testVehicle1, duration1);
    // calling the third overloading method
    TripReport report3 = fleetManager.drive(testVehicle2, duration2, distance2,
        testVehicle2.getAverageSpeed());
    // calling the fourth overloading method
    TripReport report4 = fleetManager.drive(testVehicle3, distance3,
        testVehicle3.getAverageSpeed(), duration3);

/**
 * Print the results
 */
    System.out.println(report1);
    System.out.println(report2);
    System.out.println(report3);
    System.out.println(report4);
  }
}
