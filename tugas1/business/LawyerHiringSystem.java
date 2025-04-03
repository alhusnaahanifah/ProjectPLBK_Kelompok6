package tugas1.business;

import tugas1.interfaces.*;
import tugas1.entities.*;
import java.util.ArrayList;
import java.util.List;

public class LawyerHiringSystem implements IMakeHire, ICancelHire {
    private IClientMgt clientManager;
    private ILawyerMgt lawyerManager;
    private IPayment paymentSystem;
    private List<Cases> daftarSewa = new ArrayList<>();

    public LawyerHiringSystem(IClientMgt clientManager, ILawyerMgt lawyerManager, IPayment paymentSystem) {
        this.clientManager = clientManager;
        this.lawyerManager = lawyerManager;
        this.paymentSystem = paymentSystem;
    }

    @Override
    public boolean sewaLawyer(Client client, Lawyer lawyer, float jumlahPembayaran, String statusPembayaran) {
        if (!lawyer.isTersedia()) {
            System.out.println("Pengacara tidak tersedia.");
            return false;
        }
        // Membuat objek Kasus terlebih dahulu
        String idKasus = "K" + (daftarSewa.size() + 1);
        Cases kasusBaru = new Cases(idKasus, client, lawyer, "Diproses");
        
        // Membuat objek Pembayaran yang terkait dengan kasus
        Payment payment = new Payment(jumlahPembayaran, statusPembayaran, kasusBaru);
        
        // Proses pembayaran melalui sistem billing
        if (!paymentSystem.prosesPembayaran(payment)) {
            System.out.println("Gagal melakukan pembayaran, sewa batal.");
            return false;
        }
        
        // Jika pembayaran berhasil, proses sewa dilanjutkan
        lawyer.setTersedia(false);
        daftarSewa.add(kasusBaru);
        client.tambahCases(kasusBaru);
        System.out.println("Pengacara " + lawyer.getNama() + " berhasil disewa oleh " + client.getNama() + 
                           " untuk kasus " + idKasus + ".");
        return true;
    }

    @Override
    public boolean batalkanSewa(Client client, Lawyer lawyer) {
        // Dalam implementasi sederhana, pembatalan hanya mengubah status ketersediaan pengacara.
        lawyer.setTersedia(true);
        System.out.println("Sewa lawyer " + lawyer.getNama() + " dibatalkan oleh " + client.getNama() + ".");
        return true;
    }
}