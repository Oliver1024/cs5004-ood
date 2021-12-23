package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RecipientTest {
  private Recipient testRecipient;
  private String firstName;
  private String lastName;
  private String emailAddress;

  @Before
  public void setUp() throws Exception {
    firstName = "York";
    lastName = "Tim";
    emailAddress = "example@example.com";

    testRecipient = new Recipient(firstName, lastName, emailAddress);
  }

  @Test
  public void getFirstName() {
    assertEquals(firstName, testRecipient.getFirstName());
  }

  @Test
  public void getLastName() {
    assertEquals(lastName, testRecipient.getLastName());
  }

  @Test
  public void getEmailAddress() {
    assertEquals(emailAddress, testRecipient.getEmailAddress());
  }
}