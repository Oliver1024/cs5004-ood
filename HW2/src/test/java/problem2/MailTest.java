package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MailTest {
  private Mail testMail;
  private Mail testMail2;
  private Mail testMail3;
  private Mail testMail4;
  private Mail testMail5;
  private Recipient testRecipient;
  private Integer width;
  private Integer height;
  private Integer depth;


  @Before
  public void setUp() throws Exception {
    testRecipient = new Recipient("Tim", "Cook", "Tim@apple.com");
    width = 5;
    height = 6;
    depth = 7;

    testMail = new Mail(width, height, depth, testRecipient);
  }

  @Test
  public void getWidth() {
    assertEquals(width, testMail.getWidth());
  }

  @Test
  public void getHeight() {
    assertEquals(height, testMail.getHeight());
  }

  @Test
  public void getDepth() {
    assertEquals(depth, testMail.getDepth());
  }

  @Test
  public void getRecipient() {
    assertEquals(testRecipient.getFirstName(), testMail.getRecipient().getFirstName());
    assertEquals(testRecipient.getLastName(), testMail.getRecipient().getLastName());
    assertEquals(testRecipient.getEmailAddress(), testMail.getRecipient().getEmailAddress());
  }

  @Test(expected = IllegalArgumentException.class)
  public void illegalWidth() throws IllegalArgumentException {
    testMail2 = new Mail(0,2,5, testRecipient);

  }

  @Test(expected = IllegalArgumentException.class)
  public void illegalHeight() throws IllegalArgumentException {
    testMail3 = new Mail(2,0,5, testRecipient);
  }

  @Test(expected = IllegalArgumentException.class)
  public void illegalDepth() throws IllegalArgumentException {
    testMail4 = new Mail(5,3,0, testRecipient);
  }

  @Test(expected = IllegalArgumentException.class)
  public void allIllegalDimensions() throws IllegalArgumentException {
    testMail5 = new Mail(0,0,0, testRecipient);
  }
}
