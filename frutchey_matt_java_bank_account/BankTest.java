public class BankTest {
    public static void main(String[] args) {
        //TODO: Create 3 Accounts
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();
        BankAccount account4 = new BankAccount(1000, 15000.00);

        //? Deposit Test
        //TODO: Deposit some money into each bank account's checking or savings account and display the balance each time--each deposit should increase the amount of totalMoney.
        account1.depositChecking(55.00);
        System.out.println("Your checking balance is: $" + account1.getChecking()+".");
        account2.depositChecking(150.00);
        System.out.println("Your checking balance is: $" + account2.getChecking()+".");
        account3.depositChecking(75);
        System.out.println("Your checking balance is: $" + account3.getChecking()+".");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        account1.depositSavings(500);
        System.out.println("Your savings balance is: $" + account1.getSavings()+".");
        account2.depositSavings(1000.00);
        System.out.println("Your savings balance is: $" + account2.getSavings()+".");
        account3.depositSavings(1500.00);
        System.out.println("Your savings balance is: $" + account3.getSavings()+".");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //? Withdrawal Test
        //TODO: Withdraw some money from each bank account's checking or savings account and display the remaining balance--each withdrawal should decrease the amount of totalMoney.
        account1.withdrawChecking(20);
        System.out.println("Your checking balance is now: " + account1.getChecking()+".");
        account2.withdrawChecking(100.00);
        System.out.println("Your checking balance is now: " + account2.getChecking()+".");
        account3.withdrawChecking(40);
        System.out.println("Your checking balance is now: " + account3.getChecking()+".");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        account1.withdrawSavings(330);
        System.out.println("Your savings balance is now: " + account1.getSavings()+".");
        account2.withdrawSavings(720.00);
        System.out.println("Your savings balance is now: " + account2.getSavings()+".");
        account3.withdrawSavings(2000);
        System.out.println("Your savings balance is now: " + account3.getSavings()+".");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //? Balance Test
        System.out.println(account1.getAccountBalance());
        System.out.println(account2.getAccountBalance());
        System.out.println(account3.getAccountBalance());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //? Static Test
        //TODO: Print the number of bank accounts and the totalMoney
        System.out.println("This bank has " + BankAccount.getNumOfAccounts() + " accounts.");
        System.out.println("The current holdings in this bank: $" + BankAccount.getTotalMoney());
    }
}