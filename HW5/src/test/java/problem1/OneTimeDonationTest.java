package problem1;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import org.junit.Before;
import org.junit.Test;

public class OneTimeDonationTest {
  private LocalDateTime expectedDonationDateTime;
  private LocalDateTime expectedDonationDateTime2;
  private Integer expectedAmount;
  private Integer expectedAmount2;
  private OneTimeDonation testOneTimeDonation2;
  private OneTimeDonation testOneTimeDonation;


  @Before
  public void setUp() throws Exception {
    expectedDonationDateTime = LocalDateTime.of(2021,05,11,
        12,13,11);
    expectedDonationDateTime2 = LocalDateTime.of(2020,05,11,
        12,13,11);
    expectedAmount = 100;
    expectedAmount2 = -1;
    testOneTimeDonation = new OneTimeDonation(expectedAmount,expectedDonationDateTime);

  }

  @Test
  public void getAmount() {
    assertEquals(testOneTimeDonation.countDonationAmount(2022),0,0);
    assertEquals(testOneTimeDonation.countDonationAmount(2021),100,0);
  }

  @Test
  public void getDonationDateTime() {
    assertEquals(testOneTimeDonation.getDonationDateTime(),expectedDonationDateTime);
  }

  @Test
  public void countDonationAmount() {
    assertEquals(testOneTimeDonation.getAmount(),100,0);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testInvalidAmount() throws IllegalArgumentException{
    testOneTimeDonation2 = new OneTimeDonation(expectedAmount2,expectedDonationDateTime2);
  }

  @Test
  public void testEquals() {
    assertTrue(testOneTimeDonation.equals(testOneTimeDonation));
    assertNotEquals(testOneTimeDonation, null);
    assertFalse(testOneTimeDonation.equals(expectedAmount));
  }

  @Test
  public void testEquals2() {
    testOneTimeDonation2 = new OneTimeDonation(expectedAmount, expectedDonationDateTime);
    assertTrue(testOneTimeDonation.equals(testOneTimeDonation2));

    expectedAmount = 100;
    expectedDonationDateTime = LocalDateTime.of(2021, 05, 11,
        12, 13, 15);
    testOneTimeDonation2 = new OneTimeDonation(expectedAmount,expectedDonationDateTime);
    assertFalse(testOneTimeDonation.equals(testOneTimeDonation2));
  }

  @Test
  public void testToString() {
    String expectedString = "OneTimeDonation{" +
        "amount=" + expectedAmount +
        ", donationDateTime=" + expectedDonationDateTime +
        '}';
    assertEquals(expectedString, testOneTimeDonation.toString());
  }
}