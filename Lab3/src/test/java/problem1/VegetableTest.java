package problem1;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;
import org.junit.Before;
import org.junit.Test;

public class VegetableTest {
  private Vegetable testVegetable;
  private Vegetable testVegetable2;
  private LocalDate orderDate;
  private LocalDate expirationDate;

  @Before
  public void setUp() throws Exception {
    testVegetable = new Vegetable("Tomato", 3.78, 2,
        5, LocalDate.of(2021, Month.MAY,15),
        LocalDate.of(2021, Month.DECEMBER,31));
  }

  @Test
  public void testGetOrderDate() {
    assertEquals(testVegetable.getOrderDate(),LocalDate.of(2021,Month.MAY,15));
  }

  @Test
  public void testGetExpirationDate() {

    assertEquals(testVegetable.getExpirationDate(),
        LocalDate.of(2021, Month.DECEMBER,31));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testIllegalArgumentException() throws IllegalArgumentException{
    testVegetable2 = new Vegetable("Tomato", 3.78, 2,
        101, LocalDate.of(2021, Month.MAY,15),
        LocalDate.of(2021, Month.DECEMBER,31));
  }

  @Test
  public void equals() {
    assertTrue(testVegetable.equals(testVegetable));

  }

  @Test
  public void equals2() {
    assertFalse(testVegetable.equals(testVegetable2));
    assertNotEquals(testVegetable,null);
  }

  @Test
  public void equalsDifferentDataTypes(){
    assertFalse(testVegetable.equals("Tomato"));
    assertFalse(testVegetable.equals(3.78));
  }

  @Test
  public void equalsSameFields(){
    testVegetable2 = new Vegetable("Tomato", 3.78, 2,
        5, LocalDate.of(2021, Month.MAY,15),
        LocalDate.of(2021, Month.DECEMBER,31));
    assertTrue(testVegetable.equals(testVegetable2));
  }

  @Test
  public void equalNotSameName() {
    testVegetable2 = new Vegetable("Apple", 3.78, 2,
        5, LocalDate.of(2021, Month.MAY,15),
        LocalDate.of(2021, Month.DECEMBER,31));
    testVegetable = new Vegetable("Tomato", 3.78, 2,
        5, LocalDate.of(2021, Month.MAY,15),
        LocalDate.of(2021, Month.DECEMBER,31));
    assertFalse(testVegetable.equals(testVegetable2));
  }

  @Test
  public void equalNotSameCurrentPricePerUnit() {
    testVegetable2 = new Vegetable("Apple", 2.95, 2,
        5, LocalDate.of(2021, Month.MAY,15),
        LocalDate.of(2021, Month.DECEMBER,31));
    testVegetable = new Vegetable("Tomato", 3.78, 2,
        5, LocalDate.of(2021, Month.MAY,15),
        LocalDate.of(2021, Month.DECEMBER,31));
    assertFalse(testVegetable.equals(testVegetable2));
  }

  @Test
  public void equalNotSameOrderDate() {
    testVegetable2 = new Vegetable("Apple", 2.95, 2,
        5, LocalDate.of(2021, Month.JUNE,5),
        LocalDate.of(2021, Month.DECEMBER,31));
    testVegetable = new Vegetable("Tomato", 3.78, 2,
        5, LocalDate.of(2021, Month.MAY,15),
        LocalDate.of(2021, Month.DECEMBER,31));
    assertFalse(testVegetable.equals(testVegetable2));
  }

  @Test
  public void equalNotSameExpirationDate() {
    testVegetable2 = new Vegetable("Apple", 2.95, 2,
        5, LocalDate.of(2021, Month.JUNE,5),
        LocalDate.of(2021, Month.DECEMBER,31));
    testVegetable = new Vegetable("Tomato", 3.78, 2,
        5, LocalDate.of(2021, Month.MAY,15),
        LocalDate.of(2022, Month.DECEMBER,15));
    assertFalse(testVegetable.equals(testVegetable2));
  }

  @Test
  public void testHashCodeNull() {
    assertFalse(0 == testVegetable.hashCode());
  }

  @Test
  public void testHashCodeEquality() {
    testVegetable2 = new Vegetable("Tomato", 3.78, 2,
        5, LocalDate.of(2021, Month.MAY,15),
        LocalDate.of(2021, Month.DECEMBER,31));
    assertTrue(testVegetable.equals(testVegetable2) == (testVegetable.hashCode()
        == testVegetable2.hashCode()));
  }

  @Test
  public void testHashCodeConsistency() {
    int hash = testVegetable.hashCode();
    assertEquals(hash, testVegetable.hashCode());
  }

  @Test
  public void testToString() {
    orderDate = LocalDate.of(2021, Month.MAY,15);
    expirationDate = LocalDate.of(2021, Month.DECEMBER,31);
    String expectedString = "PerishableFood{" +
        "orderDate=" + orderDate +
        ", expirationDate=" + expirationDate +
        '}';
    assertEquals(expectedString,testVegetable.toString());
  }
}