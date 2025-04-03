package tugas1.interfaces;
import tugas1.entities.*;

public interface IMakeHire {
    boolean sewaLawyer(Client client, Lawyer lawyer, float jumlahPembayaran, String statusPembayaran);
}
