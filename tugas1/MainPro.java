package tugas1;

import tugas1.business.*;
import tugas1.entities.*;
import tugas1.interfaces.*;

import java.util.Scanner;

public class MainPro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inisialisasi sistem dan manager
        IClientMgt clientManager = new ClientManager();
        ILawyerMgt lawyerManager = new LawyerManager();
        IPayment paymentSystem = new PaymentSystem();
        LawyerHiringSystem system = new LawyerHiringSystem(clientManager, lawyerManager, paymentSystem);

        // Input untuk Klien
        System.out.println("=== Input Data Klien ===");
        System.out.print("Masukkan nama klien: ");
        String namaKlien = scanner.nextLine();
        System.out.print("Masukkan kontak klien: ");
        String kontakKlien = scanner.nextLine();
        Client client1 = new Client(namaKlien, kontakKlien);
        clientManager.tambahClient(client1);

        // Input untuk Pengacara
        System.out.println("\n=== Input Data Pengacara ===");
        System.out.print("Masukkan nama pengacara: ");
        String namaPengacara = scanner.nextLine();
        System.out.print("Masukkan spesialisasi pengacara: ");
        String spesialisasiPengacara = scanner.nextLine();
        Lawyer pengacara1 = new Lawyer(namaPengacara, spesialisasiPengacara, true);
        lawyerManager.tambahLawyer(pengacara1);

        // Proses Penyewaan Pengacara
        System.out.println("\nApakah Anda ingin menyewa pengacara? (ya/tidak)");
        String jawabanSewa = scanner.nextLine();

        if (jawabanSewa.equalsIgnoreCase("ya")) {
            System.out.print("Masukkan jumlah pembayaran: ");
            float jumlahPembayaran = scanner.nextFloat();
            scanner.nextLine();  // Consume newline
            System.out.print("Masukkan status pembayaran (Lunas/Belum Lunas): ");
            String statusPembayaran = scanner.nextLine();

            boolean sukses = system.sewaLawyer(client1, pengacara1, jumlahPembayaran, statusPembayaran);
            if (sukses) {
                // Proses Pembatalan Sewa
                System.out.println("\nApakah Anda ingin membatalkan sewa pengacara? (ya/tidak)");
                String jawabanBatal = scanner.nextLine();

                if (jawabanBatal.equalsIgnoreCase("ya")) {
                    system.batalkanSewa(client1, pengacara1);
                }
            }
        }

        System.out.println("\nTerima kasih telah menggunakan layanan kami!");
        scanner.close();
    }
}
