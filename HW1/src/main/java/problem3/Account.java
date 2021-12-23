package problem3;

/**
 * Account is a simple object that has name and balance
 */
public class Account {

  private Name name;
  private Amount balance;

  /**
   * Constructor that creates a new Account object with the specified name and balance
   *
   * @param name    - name of the new Account object
   * @param balance - balance of the new Account object
   */
  public Account(Name name, Amount balance) {
    this.name = name;
    this.balance = balance;
  }

  /**
   * A deposit function that can used to deposit money to a name's account
   *
   * @param amount Taking amount as a parameter in this function
   * @return a new Account object with name and newAmount value
   */
  public Account deposit(Amount amount) {
    Integer depositValue = amount.getDollarValue() * 100 + amount.getCentsValue();
    Integer newBalance = this.balance.getDollarValue() * 100 + this.balance.getCentsValue()
        + depositValue;
    Integer newCurrentDollar = newBalance / 100;
    Integer newCurrentCent = newBalance % 100;

    Amount newAmount = new Amount(newCurrentDollar, newCurrentCent);
    return new Account(this.name, newAmount);
  }

  /**
   * A withDraw function that can used to withdraw money from a name's account
   *
   * @param amount Taking amount as a parameter in this function
   * @return a new Account object with name and newAmount value
   */
  public Account withdraw(Amount amount) {
    Integer withDrawValue = amount.getDollarValue() * 100 + amount.getCentsValue();
    Integer newBalance = this.balance.getDollarValue() * 100 + this.balance.getCentsValue()
        - withDrawValue;
    Integer newCurrentDollar = newBalance / 100;
    Integer newCurrentCent = newBalance % 100;

    Amount newAmount = new Amount(newCurrentDollar, newCurrentCent);
    return new Account(this.name, newAmount);
  }

  /**
   * Returns name of Account
   *
   * @return name of Account
   */
  public Name getName() {
    return name;
  }

  /**
   * Returns balance of Account
   *
   * @return balance of Account
   */
  public Amount getBalance() {
    return this.balance;
  }

}


