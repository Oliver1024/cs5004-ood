package problem2;

import java.util.Objects;

/**
 * Locker is a simple object that has maxWidth,maxHeight,maxDepth and mail.
 */
public class Locker {

  private Integer maxWidth;
  private Integer maxHeight;
  private Integer maxDepth;
  private Mail mail = null;

  /**
   * Constructor that creates a new Locker object with maxWidth,maxHeight,maxDepth and mail.
   *
   * @param maxWidth  - Integer, maxHeight of the new Locker object
   * @param maxHeight - Integer, of the new Locker object
   * @param maxDepth  - Integer, of the new Locker object
   */
  public Locker(Integer maxWidth, Integer maxHeight, Integer maxDepth) {
    if (this.validateDimension(maxWidth, maxHeight, maxDepth)) {
      this.maxWidth = maxWidth;
      this.maxHeight = maxHeight;
      this.maxDepth = maxDepth;
    } else {
      throw new IllegalArgumentException("Illegal Dimensions");
    }
  }

  /**
   * Get the max width of the locker
   * @return Integer, representing the maxWidth
   */
  public Integer getMaxWidth() {
    return maxWidth;
  }

  /**
   * Get the max height of the locker
   * @return Integer, representing maxHeight
   */
  public Integer getMaxHeight() {
    return maxHeight;
  }

  /**
   * Get the max depth of the locker
   * @return Integer, representing maxDepth
   */
  public Integer getMaxDepth() {
    return maxDepth;
  }

  /**
   * Get mail of the locker
   * @return String, representing mail
   */
  public Mail getMail() {
    return mail;
  }

  /**
   * Set the mail of the locker
   * @param mail, - Mail, set the mail
   */
  public void setMail(Mail mail) {
    this.mail = mail;
  }

  /**
   * A helper function that used to validate each dimension of locker
   *
   * @param maxWidth, - Integer, take maxWidth as a parameter
   * @param maxHeight - Integer, take maxHeight as a parameter
   * @param maxDepth  - Integer, take maxDepth as a parameter
   * @return a true or false if the dimension is greater or equal than 1
   */
  private boolean validateDimension(Integer maxWidth, Integer maxHeight, Integer maxDepth) {
    if (maxWidth >= 1 && maxHeight >= 1 && maxDepth >= 1) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * A addMail method that pass the mail if the mail is matched those conditions.
   * @param mail - Mail, take Mail as a parameter passing in this method
   * @throws LockerOccupiedException throw LockerOccupiedException if the condition is not matched
   * @throws MailSizeToLargeException throw MailSizeToLargeException if the condition
   * is not matched
   */
  public void addMail(Mail mail) throws LockerOccupiedException, MailSizeToLargeException {
    if (!this.checkLocker()) {
      throw new LockerOccupiedException();
    } else if (!this.checkLockerAndMailMatch(mail)) {
      throw new MailSizeToLargeException();
    } else {
      this.mail = mail;
    }
  }

  /**
   * A pickupMail that return the validated mail if those conditions are matched.
   * @param recipient - Recipient, take Recipient as a parameter passing in this method
   * @return a validated mail if the condition is reached
   * @throws RecipientNotMatchException throw RecipientNotMatchException
   * if condition is not matched
   * @throws LockerEmptyException throw LockerEmptyException if condition is not matched
   */
  public Mail pickupMail(Recipient recipient) throws RecipientNotMatchException,
      LockerEmptyException {
    if (!this.checkLocker()) {
      if (this.mail.getRecipient().equals(recipient)) {
        Mail mailRemove;
        mailRemove = this.mail;
        this.mail = null;
        return mailRemove;
      } else {
        throw new RecipientNotMatchException();
      }
    } else {
      throw new LockerEmptyException();
    }
  }

  /**
   * A helper function that checks if the locker is empty or not.
   * @return a boolean value to check if the lock is empty or not
   */
  private boolean checkLocker() {
    if (this.mail == null) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * A helper function that used to check if the mail recipient is matched.
   * @param mail - Mail, taking mail as a parameter to pass in this method
   * @return a boolean value to check if the dimension of mail less than or equal max dimension of
   * locker
   */
  private boolean checkLockerAndMailMatch(Mail mail) {
    if (mail.getHeight() <= this.maxHeight && mail.getDepth() <= this.maxDepth &&
        mail.getWidth() <= this.maxWidth) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * {@inheritDoc}
   * a method provided by java.lang.Object that indicates whether some other object
   * passed as an argument is "equal to" the current instance.
   * @param o - Object, take object as a parameter to pass in equals
   * @return a boolean value after compare with those two objects if they are equal or not
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Locker locker = (Locker) o;
    return Objects.equals(getMaxWidth(), locker.getMaxWidth()) && Objects
        .equals(getMaxHeight(), locker.getMaxHeight()) && Objects
        .equals(maxDepth, locker.maxDepth) && Objects.equals(getMail(), locker.getMail());
  }


  /**
   * {@inheritDoc}
   * Return a hash code value of those dimensions of locker
   * @return a hash code value of those dimension of locker
   */
  @Override
  public int hashCode() {
    return Objects.hash(getMaxWidth(), getMaxHeight(), maxDepth, getMail());
  }

  /**
   * Returns the value given to it in string format
   * @return Returns the value given to it in string format
   */
  @Override
  public String toString() {
    return "Locker{" +
        "maxWidth=" + maxWidth +
        ", maxHeight=" + maxHeight +
        ", maxDepth=" + maxDepth +
        ", mail=" + mail +
        '}';
  }
}
