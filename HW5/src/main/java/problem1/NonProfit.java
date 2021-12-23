package problem1;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 *  Define a class
 */
public class NonProfit {
  private String organization;
  private Set<AbstractDonation> donationsSet = new HashSet<>();

  /**
   *  Constructor a new object.
   * @param organization String, organization
   */
  public NonProfit(String organization) {
    this.organization = organization;
  }

  /**
   * a method to take donation
   * @param donation AbstractDonation, donaiton
   */
  public void donate(AbstractDonation donation){
    this.donationsSet.add(donation);
  }

  /**
   * Return total donation for a year
   * @param year Integer, year
   * @return total donation for a year
   */
  public Integer getTotalDonationForYear(Integer year){
    Integer donationResult = 0;
    for(AbstractDonation donation : donationsSet){
      donationResult += donation.countDonationAmount(year);
    }
    return donationResult;
  }

  /**
   *  Return a set of donation
   * @return  a set of donation
   */
  public Set<AbstractDonation> getDonationsSet() {
    return donationsSet;
  }

  /**
   * Indicates whether some other object passed as an argument is "equal to" the
   *    * current instance
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
    NonProfit nonProfit = (NonProfit) o;
    return Objects.equals(organization, nonProfit.organization) && Objects
        .equals(getDonationsSet(), nonProfit.getDonationsSet());
  }

  /**
   * returns an integer representation of the object memory address
   * @return int, hashcode
   */
  @Override
  public int hashCode() {
    return Objects.hash(organization, getDonationsSet());
  }

  /**
   * returns an String representation of the object
   * @return String
   */
  @Override
  public String toString() {
    return "NonProfit{" +
        "organization='" + organization + '\'' +
        ", donationsSet=" + donationsSet +
        '}';
  }
}
