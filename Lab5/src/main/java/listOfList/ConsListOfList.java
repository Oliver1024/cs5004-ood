package listOfList;

import simpleRecursiveList.Cons;
import simpleRecursiveList.List;

public class ConsListOfList implements ListOfList{
  private List value;
  private  ListOfList rest;

  public ConsListOfList(List value, ListOfList rest) {
    this.value = value;
    this.rest = rest;
  }

  @Override
  public Integer size() {
    return  1 + this.rest.size();
  }

  @Override
  public Integer length() {
    return this.value.size() + this.rest.length();
  }

  @Override
  public Integer sum() {
    return this.value.sum() + this.rest.sum();
  }


  @Override
  public Boolean isEmpty() {
    return false;
  }

  @Override
  public ListOfList add(List listToAdd) {
    return new ConsListOfList(listToAdd,this);
  }

  @Override
  public ListOfList removeInteger(Integer value) {
    if(this.value.contains(value))
      return new ConsListOfList(this.value.remove(value), this.rest);
    else
      return new ConsListOfList(this.value,this.rest.removeInteger(value));
  }

  @Override
  public ListOfList removeAllInteger(Integer value) {
    if(this.value.contains(value))
      return new ConsListOfList(this.value.remove(value), this.rest.removeAllInteger(value));
    else
      return new ConsListOfList(this.value, this.rest.removeAllInteger(value));
  }

}

