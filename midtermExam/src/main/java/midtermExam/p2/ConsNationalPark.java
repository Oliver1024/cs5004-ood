package midtermExam.p2;

import java.util.Objects;

public class ConsNationalPark implements INationalParkDirectorySystem{

  private static final int HASH_CODE = 37;
  private NationalPark first;
  private INationalParkDirectorySystem rest;

  public ConsNationalPark(NationalPark first, INationalParkDirectorySystem rest) {
    this.first = first;
    this.rest = rest;
  }

  @Override
  public Boolean isEmpty() {
    return false;
  }

  @Override
  public Integer size() {
    return 1 + rest.size();
  }


  @Override
  public INationalParkDirectorySystem add(NationalPark nationalPark) {
    if (this.first.equals(nationalPark)) return this;
    if(this.first.getNationalParkID().equals(nationalPark.getNationalParkID())){
      return new ConsNationalPark(nationalPark,this.rest);
    }
    return new ConsNationalPark(this.first,this.rest.add(nationalPark));
  }



  @Override
  public INationalParkDirectorySystem remove(NationalPark nationalPark)
      throws NationalParkNotFoundException {
    if(this.first.equals(nationalPark))
      return this.rest;
    else
      return new ConsNationalPark(this.first,this.rest.remove(nationalPark));
  }


  @Override
  public Boolean contains(NationalPark nationalPark) {
    if(this.first.equals(nationalPark))
      return true;
    else
      return this.rest.contains(nationalPark);
  }

  @Override
  public INationalParkDirectorySystem findAllInSameState(String state) {
    if(this.first.getState().equals(state))
      return new ConsNationalPark(this.first, this.rest.findAllInSameState(state));
    else
      return this.rest.findAllInSameState(state);

  }

  @Override
  public INationalParkDirectorySystem findAllOpenYearRound() {
    if(this.first.getOpenYearRound())
      return new ConsNationalPark(this.first, this.rest.findAllOpenYearRound());
    else
      return this.rest.findAllOpenYearRound();
  }


  @Override
  public NationalPark getSpecifiedNationalPark(String nationalParkID)
      throws InvalidNationalParkIDException {
    if(this.first.getNationalParkID().equals(nationalParkID))
      return this.first;
    else
      return this.rest.getSpecifiedNationalPark(nationalParkID);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null) {
      return false;
    }
    if(!(o instanceof ConsNationalPark))
      return false;

    ConsNationalPark that = (ConsNationalPark) o;
    if(!this.first.equals(that.first)) return false;
    return this.rest.equals(that.rest);
  }

  @Override
  public int hashCode() {
    int result = 1;
    int prime = HASH_CODE;

    result = (prime * result) + ((this.first == null) ? 0 : this.first.hashCode());
    result = (prime * result) + ((this.rest == null) ? 0 : this.rest.hashCode());

    return result;
  }


  @Override
  public String toString() {
    return "ConsNationalPark{" +
        "first=" + first +
        ", rest=" + rest +
        '}';
  }
}
