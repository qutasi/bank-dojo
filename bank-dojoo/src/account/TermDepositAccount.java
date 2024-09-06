package account;

import java.time.LocalDate;

public class TermDepositAccount extends Account {

    private String name;
    private LocalDate maturityDate;
    public static final double INTEREST_RATE = 0.05;

    public TermDepositAccount(String name, LocalDate maturityDate, double initialAmount) {
        super(initialAmount);
        this.name = name;
        this.maturityDate = maturityDate;
    }

    @Override
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean withdraw(double amount) {
        return false;   //withdraw not allowed
    }

    public void endTerm() {
        balance += balance * INTEREST_RATE; //apply interest
        balance = 0;  //reset balance after term ends
    }
}
