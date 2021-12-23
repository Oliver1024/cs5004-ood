package problem2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class SwimmerTest {
  private Swimmer swimmer;
  private String name;
  private List<Double> butterfly50mTimes;
  private List<Double> backstroke50mTimes;
  private List<Double> breaststroke50mTimes;
  private List<Double> freestyle50mTimes;

  private Swimmer swimmer2;
  private String name2;
  private List<Double> butterfly50mTimes2;
  private List<Double> backstroke50mTimes2;
  private List<Double> breaststroke50mTimes2;
  private List<Double> freestyle50mTimes2;

  private Comparator<Swimmer> comparator;


  @Before
  public void setUp() throws Exception {
    name = "a";
    butterfly50mTimes = new ArrayList<>();
    butterfly50mTimes.add(1.0);
    butterfly50mTimes.add(2.0);

    backstroke50mTimes = new ArrayList<>();
    backstroke50mTimes.add(3.0);
    backstroke50mTimes.add(4.0);

    breaststroke50mTimes = new ArrayList<>();
    breaststroke50mTimes.add(5.0);
    breaststroke50mTimes.add(6.0);

    freestyle50mTimes = new ArrayList<>();
    freestyle50mTimes.add(7.0);
    freestyle50mTimes.add(9.0);

    freestyle50mTimes2 = new ArrayList<>();
    freestyle50mTimes2.add(8.0);
    freestyle50mTimes2.add(10.0);

    swimmer = new Swimmer(name, butterfly50mTimes,
        backstroke50mTimes, breaststroke50mTimes, freestyle50mTimes);

    swimmer2 = new Swimmer(name, butterfly50mTimes,
        backstroke50mTimes, breaststroke50mTimes, freestyle50mTimes2);

    comparator = new SwimmerComparator<>();

  }

  @Test
  public void getName() {
    assertTrue(swimmer.getName().equals(name));
  }

  @Test
  public void getButterfly50mTimes() {
    assertTrue(swimmer.getButterfly50mTimes().equals(butterfly50mTimes));
  }

  @Test
  public void getBackstroke50mTimes() {
    assertTrue(swimmer.getBackstroke50mTimes().equals(backstroke50mTimes));
  }

  @Test
  public void getBreaststroke50mTimes() {
    assertTrue(swimmer.getBreaststroke50mTimes().equals(breaststroke50mTimes));
  }

  @Test
  public void getFreestyle50mTimes() {
    assertTrue(swimmer.getFreestyle50mTimes().equals(freestyle50mTimes));
  }

  @Test
  public void compareTo() {
    assertEquals(-1, swimmer.compareTo(swimmer2));

  }

  @Test
  public void getFastestSwimTime() {
    assertEquals(9.0, swimmer.getFastestSwimTime(freestyle50mTimes),
        0);
  }

  @Test
  public void testCompare() {
    assertEquals(0, swimmer.fastestButterflyTime.compare(swimmer,swimmer2));

    Comparator<Swimmer> swimmerComparator = new SwimmerComparator<>();
    Comparator<Swimmer> swimmerComparator1 = new SwimmerComparator<>();
//    assertEquals(0, swimmerComparator.compare(swimmer, swimmer2));
  }

}