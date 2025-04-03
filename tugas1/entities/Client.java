// Entity classes
package tugas1.entities;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String nama;
    private String kontak;
    private List<Cases> daftarCases;

    public Client(String nama, String kontak) {
        this.nama = nama;
        this.kontak = kontak;
        this.daftarCases = new ArrayList<>();
    }

    public void tambahCases(Cases cases) {
        daftarCases.add(cases);
    }

    public String getNama() {
        return nama;
    }
}