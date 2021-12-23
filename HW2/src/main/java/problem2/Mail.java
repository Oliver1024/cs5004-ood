package problem2;

/**
 * Mail is a simple object that has width, height, depth and recipient.
 */
public class Mail {

  private Integer width;
  private Integer height;
  private Integer depth;
  private Recipient recipient;

  /**
   * Constructor for a Mail. Const
   *
   * @param width     - Integer, width of a mail's width
   * @param height    - Integer, height of a mail's height
   * @param depth     - Integer, depth of a mail's depth
   * @param recipient - Integer, recipient of a mail's recipient
   */
  public Mail(Integer width, Integer height, Integer depth, Recipient recipient) {
    if (this.validateDimension(width, height, depth)) {
      this.width = width;
      this.height = height;
      this.depth = depth;
    } else {
      throw new IllegalArgumentException("Illegal Dimensions");
    }
    this.recipient = recipient;
  }

  /**
   * Return the width of mail
   * @return Integer, representing the width of mail
   */
  public Integer getWidth() {
    return width;
  }

  /**
   * Return the height of mail
   * @return Integer, representing the height of mail
   */
  public Integer getHeight() {
    return height;
  }

  /**
   * Return the depth of mail
   * @return Integer, representing the depth of mail
   */
  public Integer getDepth() {
    return depth;
  }

  /**
   * Return the recipient of mail
   * @return Recipient, representing the recipient of mail
   */
  public Recipient getRecipient() {
    return recipient;
  }

  /**
   * A helper function that used to validate if the dimension of mail is qualify a specific value.
   *
   * @param width  - Integer, width of mail
   * @param height - Integer, height of mail
   * @param depth  - Integer, depth of mail
   * @return a boolean value
   */
  private boolean validateDimension(Integer width, Integer height, Integer depth) {
    if (width >= 1 && height >= 1 && depth >= 1) {
      return true;
    } else {
      return false;
    }
  }
}
