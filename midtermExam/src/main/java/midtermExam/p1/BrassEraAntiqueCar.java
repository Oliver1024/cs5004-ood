package midtermExam.p1;

public abstract class BrassEraAntiqueCar extends AbstractAntiqueCars{
  private static final Double PLUS_AMOUNT = 125000.0;
  private static final Double PLUS_AMOUNT_ZERO = 0.0;

  public BrassEraAntiqueCar(String uniqueID, Integer age, Integer mileage,
      ConditionCategory conditionCategory, Double latestAskingPrice) {
    super(uniqueID, age, mileage, conditionCategory, latestAskingPrice);
  }

  @Override
  public Double estimatePrice() {
    return super.estimatePrice() + addExtraAmount();
  }


  private Double addExtraAmount(){
    switch (this.conditionCategory){
      case PERFECT:
      case EXCELLENT:
      case FINE:
        return PLUS_AMOUNT;
      default:
        return PLUS_AMOUNT_ZERO;
    }
  }
}
