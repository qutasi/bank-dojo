import account.TermDepositAccount;
import account.CurrentAccount;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private String name;
    private String taxNumber;
    private CurrentAccount currentAccount;
    private List<TermDepositAccount> termDepositAccounts;

    public Client(String name, String taxNumber, CurrentAccount currentAccount) {
        this.name = name;
        this.taxNumber = taxNumber;
        this.currentAccount = currentAccount;
        termDepositAccounts = new ArrayList<>();
    }

    public void addTermDepositAccount(TermDepositAccount account) {
        termDepositAccounts.add(account);
    }

    public CurrentAccount getCurrentAccount() {
        return currentAccount;
    }

    public void sendMoney(Client recipient, double amount) {
        if (currentAccount.withdraw(amount)) {
            recipient.getCurrentAccount().deposit(amount);

        }
    }

}
