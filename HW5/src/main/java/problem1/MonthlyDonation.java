package problem1;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Represents a concrete class MonthlyDonation, extending its parent class Donation
 */
public class MonthlyDonation extends AbstractDonation {

  private Integer amount;
  private LocalDateTime donationDateTime;
  private LocalDateTime cancelDateTime;
  private static final Integer TOTAL_MONTH_YEAR = 12;

  /**
   * Constructs a new MonthlyAmount, with amount and donationDateTime
   * @param amount - Integer, amount of monthly donation
   * @param donationDateTime - LocalDateTime, time of monthly donationDateTime
   * @throws IllegalArgumentException  throw exception when condition is matched
   */
  public MonthlyDonation(Integer amount, LocalDateTime donationDateTime)
      throws IllegalArgumentException {
    if (this.validateAmount(amount)) {
      this.amount = amount;
    } else {
      throw new IllegalArgumentException("Illegal amount");
    }
    this.donationDateTime = donationDateTime;
    this.cancelDateTime = null;
  }

  /**
   * Return amount
   * @return amount
   */
  public Integer getAmount() {
    return amount;
  }

  /**
   * Return donation time and date
   * @return donation time and date
   */
  public LocalDateTime getDonationDateTime() {
    return donationDateTime;
  }

  /**
   * Return cancel date and time
   * @return cancel date and time
   */
  public LocalDateTime getCancelDateTime() {
    return cancelDateTime;
  }

  /**
   * Set cancel date and time and check if it is legal and valid
   * @param cancelDateTime LocalDateTime, taking this parameter
   * @throws IllegalArgumentException throw exception when condition is matched.
   */
  public void setCancelDateTime(LocalDateTime cancelDateTime) throws IllegalArgumentException {
    if (cancelDateTime.isAfter(donationDateTime)) {
      this.cancelDateTime = cancelDateTime;
    } else {
      throw new IllegalArgumentException("Illegal cancel date time");
    }
  }

  /**
   * return boolean value
   * @param amount Integer, taking this parameter
   * @return boolean value
   */
  private boolean validateAmount(Integer amount) {
    return amount >= 0;
  }

  /**
   * Count each year of donation amount
   * @param year Integer, taking this parater
   * @return total donation amount
   */
  @Override
  public Integer countDonationAmount(Integer year) {
    return countCheckedMonths(year) * amount;
  }

  /**
   * Count total numbers of month for a period time
   * @param targetYear Integer, taking this parameter
   * @return total numbers of months
   */
  private Integer countCheckedMonths(Integer targetYear){
    Integer result = 0;
    if(donationDateTime.getYear() < targetYear) result -= 0;
    else if(donationDateTime.getYear() == targetYear) result -= donationDateTime.getMonthValue()-1;
    else result -= TOTAL_MONTH_YEAR;

    if(cancelDateTime == null || cancelDateTime.getYear() > targetYear){
      result += TOTAL_MONTH_YEAR;
    }else if(cancelDateTime.getYear() == targetYear){
      result += cancelDateTime.getMonthValue();
      result -= isChargedFeeForLastMonth() ? 0 : 1;
    }else
      result += 0;

    return result;
  }

  /**
   * Get the charged fee for last month
   * @return a boolean value
   */
  private boolean isChargedFeeForLastMonth(){
    if(cancelDateTime.getDayOfMonth() > donationDateTime.getDayOfMonth()) return true;
    else if(cancelDateTime.getDayOfMonth() < donationDateTime.getDayOfMonth()) return false;
    else{
      if(cancelDateTime.getHour() > donationDateTime.getHour()) return true;
      else if(cancelDateTime.getHour() < donationDateTime.getHour()) return false;
      else{
        if(cancelDateTime.getMinute() > donationDateTime.getMinute()) return true;
        else if(cancelDateTime.getMinute() < donationDateTime.getMinute()) return false;
        else {
          if(cancelDateTime.getSecond() >= donationDateTime.getSecond()) return true;
          else return false;
        }
      }
    }
  }

  /**
   * Indicates whether some other object passed as an argument is "equal to" the
   *    * current instance
   * @param o - an object to compare
   * @return boolean value
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonthlyDonation that = (MonthlyDonation) o;
    return Objects.equals(getAmount(), that.getAmount()) && Objects
        .equals(getDonationDateTime(), that.getDonationDateTime()) && Objects
        .equals(getCancelDateTime(), that.getCancelDateTime());
  }

  /**
   * returns an integer representation of the object memory address
   * @return int, hash code
   */
  @Override
  public int hashCode() {
    return Objects.hash(getAmount(), getDonationDateTime(), getCancelDateTime());
  }

  /**
   * Returns an String representation of the object
   * @return String
   */
  @Override
  public String toString() {
    return "MonthlyDonation{" +
        "amount=" + amount +
        ", donationDateTime=" + donationDateTime +
        ", cancelDateTime=" + cancelDateTime +
        '}';
  }
}