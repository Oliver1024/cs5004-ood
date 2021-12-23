package midtermExam.p1;

public class CadillacV16 extends VintageEraAntiqueCar{

  public CadillacV16(String uniqueID, Integer age, Integer mileage,
      ConditionCategory conditionCategory, Double latestAskingPrice) {
    super(uniqueID, age, mileage, conditionCategory, latestAskingPrice);
  }

  @Override
  public Double estimatePrice() {
    return super.estimatePrice();
  }
}
