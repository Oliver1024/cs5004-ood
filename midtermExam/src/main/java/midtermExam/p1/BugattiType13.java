package midtermExam.p1;

public class BugattiType13 extends BrassEraAntiqueCar{

  public BugattiType13(String uniqueID, Integer age, Integer mileage,
      ConditionCategory conditionCategory, Double latestAskingPrice) {
    super(uniqueID, age, mileage, conditionCategory, latestAskingPrice);
  }

  @Override
  public Double estimatePrice() {
    return super.estimatePrice();
  }
}
