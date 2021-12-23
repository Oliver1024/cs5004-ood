package midtermExam.p2;

/**
 * An interface that represents a national park directory system.
 */
public interface INationalParkDirectorySystem {

  /**
   * Check whether or not the NationalParkDirectorySystem is empty
   * @return Boolean, return true if empty otherwise false
   */
  Boolean isEmpty();

  /**
   * Count the number of NationalParks in the NationalParkDirectorySystem.
   * @return Integer, the number of NationalParks in the NationalParkDirectorySystem.
   */
  Integer size();

  /**
   * Add a new to the NationalParkDirectorySystem National Park
   * @param nationalPark, NationalPark,
   * @return a new NationalParkDirectorySystem National Park
   */
  INationalParkDirectorySystem add(NationalPark nationalPark);

  /**
   * Remove a specified NationalPark from the NationalParkDirectorySystem
   * @param nationalPark NationalPark
   * @return a new to the NationalParkDirectorySystem National Park
   * @throws NationalParkNotFoundException throw exception when condition is matched.
   */
  INationalParkDirectorySystem remove(NationalPark nationalPark)
      throws NationalParkNotFoundException;

  /**
   * Check if a specified NationalPark is included in the NationalParkDirectorySystem.
   * @param nationalPark NationalPark
   * @return Boolean value, return true if contains otherwise false
   */
  Boolean contains(NationalPark nationalPark);

  /**
   * Check if a specified NationalPark is included in the NationalParkDirectorySystem
   * @param state String
   * @return a new to the NationalParkDirectorySystem National Park
   */
  INationalParkDirectorySystem findAllInSameState(String state);


  /**
   * Return all NationalParks from the NationalParkDirectorySystem that are opened year round.
   * @return all NationalParks from the NationalParkDirectorySystem that are opened year round
   */
  INationalParkDirectorySystem findAllOpenYearRound();


  /**
   * Get a NationalPark from the NationalParkDirectorySystem based upon the NationalPark’s unique
   * identifier, nationalParkID
   * @param nationalParkID String
   * @return NationalPark from the NationalParkDirectorySystem
   * @throws InvalidNationalParkIDException throw exception when condition is matched
   */
  NationalPark getSpecifiedNationalPark(String nationalParkID)
      throws InvalidNationalParkIDException;
}
