package midtermExam.p1;

public class FordMotorT extends BrassEraAntiqueCar{
  private static final Integer MILES_LIMIT = 500000;
  private static final Double EXTRA_AMOUNT_ZERO = 0.0;
  private static final Double EXTRA_AMOUNT = 225000.0;


  public FordMotorT(String uniqueID, Integer age, Integer mileage,
      ConditionCategory conditionCategory, Double latestAskingPrice) {
    super(uniqueID, age, mileage, conditionCategory, latestAskingPrice);
  }

  @Override
  public Double estimatePrice() {
    return super.estimatePrice() + addExtraAmount();
  }

  private Double addExtraAmount(){
    if (this.conditionCategory == ConditionCategory.EXCELLENT) {
      if (this.mileage < MILES_LIMIT) {
        return EXTRA_AMOUNT;
      }
    }
    return EXTRA_AMOUNT_ZERO;
  }
}
