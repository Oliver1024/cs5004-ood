package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmptyBagOfWordsTest {
  private BagOfWords testEmptyBagOfWords;
  private BagOfWords testEmptyBagOfWords2;

  @Before
  public void setUp() throws Exception {
    testEmptyBagOfWords = new EmptyBagOfWords();
    testEmptyBagOfWords2 = BagOfWords.emptyBagOfWords();
  }

  @Test
  public void isEmpty() {
    assertTrue(testEmptyBagOfWords.isEmpty());
    assertTrue(testEmptyBagOfWords2.isEmpty());
  }

  @Test
  public void size() {
    assertEquals(testEmptyBagOfWords2.size(),(Integer) 0);
  }

  @Test
  public void contains() {
    assertEquals(testEmptyBagOfWords2.contains("A"),false);
  }


  @Test
  public void removeItem() {
    assertEquals(testEmptyBagOfWords,testEmptyBagOfWords.remove("ABC"));
  }

  @Test
  public void testEquals() {
    assertEquals(testEmptyBagOfWords,testEmptyBagOfWords);
    assertNotEquals(testEmptyBagOfWords,null);
    assertEquals(testEmptyBagOfWords,testEmptyBagOfWords2);
    testEmptyBagOfWords = testEmptyBagOfWords.add("A");
    assertEquals(testEmptyBagOfWords,testEmptyBagOfWords);
    assertNotEquals(testEmptyBagOfWords, testEmptyBagOfWords2.add("B"));
  }

  @Test
  public void testHashCode() {
    assertEquals(113, testEmptyBagOfWords.hashCode());
  }

  @Test
  public void testToString() {
    String expectedString = "EmptyBagOfWords{}";
    assertEquals(expectedString, testEmptyBagOfWords.toString());
  }


}