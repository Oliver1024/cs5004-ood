package problem2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Represents a concrete class Catalog, with functionalities to store and search items
 */
public class Catalog {
  private Set<Item> setItemCollection;

  /**
   * Constructs a new Catalog, with an empty set of Item is created
   */
  public Catalog() {
    this.setItemCollection = new HashSet<>();
  }

  /**
   * Adds Item to the collection
   * @param item - Item, including Music and Book
   */
  public void addItem(Item item){
    this.setItemCollection.add(item);
  }

  /**
   * Returns the collection of Item
   * @return the collection of Item
   */
  public Set<Item> getSetItemCollection() {
    return setItemCollection;
  }

  /**
   * Returns Set of Item whose title contains the keyword
   * @param keyword - String, searching keyword
   * @return Set of Item
   */
  public Set<Item> search(String keyword){
    Set<Item> newItems = new HashSet<>();
    for(Item item : setItemCollection){
      if(item.getTitle().toLowerCase().contains(keyword.toLowerCase())){
        newItems.add(item);
      }
    }
    return newItems;
  }

  /**
   * Returns Set of Item
   * @param author - Author, the author of book
   * @return Set of Item
   */
  public Set<Item> search(Author author){
    Set<Item> newItems = new HashSet<>();
    for(Item item : setItemCollection){
      if(item.getCreators().equals(author)){
        newItems.add(item);
      }
    }
    return newItems;
  }


  /**
   * Returns Set of Item, only including the music
   * @param artist - RecordingArtist, the artist of music
   * @return Set of Item
   */
  public Set<Item> search(RecordingArtist artist) {
    Set<Item> newItems = new HashSet<>();
    for (Item item : setItemCollection) {
      if (item.getCreators().equals(artist)) {
        newItems.add(item);
      }else if( item.getCreators().getMembers() != null &&
          item.getCreators().getMembers().contains(artist)
         ){
        newItems.add(item);
      }
    }
    return newItems;
  }


  /**
   * Indicates whether some other object passed as an argument is "equal to" the
   * current instance
   * @param o object
   * @return boolean value
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Catalog catalog = (Catalog) o;
    return Objects.equals(getSetItemCollection(), catalog.getSetItemCollection());
  }


  /**
   * returns an integer representation of the object memory address
   * @return int, hash value
   */
  @Override
  public int hashCode() {
    return Objects.hash(getSetItemCollection());
  }

  /**
   * Returns an String representation of the object
   * @return an String representation of the object
   */
  @Override
  public String toString() {
    return "Catalog{" +
        "setItemCollection=" + setItemCollection +
        '}';
  }
}
