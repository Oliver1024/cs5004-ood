package midtermExam.p1;

public abstract class VeteranEraAntiqueCar extends AbstractAntiqueCars{
  private static final Double EXCELLENT_OR_PERFECT_FACTOR = 1.7;
  private static final Double DEFAULT_FACTOR = 1.0;

  public VeteranEraAntiqueCar(String uniqueID, Integer age, Integer mileage,
      ConditionCategory conditionCategory, Double latestAskingPrice) {
    super(uniqueID, age, mileage, conditionCategory, latestAskingPrice);
  }

  @Override
  public Double estimatePrice() {
    return super.estimatePrice() * addExtraValue();
  }

  private Double addExtraValue(){
    switch (this.conditionCategory){
      case EXCELLENT:
      case PERFECT:
        return EXCELLENT_OR_PERFECT_FACTOR;
      default:
        return DEFAULT_FACTOR;
    }
  }
}
