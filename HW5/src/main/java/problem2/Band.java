package problem2;


import java.util.Set;

/**
 * Represents a concrete class Band, extending its parent class Group
 */
public class Band extends Group{

  /**
   * Constructs a Band, with name and a collection of members
   * @param name - String, name of the band
   * @param members - Set of Person, collection of members
   */
  public Band(String name, Set<Person> members) {
    super(name, members);
  }

}
