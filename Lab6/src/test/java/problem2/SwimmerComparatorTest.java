package problem2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class SwimmerComparatorTest {
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
    butterfly50mTimes = new ArrayList<>();
    butterfly50mTimes.add(2.0);
    butterfly50mTimes.add(10.0);
    name = "a";

    butterfly50mTimes2 = new ArrayList<>();
    butterfly50mTimes2.add(3.0);
    butterfly50mTimes2.add(4.0);
    name2 = "b";

    swimmer = new Swimmer(name, butterfly50mTimes,backstroke50mTimes,
        breaststroke50mTimes,freestyle50mTimes);

    swimmer2 = new Swimmer(name2, butterfly50mTimes2,backstroke50mTimes2,
        breaststroke50mTimes2,freestyle50mTimes2);

    comparator = new SwimmerComparator<>();
  }

  @Test
  public void compare() {
    assertEquals(1,comparator.compare(swimmer,swimmer2));
  }
}