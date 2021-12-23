package midtermExam.p1;

public class FordModelA extends VintageEraAntiqueCar{

  public FordModelA(String uniqueID, Integer age, Integer mileage,
      ConditionCategory conditionCategory, Double latestAskingPrice) {
    super(uniqueID, age, mileage, conditionCategory, latestAskingPrice);
  }

  @Override
  public Double estimatePrice() {
    return super.estimatePrice();
  }
}
