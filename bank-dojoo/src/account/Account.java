package account;

public abstract class Account {

    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public abstract boolean deposit(double amount);
    public abstract boolean withdraw(double amount);
}
