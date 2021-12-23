package problem1;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import org.junit.Before;
import org.junit.Test;

public class MonthlyDonationTest {

  private Integer amount;
  private Integer amount2;
  private LocalDateTime donationDateTime;
  private LocalDateTime cancelDateTime;
  private LocalDateTime cancelDateTime2;
  private LocalDateTime cancelDateTime3;
  private LocalDateTime donationDateTime2;
  private LocalDateTime donationDateTime3;
  private MonthlyDonation testMonthDonation;
  private MonthlyDonation testMonthDonation2;


  @Before
  public void setUp() throws Exception {
    donationDateTime = LocalDateTime.of(2021, 03, 15,
        01, 01, 01);
    cancelDateTime = LocalDateTime.of(2021, 06, 20,
        01, 01, 01);
    amount = 1;
    amount2 = -1;
    testMonthDonation = new MonthlyDonation(amount, donationDateTime);
  }

  @Test
  public void getAmount() {
    assertEquals(testMonthDonation.getAmount(), amount);
  }

  @Test
  public void getDonationDateTime() {
    assertEquals(testMonthDonation.getDonationDateTime(), donationDateTime);
  }

  @Test
  public void getCancelDateTime() {
    assertNull(testMonthDonation.getCancelDateTime());
    assertNotEquals(testMonthDonation.getCancelDateTime(), cancelDateTime);
    testMonthDonation.setCancelDateTime(cancelDateTime);
    assertEquals(cancelDateTime, testMonthDonation.getCancelDateTime());
  }

  @Test
  public void setCancelDateTime() {
    testMonthDonation.setCancelDateTime(cancelDateTime);
    assertEquals(testMonthDonation.getCancelDateTime(), cancelDateTime);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testInvalidProcessingTime() throws IllegalArgumentException {
    cancelDateTime2 =
        LocalDateTime.of(2020, 4, 4, 4, 4, 4);
    testMonthDonation.setCancelDateTime(cancelDateTime2);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testInvalidAmount() throws IllegalArgumentException {
    testMonthDonation2 = new MonthlyDonation(amount2, donationDateTime);
  }

  @Test
  public void countDonationAmount() {
    assertEquals(10, testMonthDonation.countDonationAmount(2021), 0);
    assertEquals(12, testMonthDonation.countDonationAmount(2022), 0);
    assertEquals(0, testMonthDonation.countDonationAmount(2010), 0);

    testMonthDonation.setCancelDateTime(cancelDateTime);
    assertEquals(4, testMonthDonation.countDonationAmount(2021), 0);
    assertEquals(0, testMonthDonation.countDonationAmount(2022), 0);
    assertEquals(0, testMonthDonation.countDonationAmount(2020), 0);

    cancelDateTime2 =
        LocalDateTime.of(2022, 6, 20, 1, 1, 1);
    testMonthDonation.setCancelDateTime(cancelDateTime2);
    assertEquals(10, testMonthDonation.countDonationAmount(2021), 0);
    assertEquals(6, testMonthDonation.countDonationAmount(2022), 0);
    assertEquals(0, testMonthDonation.countDonationAmount(2020), 0);

    cancelDateTime2 =
        LocalDateTime.of(2022, 8, 10, 1, 1, 1);
    testMonthDonation.setCancelDateTime(cancelDateTime2);
    assertEquals(10, testMonthDonation.countDonationAmount(2021), 0);
    assertEquals(7, testMonthDonation.countDonationAmount(2022), 0);

    cancelDateTime2 =
        LocalDateTime.of(2022, 6, 5, 0, 1, 1);
    testMonthDonation.setCancelDateTime(cancelDateTime2);
    assertEquals(5, testMonthDonation.countDonationAmount(2022), 0);

    cancelDateTime2 =
        LocalDateTime.of(2022, 6, 10, 1, 0, 1);
    testMonthDonation.setCancelDateTime(cancelDateTime2);
    assertEquals(5, testMonthDonation.countDonationAmount(2022), 0);

    cancelDateTime2 =
        LocalDateTime.of(2022, 3, 15, 1, 1, 0);
    testMonthDonation.setCancelDateTime(cancelDateTime2);
    assertEquals(2, testMonthDonation.countDonationAmount(2022), 0);

    cancelDateTime2 =
        LocalDateTime.of(2022, 3, 15, 2, 1, 1);
    testMonthDonation.setCancelDateTime(cancelDateTime2);
    assertEquals(3, testMonthDonation.countDonationAmount(2022), 0);

    cancelDateTime2 =
        LocalDateTime.of(2022, 3, 15, 1, 2, 1);
    testMonthDonation.setCancelDateTime(cancelDateTime2);
    assertEquals(3, testMonthDonation.countDonationAmount(2022), 0);

    cancelDateTime2 =
        LocalDateTime.of(2022, 3, 15, 1, 1, 2);
    testMonthDonation.setCancelDateTime(cancelDateTime2);
    assertEquals(3, testMonthDonation.countDonationAmount(2022), 0);

    cancelDateTime2 =
        LocalDateTime.of(2022, 3, 15, 0, 1, 2);
    testMonthDonation.setCancelDateTime(cancelDateTime2);
    assertEquals(2, testMonthDonation.countDonationAmount(2022), 0);

    cancelDateTime2 =
        LocalDateTime.of(2022, 3, 15, 1, 0, 1);
    testMonthDonation.setCancelDateTime(cancelDateTime2);
    assertEquals(2, testMonthDonation.countDonationAmount(2022), 0);
  }

  @Test
  public void testEquals() {
    assertTrue(testMonthDonation.equals(testMonthDonation));
    assertNotEquals(testMonthDonation, null);
    assertFalse(testMonthDonation.equals(cancelDateTime));
  }

  @Test
  public void testEquals2() {
    testMonthDonation2 = new MonthlyDonation(amount, cancelDateTime);
    testMonthDonation = new MonthlyDonation(amount, cancelDateTime);

    assertTrue(testMonthDonation.equals(testMonthDonation2));
  }

  @Test
  public void testHashCode() {
    assertFalse(0 == testMonthDonation.hashCode());
    testMonthDonation2 = new MonthlyDonation(amount,donationDateTime);
    assertTrue(testMonthDonation.equals(testMonthDonation2) ==
        (testMonthDonation.hashCode()
        == testMonthDonation2.hashCode()));

    int hash = testMonthDonation.hashCode();
    assertEquals(hash, testMonthDonation.hashCode());
  }

  @Test
  public void testToString() {
    String expectedString = "MonthlyDonation{" +
        "amount=" + amount +
        ", donationDateTime=" + donationDateTime +
        ", cancelDateTime=" + null +
        '}';

    assertEquals(expectedString, testMonthDonation.toString());
  }

}