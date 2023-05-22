package classesandobjects;

public class Main {

  public static void main(String[] args) {
    BankAccount myBankAccount = new BankAccount("Advait",
        "advait@gmail.com", "9876543210");

    myBankAccount.depositFunds(1000);
    myBankAccount.withdrawFunds(50);
    myBankAccount.withdrawFunds(1000);

    BankAccount anotherAccount = new BankAccount("Psi", "psi@gmail.com",
        "9876543210");
    anotherAccount.withdrawFunds(10);
  }
}
