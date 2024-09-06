package account;

public class CreditAcc extends CurrentAccount {

    private int strikes;
    private static final int MAX_STRIKES = 3;
    public static final double PENALTY = 50.0;

    public CreditAcc(double balance) {
        super(balance);
        this.strikes = 0;
    }

    @Override
    public boolean withdraw(double amount) {
        balance -= amount;
        if (balance < 0) {
            strikes++;
            if (strikes > MAX_STRIKES) {
                balance -= PENALTY;
            }
        }
        return true;
    }
}
