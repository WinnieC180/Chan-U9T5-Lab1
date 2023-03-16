import java.util.ArrayList;

public class Vet {

    private String name;
    private ArrayList<Animal> clients;

    public Vet(String name) {
        this.name = name;
        clients = new ArrayList<>();
    }

    public void addClient(Animal client) {

        if (clients.indexOf(client) == -1) {
            System.out.println("Welcome to " + name + "'s office, " + client.getName() + "!");
            clients.add(client);
        } else {
            System.out.println(client.getName() + " is already a client of " + name + "!");
        }
    }
}
