package midtermExam.p2;

public class EmptyNationalPark implements INationalParkDirectorySystem{
  private static final int HASH_CODE = 31;

  @Override
  public Boolean isEmpty() {
    return true;
  }

  @Override
  public Integer size() {
    return 0;
  }


  @Override
  public INationalParkDirectorySystem add(NationalPark nationalPark) {
    return new ConsNationalPark(nationalPark, this);
  }


  @Override
  public INationalParkDirectorySystem remove(NationalPark nationalPark)
      throws NationalParkNotFoundException {
    throw new NationalParkNotFoundException("Can't remove national park from empty list");
  }

  @Override
  public Boolean contains(NationalPark nationalPark) {
    return false;
  }

  @Override
  public INationalParkDirectorySystem findAllInSameState(String state) {
    return this;
  }

  @Override
  public INationalParkDirectorySystem findAllOpenYearRound() {
    return this;
  }

  @Override
  public NationalPark getSpecifiedNationalPark(String nationalParkID)
      throws InvalidNationalParkIDException {
    throw new InvalidNationalParkIDException("Can't get national park from empty list");
  }

  @Override
  public int hashCode() {
    return EmptyNationalPark.HASH_CODE;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (!(obj instanceof EmptyNationalPark)) {
      return false;
    }

    return true;
  }

  @Override
  public String toString() {
    return "EmptyNationalPark{}";
  }
}
