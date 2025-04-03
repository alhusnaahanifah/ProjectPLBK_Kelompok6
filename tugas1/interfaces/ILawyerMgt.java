package tugas1.interfaces;
import tugas1.entities.*;

public interface ILawyerMgt {
    void tambahLawyer(Lawyer lawyer);
    Lawyer cariLawyer(String nama);
}
