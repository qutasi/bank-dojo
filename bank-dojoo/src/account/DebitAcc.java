package account;

public class DebitAcc extends CurrentAccount {

    public DebitAcc(double balance) {
        super(balance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
