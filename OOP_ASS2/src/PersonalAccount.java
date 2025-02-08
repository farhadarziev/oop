import java.util.ArrayList;
import java.util.List;

public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private List<Amount> transactions;

    public PersonalAccount(int newAccountNumber, String newAccountHolder) {
        accountNumber = newAccountNumber;
        accountHolder = newAccountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Amount(amount, "Deposit"));
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add(new Amount(amount, "Withdraw"));
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }
    public void printTransactionHistory() {
        System.out.println("Transaction History:");
        for (Amount transaction : transactions) {
            System.out.println(transaction);
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + balance;
    }

    public void addAmount(double amount) {
        deposit(amount);
    }

    public void subtractAmount(double amount) {
        withdraw(amount);
    }
}


