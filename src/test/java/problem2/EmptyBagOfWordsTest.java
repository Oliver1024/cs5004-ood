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

  @Test  // question about empty bag of words test?
  public void size() {
    assertEquals(testEmptyBagOfWords2.size(),(Integer) 0);
  }

  @Test
  public void contains() {
    assertEquals(testEmptyBagOfWords2.contains("A"),false);
  }


  @Test
  public void removeItem() {
    testEmptyBagOfWords = testEmptyBagOfWords.add("A");
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

}