import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bank {

    private String name;
    private List<Client> clients;

    public Bank(String name) {
        this.name = name;
        this.clients = new ArrayList<Client>();
    }

    public List<Client> getClientsWithZeroOrBellowBalance() {
        return clients.stream()
                .filter(client -> client.getCurrentAccount().getBalance() <= 0)
                .collect(Collectors.toList());
    }
}
