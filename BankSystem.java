class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= 1000) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied. Minimum balance of 1000 must be maintained.");
        }
    }

    public void addInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
        System.out.println("Interest added: " + interest);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA12345", 5000, 3.5);

        System.out.println("Initial Balance: " + savingsAccount.getBalance());
        savingsAccount.deposit(2000);
        System.out.println("Balance after deposit: " + savingsAccount.getBalance());

        savingsAccount.addInterest();
        System.out.println("Balance after adding interest: " + savingsAccount.getBalance());

        savingsAccount.withdraw(3500);
        System.out.println("Balance after withdrawal: " + savingsAccount.getBalance());

        savingsAccount.withdraw(3000);
        System.out.println("Attempted withdrawal below threshold, balance remains: " + savingsAccount.getBalance());
    }
}
