package problem1;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Represents a concrete class Pledge, extending its parent class AbstractDonation
 */
public class Pledges extends AbstractDonation {
  private Integer amount;
  private LocalDateTime createDateTime;
  private LocalDateTime processingDateTime;

  /**
   * Constructs a new Pledge, with amount, createDateTime, and processingDateTime
   * @param amount - Integer,the amount of donation
   * @param createDateTime - LocalDateTime, time when pledge is created
   * @param processingDateTime - LocalDateTime time when pledge is processed
   * @throws IllegalArgumentException throw exception when condition is matched.
   */
  public Pledges(Integer amount, LocalDateTime createDateTime,
      LocalDateTime processingDateTime) throws IllegalArgumentException{
    if(this.validateAmount(amount)){
      this.amount = amount;
    }else {
      throw new IllegalArgumentException("Illegal amount");
    }
    this.createDateTime = createDateTime;
    this.processingDateTime = this.setProcessingDateTime(processingDateTime);
  }

  /**
   * Constructs a new Pledge, with creationTime and amount
   * @param amount - Integer, the amount of donation
   * @param createDateTime - LocalDateTime, time when pledge is created
   */
  public Pledges(Integer amount, LocalDateTime createDateTime) {
    if(this.validateAmount(amount)){
      this.amount = amount;
    }else {
      throw new IllegalArgumentException("Illegal amount");
    }
    this.createDateTime = createDateTime;
    this.processingDateTime = null;
  }

  /**
   * Return amount
   * @return Integer, amount
   */
  public Integer getAmount() {
    return amount;
  }

  /**
   * Return create date and time
   * @return create date and time
   */
  public LocalDateTime getCreateDateTime() {
    return createDateTime;
  }

  /**
   * Return processing time and date
   * @return processing time and date
   */
  public LocalDateTime getProcessingDateTime() {
    return processingDateTime;
  }

  /**
   * Return validate processing date and time
   * @param processingDateTime LocalDateTime, taking this parameter
   * @return validate processing date and time
   * @throws IllegalArgumentException throw exception when condition is matched
   */
  private LocalDateTime setProcessingDateTime(LocalDateTime processingDateTime)
      throws IllegalArgumentException{
    if(processingDateTime.isAfter(createDateTime)){
      return this.processingDateTime = processingDateTime;
    }else{
      throw new IllegalArgumentException("Illegal processing date time");
    }
  }

  /**
   * Return validate amount
   * @param amount Integer, amount
   * @return validate amount
   */
  private boolean validateAmount(Integer amount){
    return amount >= 0;
  }

  /**
   * Return count donation amount for a year
   * @param year Integer, year
   * @return count donation amount for a year
   */
  @Override
  public Integer countDonationAmount(Integer year) {
    if(this.processingDateTime == null || this.processingDateTime.getYear() != year) return 0;
    return amount;
  }

  /**
   * Indicates whether some other object passed as an argument is "equal to" the
   * current instance
   * @param o object
   * @return boolean
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pledges pledges = (Pledges) o;
    return Objects.equals(getAmount(), pledges.getAmount()) && Objects
        .equals(getCreateDateTime(), pledges.getCreateDateTime()) && Objects
        .equals(getProcessingDateTime(), pledges.getProcessingDateTime());
  }

  /**
   * returns an integer representation of the object memory address
   * @return an integer representation of the object memory address
   */
  @Override
  public int hashCode() {
    return Objects.hash(getAmount(), getCreateDateTime(), getProcessingDateTime());
  }

  /**
   *  returns an String representation of the object
   * @return String
   */
  @Override
  public String toString() {
    return "Pledges{" +
        "amount=" + amount +
        ", createDateTime=" + createDateTime +
        ", processingDateTime=" + processingDateTime +
        '}';
  }
}
