package listOfList;

import simpleRecursiveList.List;

public interface ListOfList {
  Integer size();
  Integer length();
  Integer sum();
  Boolean isEmpty();
  ListOfList add(List listToAdd);
  ListOfList removeInteger(Integer value);
  ListOfList removeAllInteger(Integer value);
}

