package midtermExam.p2;

import static org.junit.Assert.*;

import java.time.LocalDate;
import org.junit.Before;
import org.junit.Test;

public class EmptyNationalParkTest {
  private NationalPark first;
  private INationalParkDirectorySystem testEmptyNationalPark;
  private LocalDate dateParkFounded;
  private String[] visitorCenters;


  @Before
  public void setUp() throws Exception {
    testEmptyNationalPark = new EmptyNationalPark();

    visitorCenters = new String[]{"A", "B", "C"};
    dateParkFounded = dateParkFounded.of(1990,01,01);
    first = new NationalPark("1","A","WA",1.0,dateParkFounded,
        visitorCenters,true);

  }

  @Test
  public void size() {
    assertEquals(testEmptyNationalPark.size(),(Integer) 0);
  }

  @Test
  public void add() {
    testEmptyNationalPark = testEmptyNationalPark.add(first);
    assertFalse(testEmptyNationalPark.isEmpty());
    assertEquals(testEmptyNationalPark.size(),(Integer) 1);
  }

  @Test
  public void findAllOpenYearRound() {
    assertEquals(testEmptyNationalPark.findAllOpenYearRound(),testEmptyNationalPark);

  }

  @Test(expected = InvalidNationalParkIDException.class)
  public void getSpecifiedNationalPark() throws InvalidNationalParkIDException {
    testEmptyNationalPark.getSpecifiedNationalPark("1");

  }
}