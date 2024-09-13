class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        if (initialBalance > 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of " + amount + " successful. Current Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful. Current Balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}

class SavingsAccount extends BankAccount {
    private double withdrawalLimit;

    public SavingsAccount(String accountHolder, double initialBalance, double withdrawalLimit) {
        super(accountHolder, initialBalance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("Withdrawal amount exceeds the limit of " + withdrawalLimit);
        } else {
            super.withdraw(amount);
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Holder: " + getAccountHolder());
        System.out.println("Account Balance: " + getBalance());
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}

public class BankMain {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("Sanket Ahire", 1000, 500);

        savings.displayAccountDetails();

        savings.deposit(200);
        
        savings.withdraw(400);

        savings.withdraw(600);

        savings.displayAccountDetails();
    }
}
