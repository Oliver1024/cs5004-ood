package problem1;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;

public class NonProfitTest {

  private String organization;
  private String organization2;

  private LocalDateTime expectedDonationTime;
  private Integer expectedAmount;
  private OneTimeDonation testOneTimeDonation;
  private OneTimeDonation testOneTimeDonation2;

  private LocalDateTime createDateTime;
  private Integer amount;
  private LocalDateTime processingTime;
  private Pledges testPledge1;
  private Pledges testPledge2;

  private NonProfit testNonProfit;
  private NonProfit testNonProfit2;
  private Set<AbstractDonation> expectedDonationSet;
  private Set<AbstractDonation> donationsSet;


  @Before
  public void setUp() throws Exception {

    expectedDonationSet = new HashSet<>();
    donationsSet = new HashSet<>();

    expectedDonationTime = LocalDateTime.of(2020, 1, 1,
        1, 1, 1);
    expectedAmount = 100;
    testOneTimeDonation = new OneTimeDonation(expectedAmount, expectedDonationTime);

    expectedDonationTime = LocalDateTime.of(2020, 1, 1,
        1, 1, 50);
    expectedAmount = 110;
    testOneTimeDonation2 = new OneTimeDonation(expectedAmount, expectedDonationTime);

    createDateTime = LocalDateTime.of(2020, 1, 1,
        1, 1, 1);
    processingTime = LocalDateTime.of(2020, 10, 10,
        10, 10, 10);
    amount = 100;
    testPledge1 = new Pledges(amount, createDateTime);
    testPledge2 = new Pledges(amount, createDateTime, processingTime);

    organization = "WildLifeOrg";
    testNonProfit = new NonProfit(organization);

  }

  @Test
  public void donate() {
    testNonProfit.donate(testOneTimeDonation);
    expectedDonationSet.add(testOneTimeDonation);
    assertEquals(expectedDonationSet, testNonProfit.getDonationsSet());

  }

  @Test
  public void getTotalDonationForYear() {
    testNonProfit.donate(testPledge1);
    testNonProfit.donate(testPledge2);
    testNonProfit.donate(testOneTimeDonation);

    assertEquals(200, testNonProfit.getTotalDonationForYear(2020), 0);
  }

  @Test
  public void getDonationsSet() {
    testNonProfit.donate(testOneTimeDonation);
    expectedDonationSet.add(testOneTimeDonation);
    assertEquals(expectedDonationSet, testNonProfit.getDonationsSet());
  }

  @Test
  public void testEquals() {
    assertEquals(testNonProfit, testNonProfit);
    assertFalse(testNonProfit.equals(organization));
    assertNotEquals(null, testNonProfit);
  }

  @Test
  public void testEquals2() {
    organization2 = "SunOrg";
    testNonProfit2 = new NonProfit(organization2);
    assertNotEquals(testNonProfit, testNonProfit2);

    testNonProfit2 = new NonProfit(organization);
    testNonProfit2.donate(testOneTimeDonation2);
    testNonProfit.donate(testOneTimeDonation);
    assertNotEquals(testNonProfit, testNonProfit2);

    testNonProfit2 = new NonProfit(organization);
    testNonProfit2.donate(testOneTimeDonation);
    assertEquals(testNonProfit, testNonProfit2);
  }

  @Test
  public void testHashCode() {
    assertFalse(0 == testNonProfit.hashCode());
    testNonProfit2 = new NonProfit(organization);
    assertTrue(testNonProfit.equals(testNonProfit2) == (testNonProfit.hashCode()
        == testNonProfit2.hashCode()));

    int hash = testNonProfit.hashCode();
    assertEquals(hash, testNonProfit.hashCode());
  }

  @Test
  public void testToString() {
    String expectedString = "NonProfit{" +
        "organization='" + organization + '\'' +
        ", donationsSet=" + donationsSet +
        '}';

    assertEquals(expectedString, testNonProfit.toString());
  }


}