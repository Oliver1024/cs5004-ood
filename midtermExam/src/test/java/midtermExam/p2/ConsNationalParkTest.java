package midtermExam.p2;

import static org.junit.Assert.*;

import java.time.LocalDate;
import org.junit.Before;
import org.junit.Test;

public class ConsNationalParkTest {
  private NationalPark first;
  private NationalPark first2;
  private NationalPark first3;
  private NationalPark first4;
  private INationalParkDirectorySystem rest;
  private LocalDate dateParkFounded;
  private String[] visitorCenters;
  private INationalParkDirectorySystem testConsNationalPark;
  private INationalParkDirectorySystem testConsNationalPark2;

  @Before
  public void setUp() throws Exception {
    visitorCenters = new String[]{"A", "B", "C"};
    dateParkFounded = dateParkFounded.of(1990,01,01);
    first = new NationalPark("1","A","WA",1.0,dateParkFounded,
        visitorCenters,true);
    first2 = new NationalPark("1","X","WA",1.0,dateParkFounded,
        visitorCenters,true);
    first3 = new NationalPark("2","Q","WA",1.0,dateParkFounded,
        visitorCenters,true);
    first4 = new NationalPark("5","M","WA",1.0,dateParkFounded,
        visitorCenters,false);
    rest = new EmptyNationalPark();

    testConsNationalPark = new ConsNationalPark(first, rest);
    testConsNationalPark2 = new ConsNationalPark(first4, rest);

  }

  @Test
  public void size() {
    assertEquals(testConsNationalPark.size(),(Integer) 1);
  }


  @Test
  public void add() {
    testConsNationalPark = testConsNationalPark.add(first);
    testConsNationalPark = testConsNationalPark.add(first2);
    testConsNationalPark = testConsNationalPark.add(first3);
    testConsNationalPark = testConsNationalPark.add(first4);
    assertEquals(testConsNationalPark.size(),(Integer) 3);

  }

  @Test
  public void findAllOpenYearRound() {
    assertEquals(testConsNationalPark.findAllOpenYearRound(),testConsNationalPark);
    assertNotEquals(testConsNationalPark2.findAllOpenYearRound(),testConsNationalPark2);
  }

  @Test
  public void getSpecifiedNationalPark() throws InvalidNationalParkIDException {

    testConsNationalPark = testConsNationalPark.add(first3);
    assertEquals(testConsNationalPark.getSpecifiedNationalPark("2"), first3);
  }


  @Test(expected = InvalidNationalParkIDException.class)
  public void getSpecifiedNationalPark2() throws InvalidNationalParkIDException {

    testConsNationalPark.getSpecifiedNationalPark("3");
  }
}