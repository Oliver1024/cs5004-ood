package problem1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * A class that used to get the frequent of the swim.
 */
public class FrequencyCount {

  private static final Float INITIAL_COUNT = 1f;

  /**
   * Find the frequency of the map.
   * @param listInts List
   * @return frequencyMap
   */
  public static Map<Integer, Float> findFrequencies(List<Integer> listInts){
    Map<Integer, Float> frequencyMap = new HashMap<>();
    Integer totalSize = listInts.size();

    for (Integer intFormList : listInts) {
      if(frequencyMap.containsKey(intFormList))
        frequencyMap.put(intFormList, frequencyMap.get(intFormList)+1);
      else
        frequencyMap.put(intFormList, INITIAL_COUNT);
    }

    Set<Integer> ints = frequencyMap.keySet();
    for(Integer intKey: ints) {
      frequencyMap.put(intKey, frequencyMap.get(intKey)/totalSize);
    }
    return frequencyMap;
  }


}

