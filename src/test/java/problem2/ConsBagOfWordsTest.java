package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ConsBagOfWordsTest {
  private BagOfWords testConsBagOfWords;
  private BagOfWords testConsBagOfWords2;
  private BagOfWords rest;
  private BagOfWords rest2;
  private String first;
  private String first2;



  @Before
  public void setUp() throws Exception {
    rest = new EmptyBagOfWords();
    rest2 = new EmptyBagOfWords();
    first = "A";
    first2 = "C";
    testConsBagOfWords = new ConsBagOfWords(first,rest);
    testConsBagOfWords2 = new ConsBagOfWords(first2,rest2);
  }

  @Test
  public void isEmpty() {
    assertFalse(testConsBagOfWords.isEmpty());
  }

  @Test
  public void size() {
    assertEquals(testConsBagOfWords.size(),(Integer) 1);
  }

  @Test
  public void contains() {
    testConsBagOfWords = testConsBagOfWords.add(first);
    assertTrue(testConsBagOfWords.contains("A"));
    assertFalse(testConsBagOfWords.contains("M"));
  }

  @Test
  public void length() {
    testConsBagOfWords = testConsBagOfWords.add("X");
    assertEquals(testConsBagOfWords.size(),(Integer) 2);
  }

  @Test
  public void add() {
    testConsBagOfWords = testConsBagOfWords.add("X");
    testConsBagOfWords = testConsBagOfWords.add(first);
    testConsBagOfWords = testConsBagOfWords.add(first2);
    assertEquals(testConsBagOfWords.size(),(Integer) 4);

  }

  @Test
  public void removeItem() {
    testConsBagOfWords = testConsBagOfWords.add("X");
    testConsBagOfWords = testConsBagOfWords.add(first);
    testConsBagOfWords = testConsBagOfWords.add(first2);
    testConsBagOfWords = testConsBagOfWords.remove("X");
    testConsBagOfWords = testConsBagOfWords.remove(first);
    testConsBagOfWords = testConsBagOfWords.remove(first2);
    assertEquals(testConsBagOfWords.remove(first),rest);
  }

  @Test
  public void testEquals() {
    testConsBagOfWords = new ConsBagOfWords("A",rest);
    testConsBagOfWords2 = new ConsBagOfWords("A",rest2);
    assertEquals(testConsBagOfWords,testConsBagOfWords);
    assertEquals(testConsBagOfWords,testConsBagOfWords2);
    assertNotEquals(testConsBagOfWords,null);
    assertFalse(testConsBagOfWords.equals(first));

    testConsBagOfWords2 = new ConsBagOfWords("B",rest2);
    testConsBagOfWords2 = testConsBagOfWords2.add("B");
    testConsBagOfWords2 = testConsBagOfWords2.add("C");
    assertNotEquals(testConsBagOfWords,testConsBagOfWords2);
  }

  @Test
  public void testHashCode() {
    int hash = testConsBagOfWords.hashCode();
    assertEquals(hash,testConsBagOfWords.hashCode());
    assertNotEquals(0,testConsBagOfWords.hashCode());
  }

  @Test
  public void testHashCode2() {
    final int prime = 31;
    int result = 1;
    first = null;
    rest = BagOfWords.emptyBagOfWords();
    testConsBagOfWords = new ConsBagOfWords(first,rest);
    result = (prime * result) + ((first == null) ? 0 : first.hashCode());
    result = (prime * result) + ((rest == null) ? 0 : rest.hashCode());
    assertEquals(testConsBagOfWords.hashCode(),result);

    result = 1;
    first = "X";
    rest = null;
    testConsBagOfWords = new ConsBagOfWords(first,rest);
    result = (prime * result) + ((first == null) ? 0 : first.hashCode());
    result = (prime * result) + ((rest == null) ? 0 : rest.hashCode());
    assertEquals(testConsBagOfWords.hashCode(),result);

  }


  @Test
  public void testToString() {
    String expectedString = "ConsBagOfWords [first=" + this.first + ", rest=" + this.rest + "]";

    assertEquals(testConsBagOfWords.toString(),expectedString);

  }
}