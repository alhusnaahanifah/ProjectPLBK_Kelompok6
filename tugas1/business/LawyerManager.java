package tugas1.business;

import tugas1.interfaces.*;
import tugas1.entities.*;
import java.util.ArrayList;
import java.util.List;

public class LawyerManager implements ILawyerMgt {
    private List<Lawyer> daftarLawyer = new ArrayList<>();

    @Override
    public void tambahLawyer(Lawyer lawyer) {
        daftarLawyer.add(lawyer);
        System.out.println("Pengacara " + lawyer.getNama() + " ditambahkan.");
    }
    
    @Override
    public Lawyer cariLawyer(String nama) {
        for (Lawyer p : daftarLawyer) {
            if (p.getNama().equalsIgnoreCase(nama)) {
                return p;
            }
        }
        return null;
    }
}
