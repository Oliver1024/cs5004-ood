package midtermExam.p1;

import java.util.Objects;

public abstract class AbstractAntiqueCars implements IAntiqueCars{

  private static final Double FACTOR = 3.2;
  private static final Double PERFECT_FACTOR = 2.15;
  private static final Double DEFAULT_FACTOR = 1.0;

  protected String uniqueID;
  protected Integer age;
  protected Integer mileage;
  protected ConditionCategory conditionCategory;
  protected Double latestAskingPrice;

  public AbstractAntiqueCars(String uniqueID, Integer age, Integer mileage,
      ConditionCategory conditionCategory, Double latestAskingPrice) {
    this.uniqueID = uniqueID;
    this.age = age;
    this.mileage = mileage;
    this.conditionCategory = conditionCategory;
    this.latestAskingPrice = latestAskingPrice;
  }

  public String getUniqueID() {
    return uniqueID;
  }

  public Integer getAge() {
    return age;
  }

  public Integer getMileage() {
    return mileage;
  }

  public ConditionCategory getConditionCategory() {
    return conditionCategory;
  }

  public Double getLatestAskingPrice() {
    return latestAskingPrice;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractAntiqueCars that = (AbstractAntiqueCars) o;
    return Objects.equals(getUniqueID(), that.getUniqueID()) && Objects
        .equals(getAge(), that.getAge()) && Objects.equals(getMileage(), that.getMileage())
        && getConditionCategory() == that.getConditionCategory() && Objects
        .equals(getLatestAskingPrice(), that.getLatestAskingPrice());
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(getUniqueID(), getAge(), getMileage(), getConditionCategory(),
            getLatestAskingPrice());
  }

  @Override
  public String toString() {
    return "AbstractAntiqueCars{" +
        "uniqueID='" + uniqueID + '\'' +
        ", age=" + age +
        ", mileage=" + mileage +
        ", conditionCategory=" + conditionCategory +
        ", latestAskingPrice=" + latestAskingPrice +
        '}';
  }

  @Override
  public Double estimatePrice() {
    return this.latestAskingPrice * FACTOR * addExtraValue();
  }


  private Double addExtraValue(){
    if(this.conditionCategory.equals(ConditionCategory.PERFECT))
      return PERFECT_FACTOR;
    return DEFAULT_FACTOR;
  }

}
