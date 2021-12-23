package problem2;

import java.util.Arrays;
import java.util.Objects;

/**
 * A class that implements from the interface of Set that represents an array contains Integer
 */
public class SetImplement implements Set{
  private Integer[] items;
  private Integer size;
  private static final int NUM_SLOTS = 1;
  public static final int NOT_FOUND = -1;

  /**
   * Private constructor that allows us to return a new copy from the producers.
   * @param size The size of the arraySet.
   * @param items The items in the arraySet.
   */
  public SetImplement(Integer[] items, Integer size) {
    this.items = items;
    this.size = size;
  }

  /**
   * A constructor that with items and size and create an empty size of arraySet.
   */
  public SetImplement() {
    this.items = new Integer[NUM_SLOTS];
    this.size = 0;
  }

  /**
   * Creates and returns an empty Set.
   * @return Set, an empty Set
   */
  @Override
  public Set emptySet() {
    return new SetImplement();
  }

  /**
   * Checks if the Set is empty. Returns true if the Set contains no items, false otherwise
   * @return Boolean,  true if the Set contains no items, false otherwise
   */
  @Override
  public Boolean isEmpty() {
    Integer[] a = new Integer[1];
    return this.size == 0 && Arrays.equals(a,this.items);
  }

  /**
   * Adds the given Integer to the Set if and only if that Integer is not already in the Set.
   * @param n, Integer, taking this as parameter
   * @return Set, a new set,after adding the Set if and only if that Integer
   * is not already in the Set
   */
  @Override
  public Set add(Integer n) {
    if(this.contains(n)) return this;
    Integer[] newItems;
    if(!this.inSizeRange())
      newItems = this.resize();
    else
      newItems = this.items.clone();
      newItems[this.size] = n;
    //use private constructor
    return new SetImplement(newItems,this.size+1);
  }

  /**
   * Returns true if the given Integer is in the Set, false otherwise.
   * @param n, Integer, taking this number as a parameter
   * @return Boolean, true if the given Integer is in the Set, false otherwise.
   */
  @Override
  public Boolean contains(Integer n) {
    for(int i = 0; i < this.size; i++){
      if(this.items[i].equals(n))
        return true;
    }
    return false;
  }

  /**
   * Returns a copy of the Set with the given Integer removed.
   * If the given Integer is not in the Set, returns the Set as is.
   * @param n Integer, taking this number as a parameter
   * @return Set, a copy of the Set with the given Integer removed
   */
  @Override
  public Set remove(Integer n) {

    if(!contains(n)) return this;
    SetImplement newSet = new SetImplement();
    Integer[] newItems = new Integer[this.size-1];
    int i = 0;
    for(int j = 0; j < this.size; j++){
      if(this.items[j] != n){
        newItems[i] = this.items[j];
        i++;
      }
    }
    newSet.items = newItems;
    newSet.size = this.size - 1;
    return newSet;
  }


  /**
   * Gets the number of items in the Set.
   * @return Integer, the number of items in the Set
   */
  @Override
  public Integer size() {
    return this.size;
  }


  /**
   * Helper function that checks if there is room in the items array to add a new item to the array.
   *
   * @return true if there is space available, false otherwise
   */
  private boolean inSizeRange() {
    return (this.size + 1 <= this.items.length);
  }


  /**
   * Helper function used by add and insert methods. Copies the items from one array to another.
   * @param from The array to copy from.
   * @param to The array to copy to.
   * @param fromStart The index in the "from" array to start copying from.
   * @param fromEnd The index in the "from" array to end at (exclusive).
   * @param toStart The index in the "to" array to start copying to.
   */
  private void copyItems(Integer[] from, Integer[] to, int fromStart, int fromEnd, int toStart) {
      for (int i = fromStart; i < fromEnd; i++) {
        int current = toStart;
        to[current] = from[i];
        current++;
    }
  }

  /**
   * Shortcut version of the helper method above. Will copy the entirety of the
   * "from" array to the "to" array.
   * @param from The array to copy from.
   * @param to The array to copy to.
   */
  private void copyItems(Integer[] from, Integer[] to) {
    this.copyItems(from, to, 0, from.length, 0);
  }


  /**
   * Increase the size of the data array. This involves creating a temporary new array, adding the
   * existing data to the new array, then setting the data array to the new array.
   *
   * @return a new items array
   */
  private Integer[] resize() {
    int newSize = this.size + NUM_SLOTS;
    Integer[] newItems = new Integer[newSize];
    this.copyItems(this.items, newItems);
    return newItems;
  }

  /**
   * A method provided by java.lang.Object that indicates whether some other object
   * passed as an argument is "equal to" the current instance.
   * @param o  Object, taking this object as a parameter
   * @return boolean, a boolean value after compare with those fields of SetImplement object
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetImplement that = (SetImplement) o;
    return Arrays.equals(items, that.items) && size == that.size;
  }

  /**
   * Return a hashcode value of the Object
   * @return int, a hashcode value of the object
   */
  @Override
  public int hashCode() {
    int result = Objects.hash(size);
    result = 31 * result;
    for (int i = 0; i < this.size; i++)
      result += Objects.hash(this.items[i]);
    return result;
  }


  /**
   * Returns the value given to it in string format.
   * @return String, returns the value given to it in string format.
   */
  @Override
  public String toString() {
    return "SetImplement{" +
        "items=" + Arrays.toString(items) +
        ", size=" + size +
        '}';
  }
}
