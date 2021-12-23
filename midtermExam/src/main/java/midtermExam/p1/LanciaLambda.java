package midtermExam.p1;

public class LanciaLambda extends VintageEraAntiqueCar{

  public LanciaLambda(String uniqueID, Integer age, Integer mileage,
      ConditionCategory conditionCategory, Double latestAskingPrice) {
    super(uniqueID, age, mileage, conditionCategory, latestAskingPrice);
  }

  @Override
  public Double estimatePrice() {
    return super.estimatePrice();
  }
}
