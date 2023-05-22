package classesandobjects;

public class BankAccount {
  private static int accountNumber = 0;
  private double accountBalance;
  private final String customerName;
  private String customerEmail;
  private String phoneNumber;

  public BankAccount(String customerName, String customerEmail, String phoneNumber) {
    accountNumber++;
    accountBalance = 0;
    this.customerName = customerName;
    this.customerEmail = customerEmail;
    this.phoneNumber = phoneNumber;

    System.out.println("New account created.");
    System.out.println("Your account number is " + accountNumber);
    System.out.println("You balance id $" + accountBalance);
  }
  public void depositFunds(double depositAmount) {
    accountBalance += depositAmount;
    System.out.println("Deposit of $" + depositAmount + " made.");
    System.out.println("New balance is $" + accountBalance);
  }

  public void withdrawFunds(double withdrawAmount) {
    if (withdrawAmount > accountBalance) {
      System.out.println("Insufficient balance.");
    } else {
      accountBalance -= withdrawAmount;
      System.out.println("Withdrawal of $" + withdrawAmount + " processed.");
      System.out.println("New balance is $" + accountBalance);
    }
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public double getAccountBalance() {
    return accountBalance;
  }

  public String getCustomerName() {
    return customerName;
  }

  public String getCustomerEmail() {
    return customerEmail;
  }

  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
}
