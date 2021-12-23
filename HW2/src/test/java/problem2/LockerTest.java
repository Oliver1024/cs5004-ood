package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LockerTest {
  private Locker testLocker;
  private Locker testLocker2;
  private Integer maxWidth;
  private Integer maxHeight;
  private Integer maxDepth;
  private Integer maxWidth2;
  private Integer maxHeight2;
  private Integer maxDepth2;
  private Integer maxWidth3;
  private Integer maxHeight3;
  private Integer maxDepth3;
  private Integer maxWidth4;
  private Integer maxHeight4;
  private Integer maxDepth4;
  private Integer maxWidth5;
  private Integer maxHeight5;
  private Integer maxDepth5;
  private Integer largeMailWidth;
  private Integer largeMailHeight;
  private Integer largeMailDepth;
  private Mail testMail;
  private Mail testMail2;
  private Mail testMail3;
  private Mail testMail4;
  private Mail testMail5;
  private Mail largeTestMail;
  private Recipient testRecipient;
  private String firstName;
  private String lastName;
  private String emailAddress;

  @Before
  public void setUp() throws Exception {
    maxWidth = 6;
    maxHeight = 7;
    maxDepth = 8;

    maxWidth2 = 9;
    maxHeight2 = 7;
    maxDepth2 = 8;

    maxWidth3 = 6;
    maxHeight3 = 10;
    maxDepth3 = 8;

    maxWidth4 = 6;
    maxHeight4 = 7;
    maxDepth4 = 12;

    maxWidth5 = 5;
    maxHeight5 = 6;
    maxDepth5 = 7;

    largeMailWidth = 10;
    largeMailHeight = 20;
    largeMailDepth = 30;
    firstName = "Lee";
    lastName = "Kim";
    emailAddress = "apple@example.com";
    testRecipient = new Recipient(firstName, lastName, emailAddress);
    testMail = new Mail(maxWidth, maxHeight, maxDepth, testRecipient);
    testMail2 = new Mail(maxWidth2, maxHeight2, maxDepth2, testRecipient);
    testMail3 = new Mail(maxWidth3, maxHeight3, maxDepth3, testRecipient);
    testMail4 = new Mail(maxWidth4, maxHeight4, maxDepth4, testRecipient);
    testMail5 = new Mail(maxWidth5, maxHeight5, maxDepth5, testRecipient);
    testLocker = new Locker(maxWidth, maxHeight,maxDepth);
    testLocker2 = new Locker(maxWidth2, maxHeight2, maxDepth2);
    largeTestMail = new Mail(largeMailWidth, largeMailHeight, largeMailDepth, testRecipient);
  }

  @Test
  public void getMaxWidth() {
    assertEquals(maxWidth, testLocker.getMaxWidth());
  }

  @Test
  public void getMaxHeight() {
    assertEquals(maxHeight, testLocker.getMaxHeight());
  }

  @Test
  public void getMaxDepth() {
    assertEquals(maxDepth, testLocker.getMaxDepth());
  }

  @Test
  public void getMail() throws LockerOccupiedException, MailSizeToLargeException {
    testLocker.addMail(testMail);
    assertEquals(testMail, testLocker.getMail());
  }

  @Test
  public void setMail() {
    testLocker.setMail(testMail2);
    assertEquals(testLocker.getMail(), testMail2);
  }

  @Test
  public void pickupMail()
      throws LockerOccupiedException, MailSizeToLargeException,
      LockerEmptyException, RecipientNotMatchException {
    testLocker.addMail(testMail);
    testLocker.pickupMail(testRecipient);
    assertNull(testLocker.getMail());
  }

  @Test(expected = RecipientNotMatchException.class)
  public void testRecipientNotMatchException()
      throws LockerEmptyException, RecipientNotMatchException,
      LockerOccupiedException, MailSizeToLargeException {

    Recipient expectedRecipient = new Recipient("Jim", "Lily",
        "lewis@org");
    testLocker.addMail(testMail);
    testLocker.pickupMail(expectedRecipient);
  }

  @Test(expected = LockerEmptyException.class)
  public void testLockerEmptyException()
      throws LockerEmptyException, RecipientNotMatchException
  {
    Recipient expectedRecipient = new Recipient("Jim", "Lily",
        "lewis@org");
    testLocker.pickupMail(expectedRecipient);
  }

  @Test(expected = LockerOccupiedException.class)
  public void lockerOccupiedException()
      throws LockerOccupiedException,
      MailSizeToLargeException {
    testLocker.addMail(testMail);
    testLocker.addMail(testMail);
  }

  @Test(expected = MailSizeToLargeException.class)
  public void mailSizeToLargeException()
      throws LockerOccupiedException,
      MailSizeToLargeException {

    testLocker.addMail(largeTestMail);
  }

  @Test(expected = MailSizeToLargeException.class)
  public void testInvalidWidth() throws MailSizeToLargeException, LockerOccupiedException {
    testLocker.addMail(testMail3);
  }

  @Test(expected = MailSizeToLargeException.class)
  public void testInvalidDepth() throws MailSizeToLargeException, LockerOccupiedException {
    testLocker.addMail(testMail4);
  }

  @Test(expected = MailSizeToLargeException.class)
  public void testInvalidHeight() throws MailSizeToLargeException, LockerOccupiedException {
    testLocker.addMail(testMail2);
  }

  @Test
  public void addMail() throws LockerOccupiedException, MailSizeToLargeException {
    testLocker.addMail(testMail5);
    assertEquals(testLocker.getMail(), testMail5);
  }

  @Test
  public void equalsReflexivity() {
    assertTrue(testLocker.equals(testLocker));
  }

  @Test
  public void equalsReflexivity2() {
    assertFalse(testLocker.equals(testLocker2));
    assertNotEquals(testLocker,null);
  }

  @Test
  public void equalsDifferentDataTypes(){
    assertFalse(testLocker.equals(maxHeight));
    assertFalse(testLocker.equals(maxDepth));
  }

  @Test
  public void equalsSameFields(){
    testLocker2 = new Locker(maxWidth, maxHeight,maxDepth);
    assertTrue(testLocker.equals(testLocker2));
  }

  @Test
  public void equalNotSameWidth() {
    assertFalse(testLocker.equals(testLocker2));
  }

  @Test
  public void equalNotSameHeight() {
    Locker testLocker3 = new Locker(maxWidth3, maxHeight3, maxDepth3);
    assertFalse(testLocker.equals(testLocker3));
  }

  @Test
  public void equalNotSameDepth() {
    Locker testLocker4 = new Locker(maxWidth4, maxHeight4, maxDepth4);
    assertFalse(testLocker.equals(testLocker4));
  }

  @Test
  public void equalNotSameMail() throws LockerOccupiedException, MailSizeToLargeException {
    Locker testLocker6 = new Locker(maxWidth, maxHeight,maxDepth);
    testLocker6.addMail(testMail);
    assertFalse(testLocker.equals(testLocker6));
  }

  @Test
  public void testHashCodeNull() {
    assertFalse(0 == testLocker.hashCode());
  }

  @Test
  public void testHashCodeEquality() {
    testLocker2 = new Locker(maxWidth, maxHeight,maxDepth);;
    assertTrue(testLocker.equals(testLocker2) == (testLocker.hashCode()
        == testLocker2.hashCode()));
  }

  @Test
  public void testHashCodeConsistency() {
    int hash = testLocker.hashCode();
    assertEquals(hash, testLocker.hashCode());
  }

  @Test
  public void testToString() throws LockerOccupiedException, MailSizeToLargeException {
    testLocker.addMail(testMail);
    String expectedString ="Locker{" +
        "maxWidth=" + maxWidth +
        ", maxHeight=" + maxHeight +
        ", maxDepth=" + maxDepth +
        ", mail=" + testMail +
        '}';
    assertEquals(expectedString, testLocker.toString());
  }

  @Test(expected = IllegalArgumentException.class)
  public void illegalWidth() throws IllegalArgumentException {
    Locker testLocker = new Locker(0,1,3);
  }

  @Test(expected = IllegalArgumentException.class)
  public void illegalHeight() throws IllegalArgumentException {
    Locker testLocker = new Locker(2,0,3);
  }

  @Test(expected = IllegalArgumentException.class)
  public void illegalDepth() throws IllegalArgumentException {
    Locker testLocker = new Locker(3,1,0);
  }

  @Test(expected = IllegalArgumentException.class)
  public void allIllegalDimensions() throws IllegalArgumentException {
    Locker testLocker = new Locker(0,0,0);
  }
}