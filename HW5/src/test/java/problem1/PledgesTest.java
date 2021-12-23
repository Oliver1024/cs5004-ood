package problem1;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import org.junit.Before;
import org.junit.Test;

public class PledgesTest {
  private LocalDateTime createDateTime;
  private Integer amount;
  private Integer amount2;
  private LocalDateTime processingDateTime;
  private LocalDateTime processingDateTime2;
  private Pledges testPledge;
  private Pledges testPledge2;

  @Before
  public void setUp() throws Exception {
    createDateTime = LocalDateTime.of(2020,01,01,01,01,01);
    processingDateTime = LocalDateTime.of(2025,02,02,
        02,02,02);
    processingDateTime2 = LocalDateTime.of(2019,02,02,
        02,02,02);
    amount = 100;
    amount2 = -1;
    testPledge = new Pledges(amount,createDateTime,processingDateTime);
    testPledge2 = new Pledges(amount,createDateTime);
  }

  @Test
  public void getAmount() {
    assertEquals(testPledge.getAmount(),100,0);

  }

  @Test
  public void getCreateDateTime() {
    assertEquals(testPledge.getCreateDateTime(),createDateTime);
  }

  @Test
  public void getProcessingDateTime() {
    assertEquals(testPledge.getProcessingDateTime(),processingDateTime);
  }


  @Test
  public void countDonationAmount() {
    assertEquals(testPledge.countDonationAmount(2021),0,0);
    assertEquals(testPledge2.countDonationAmount(2021),0,0);
    assertEquals(testPledge.countDonationAmount(2025),100,0);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testInvalidAmount() throws IllegalArgumentException{
    testPledge = new Pledges(amount2,createDateTime,processingDateTime);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testInvalidAmount2() throws IllegalArgumentException{
    testPledge2 = new Pledges(amount2,createDateTime);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testInvalidProcessingTime() throws IllegalArgumentException{
    testPledge = new Pledges(amount,createDateTime,processingDateTime2);
  }

  @Test
  public void testEquals() {
    assertEquals(testPledge, testPledge);
    assertNotEquals(null, testPledge);
    assertFalse(testPledge.equals(createDateTime));
    assertNotEquals(testPledge, testPledge2);
  }

  @Test
  public void testEquals2() {
    createDateTime = LocalDateTime.of(2010, 1, 1,
        1, 1, 2);
    amount = 100;
    testPledge2 = new Pledges(amount,createDateTime);
    assertNotEquals(testPledge, testPledge2);

    createDateTime = LocalDateTime.of(2010, 1, 1,
        1, 1, 1);
    amount = 110;
    testPledge2 = new Pledges(amount,createDateTime);
    assertNotEquals(testPledge, testPledge2);
  }

  @Test
  public void testToString() {
    String expectedString = "Pledges{" +
        "amount=" + amount +
        ", createDateTime=" + createDateTime +
        ", processingDateTime=" + processingDateTime +
        '}';
    assertEquals(expectedString, testPledge.toString());
  }
}