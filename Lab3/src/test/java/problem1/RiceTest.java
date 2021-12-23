package problem1;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;
import org.junit.Before;
import org.junit.Test;

public class RiceTest {
  private Rice testRice;
  private Rice testRice2;
  private LocalDate orderDate;
  private LocalDate expirationDate;
  private String name = "Big";
  private Double currentPricePerUnit = 1.1;
  private Integer currentAvailableQuantity = 5;
  private Integer maxAllowedQuantity = 20;


  @Before
  public void setUp() throws Exception {
    testRice = new Rice("Big", 1.1,5,20);
    testRice2 = new Rice("Big", 2.1,5,20);
  }


  @Test
  public void testGetName() {
    assertEquals(testRice.getName(),"Big");
  }

  @Test
  public void testGetCurrentPricePerUnit() {

    assertEquals(testRice.getCurrentPricePerUnit(),(Double) 1.1);
  }

  @Test
  public void testGetCurrentAvailableQuantity() {

    assertEquals(testRice.getCurrentAvailableQuantity(),(Integer) 5);
  }

  @Test
  public void testGetMaxAllowedQuantity() {

    assertEquals(testRice.getMaxAllowedQuantity(),(Integer) 20);
  }

  @Test
  public void equals() {
    assertTrue(testRice.equals(testRice));

  }

  @Test
  public void equals2() {
    assertFalse(testRice.equals(testRice2));
    assertNotEquals(testRice,null);
  }

  @Test
  public void equalsDifferentDataTypes(){
    assertFalse(testRice.equals("Big"));
    assertFalse(testRice.equals(2.1));
  }

  @Test
  public void equalsSameFields(){
    testRice = new Rice("Big", 1.1,5,20);
    testRice2 = new Rice("Big", 1.1,5,20);
    assertTrue(testRice.equals(testRice2));
  }

  @Test
  public void equalNotSameCurrentPrice() {
    testRice = new Rice("Big", 1.1,5,20);
    testRice2 = new Rice("Big", 2.1,5,20);
    assertFalse(testRice.equals(testRice2));
  }

  @Test
  public void equalNotSameName() {
    testRice = new Rice("Small", 1.1,5,20);
    testRice2 = new Rice("Big", 1.1,5,20);
    assertFalse(testRice.equals(testRice2));
  }

  @Test
  public void equalNotSameMaxQuantity() {
    testRice = new Rice("Small", 1.1,5,50);
    testRice2 = new Rice("Small", 1.1,5,20);
    assertFalse(testRice.equals(testRice2));
  }

  @Test
  public void equalNotSameAvailableQuantity() {
    testRice = new Rice("Small", 1.1,8,50);
    testRice2 = new Rice("Small", 1.1,5,50);
    assertFalse(testRice.equals(testRice2));
  }

  @Test
  public void testHashCodeNull() {
    assertFalse(0 == testRice.hashCode());
  }

  @Test
  public void testHashCodeEquality() {
    testRice2 = new Rice("Small", 1.1,5,50);
    assertTrue(testRice.equals(testRice2) == (testRice.hashCode()
        == testRice2.hashCode()));
  }

  @Test
  public void testHashCodeConsistency() {
    int hash = testRice.hashCode();
    assertEquals(hash, testRice.hashCode());
  }

  @Test
  public void testToString() {

    String expectedString = "AbstractFoodItem{" +
        "name='" + name + '\'' +
        ", currentPricePerUnit='" + currentPricePerUnit + '\'' +
        ", currentAvailableQuantity=" + currentAvailableQuantity +
        ", maxAllowedQuantity=" + maxAllowedQuantity +
        '}';
    assertEquals(expectedString,testRice.toString());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testIllegalArgumentException() throws IllegalArgumentException{
    testRice2 = new Rice("Small", 1.1,5,300);
    assertFalse(testRice.equals(testRice2));

  }




}