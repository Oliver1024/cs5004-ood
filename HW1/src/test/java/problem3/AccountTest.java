package problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AccountTest {
  private Account testAccount;
  private Account testAccount2;
  private Account testAccount3;
  private Account testAccount4;
  private Name expectedName;
  private Amount expectedBalance;
  private Amount expectedDeposit;
  private Amount expectedWithdraw;
  private Amount expectInvalidDeposit;
  private Amount expectInvalidDeposit1;


  @Before
  public void setUp() throws Exception {
    expectedName = new Name("Jade", "Nick");
    expectedBalance = new Amount(10,29);
    expectedDeposit = new Amount(6,10);
    expectedWithdraw = new Amount(3,8);
    expectInvalidDeposit = new Amount(-1,-1);
    expectInvalidDeposit1 = new Amount(-2, 101);

    testAccount = new Account(new Name("Jade", "Nick"), expectedBalance);
    testAccount2 = new Account(new Name("Jade", "Nick"), expectInvalidDeposit);
    testAccount3 = new Account(new Name("Jade", "Nick"), expectInvalidDeposit1);
    testAccount4 = new Account(new Name("Jade", "Nick"), expectedBalance);

  }

  @Test
  public void deposit() {
    Account newExpectAccountValue = testAccount.deposit(expectedDeposit);
    assertEquals(16, newExpectAccountValue.getBalance().getDollarValue(),0);
    assertEquals(39,newExpectAccountValue.getBalance().getCentsValue(),0);
    assertEquals(-1,testAccount2.getBalance().getDollarValue(),0);
    assertEquals(-1,testAccount3.getBalance().getCentsValue(),0);
  }

  @Test
  public void withdraw() {
    Account newExpectAccountValue = testAccount.withdraw(expectedWithdraw);
    assertEquals(7,newExpectAccountValue.getBalance().getDollarValue(),0);
    assertEquals(21,newExpectAccountValue.getBalance().getCentsValue(),0);
  }

  @Test
  public void getName() {
    assertEquals(expectedName.getFirstName(), testAccount.getName().getFirstName());
    assertEquals(expectedName.getLastName(), testAccount.getName().getLastName());
  }

  @Test
  public void getBalance() {
    assertEquals(expectedBalance.getDollarValue(), testAccount.getBalance().getDollarValue());
    assertEquals(expectedBalance.getCentsValue(), testAccount.getBalance().getCentsValue());
  }
}