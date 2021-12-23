package problem1;

import java.time.LocalDateTime;
import java.util.Objects;


/**
 * Define a class.
 */
public class OneTimeDonation extends AbstractDonation{
  private Integer amount;
  private LocalDateTime donationDateTime;


  /**
   * Constructor a new object.
   * @param amount - Integer, amount
   * @param donationDateTime - LocalDateTime
   * @throws IllegalArgumentException throw exception
   */
  public OneTimeDonation(Integer amount, LocalDateTime donationDateTime)
      throws IllegalArgumentException {
    if(this.validateAmount(amount)){
      this.amount = amount;
    }else {
      throw new IllegalArgumentException("Illegal amount");
    }
    this.donationDateTime = donationDateTime;
  }

  /**
   * Return amount
   * @return amount
   */
  public Integer getAmount() {
    return amount;
  }

  /**
   *  Return donation date and time
   * @return donation date and time
   */
  public LocalDateTime getDonationDateTime() {
    return donationDateTime;
  }

  /**
   *  Count donation amount
   * @param year Integer, year
   * @return donation amount
   */
  @Override
  public Integer countDonationAmount(Integer year) {
    if(this.donationDateTime.getYear() == year){
      return this.amount;
    }
    return 0;
  }

  /**
   * Check valid amount
   * @param amount Integer, amount
   * @return boolean
   */
  private boolean validateAmount(Integer amount){
    return amount >= 0;
  }

  /**
   *  indicates whether some other object passed as an argument is "equal to" the
   *  current instance
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
    OneTimeDonation that = (OneTimeDonation) o;
    return Objects.equals(getAmount(), that.getAmount()) && Objects
        .equals(getDonationDateTime(), that.getDonationDateTime());
  }

  /**
   * hashcode
   * @return int
   */
  @Override
  public int hashCode() {
    return Objects.hash(getAmount(), getDonationDateTime());
  }

  /**
   * Return String
   * @return string
   */
  @Override
  public String toString() {
    return "OneTimeDonation{" +
        "amount=" + amount +
        ", donationDateTime=" + donationDateTime +
        '}';
  }

}
