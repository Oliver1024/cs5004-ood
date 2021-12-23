package midtermExam.p1;

public abstract class VintageEraAntiqueCar extends AbstractAntiqueCars{

  private static final Integer MILES_LIMIT = 300000;
  private static final Double PLUS_AMOUNT = 50000.0;
  private static final Double PLUS_AMOUNT_ZERO = 0.0;

  public VintageEraAntiqueCar(String uniqueID, Integer age, Integer mileage,
      ConditionCategory conditionCategory, Double latestAskingPrice) {
    super(uniqueID, age, mileage, conditionCategory, latestAskingPrice);
  }

  @Override
  public Double estimatePrice() {
    return super.estimatePrice() + addExtraValue();
  }

  private Double addExtraValue(){
    if(this.mileage < MILES_LIMIT){
      return PLUS_AMOUNT;
    }
    return PLUS_AMOUNT_ZERO;
  }

}
