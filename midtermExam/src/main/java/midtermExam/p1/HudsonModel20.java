package midtermExam.p1;

public class HudsonModel20 extends BrassEraAntiqueCar{

  public HudsonModel20(String uniqueID, Integer age, Integer mileage,
      ConditionCategory conditionCategory, Double latestAskingPrice) {
    super(uniqueID, age, mileage, conditionCategory, latestAskingPrice);
  }

  @Override
  public Double estimatePrice() {
    return super.estimatePrice();
  }
}
