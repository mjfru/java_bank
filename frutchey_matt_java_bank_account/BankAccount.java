public class BankAccount {
    //? Member Variables:
    private double checkingBalance; // Member Variable
    private double savingsBalance; // Member Variable
    private static int accounts = 0; // Class Variable
    private static double totalMoney = 0; // All money in the account - Class Variable

    //? Constructor
    //TODO: Increment the number of accounts
    public BankAccount() {
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        accounts++;
    }

    public BankAccount(double checkingBalance, double savingsBalance){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        accounts++;
        totalMoney += checkingBalance + savingsBalance; // Set this now since this overloaded method is initializing with money.
    }

    //? Getters
    //TODO: Make for checking, savings, number of accounts, and totalMoney
    public double getChecking() {
        return this.checkingBalance;
    }

    public double getSavings() {
        return this.savingsBalance;
    }
    
    public static int getNumOfAccounts() {      // BankAccount.getNumOfAccounts() 
        return accounts;
    }

    public static double getTotalMoney() {         // BankAccount.getTotalMoney()
        return totalMoney;
    }

    //? Methods
    //! Deposit
    //TODO: Deposit - Put money into their checking or savings
    public void depositChecking(double amount) {
        this.checkingBalance += amount;
        totalMoney += amount;
    }

    public void depositSavings(double amount) {
        this.savingsBalance += amount;
        totalMoney += amount;
    }

    //! Withdraw
    //TODO: Withdraw - Take money out from their checking or savings
        //* Do not allow it if their balance is less than their withdrawal
        //* All withdrawals affect totalMoney
    public void withdrawChecking(double amount) {
        if (this.checkingBalance < amount) {
            System.out.println("Insufficient funds.");
        } else {
            this.checkingBalance -= amount;
            totalMoney -= amount;
            System.out.println("Checking withdrawal successful, please remember to take your cash!");
        }
    }

    public void withdrawSavings(double amount) {
        if (this.savingsBalance < amount) {
            System.out.println("Insufficient funds.");
        } else {
            this.savingsBalance -= amount;
            totalMoney -= amount;
            System.out.println("Savings withdrawal successful, please remember to take your cash!");
        }
    }

    //! Get Balance 
    public String getAccountBalance() {
        return ("Your checking account has $" + this.getChecking() + " and your savings account has $" + this.getSavings());
    }
}