package problem2;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;

public class CatalogTest {
  private Catalog testCatalog;
  private Catalog testCatalog2;
  private Set<Item> testItem;
  private Author testAuthor;
  private Book testBook;
  private RecordingArtist testRecordingArtist;
  private RecordingArtist testRecordingArtist2;
  private Set<Person> testMember;
  private Set<Person> testMember2;
  private Music testMusic;
  private Music testMusic2;
  private Band testBand;
  private Band testBand2;


  @Before
  public void setUp() throws Exception {
    testCatalog = new Catalog();
    testAuthor = new Author("Peter", "Jade");
    testBook = new Book(testAuthor,"Sky",2021 );
    testRecordingArtist = new RecordingArtist("Jade", "Tom");
    testRecordingArtist2 = new RecordingArtist("Cook", "Jim");
    testMember = new HashSet<>();
    testMember2 = new HashSet<>();

    testMember.add(testRecordingArtist);
    testMember.add(testRecordingArtist2);
    testMember2.add(testRecordingArtist2);
    testMember2.add(testRecordingArtist);
    testBand = new Band("Moon",testMember);
    testBand2 = new Band("Sun", testMember2);

    testMusic = new Music(testRecordingArtist,"Run",2020 );
    testMusic2 = new Music(testBand,"Walk", 2020);

  }

  @Test
  public void addItem() {
    testCatalog.addItem(testMusic);
    for(Item item : testCatalog.getSetItemCollection()){
      assertEquals(item, testMusic);
    }
  }

  @Test
  public void getSetItemCollection() {
    assertTrue(testCatalog.getSetItemCollection().isEmpty());
    assertEquals(testCatalog.getSetItemCollection().size(),0);
  }

  @Test
  public void testSearch() {
    testCatalog.addItem(testBook);
    testCatalog.addItem(testMusic2);
    testCatalog.addItem(testMusic);
    Set<Item> testResult = testCatalog.search("Run");

    Set<Item> expectedItem = new HashSet<>();
    expectedItem.add(testMusic);
    assertEquals(expectedItem,testResult);
  }

  @Test
  public void testSearch2() {
    testCatalog.addItem(testBook);
    testCatalog.addItem(testMusic2);
    testCatalog.addItem(testMusic);
    Set<Item> testResult = testCatalog.search(testAuthor);

    Set<Item> expectedItem = new HashSet<>();
    expectedItem.add(testBook);
    assertEquals(expectedItem,testResult);
  }

  @Test
  public void testSearch3() {
    testCatalog.addItem(testBook);
    testCatalog.addItem(testMusic2);
    testCatalog.addItem(testMusic);
    Set<Item> testResult = testCatalog.search(testRecordingArtist);
    Set<Item> expectedItem = new HashSet<>();
    expectedItem.add(testMusic);
    expectedItem.add(testMusic2);
    assertEquals(expectedItem,testResult);
  }

  @Test
  public void testEquals() {
    assertEquals(testCatalog, testCatalog);
    assertNotEquals(null, testCatalog);
    assertFalse(testCatalog.equals(testCatalog.getSetItemCollection()));
  }

  @Test
  public void testEquals2() {
    testCatalog2 = new Catalog();
    assertEquals(testCatalog, testCatalog2);

    testCatalog2.addItem(testMusic);
    assertFalse(testCatalog.equals(testCatalog2));
  }

  @Test
  public void testHashCode() {
    testCatalog.addItem(testMusic);
    int hash = Objects.hash(testCatalog.getSetItemCollection());
    assertEquals(hash, testCatalog.hashCode());
  }

  @Test
  public void testToString() {
    testCatalog.addItem(testMusic);
    String expectedString = "Catalog{" +
        "setItemCollection=" + testCatalog.getSetItemCollection() +
        '}';
    assertEquals(expectedString, testCatalog.toString());
  }

}