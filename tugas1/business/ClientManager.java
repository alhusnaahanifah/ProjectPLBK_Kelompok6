package tugas1.business;

import tugas1.interfaces.*;
import tugas1.entities.*;
import java.util.ArrayList;
import java.util.List;

public class ClientManager implements IClientMgt {
    private List<Client> daftarClient = new ArrayList<>();

    @Override
    public void tambahClient(Client client) {
        daftarClient.add(client);
        System.out.println("Klien " + client.getNama() + " ditambahkan.");
    }
}