package tugas1.business;

import tugas1.interfaces.*;
import tugas1.entities.*;
import java.util.ArrayList;
import java.util.List;

public class PaymentSystem implements IPayment {
    @Override
    public boolean prosesPembayaran(Payment payment) {
        // Misalnya, pembayaran dianggap berhasil jika jumlah > 0 dan status "Lunas"
        if (payment.getJumlah() > 0 && payment.getStatus().equalsIgnoreCase("Lunas")) {
            System.out.println("Pembayaran sebesar " + payment.getJumlah() +
                               " untuk kasus " + payment.getCases().getIdCases() + " diproses.");
            return true;
        } else if (payment.getJumlah() > 0 && payment.getStatus().equalsIgnoreCase("Belum Lunas")) {
            System.out.println("Pembayaran sebesar " + payment.getJumlah() +
                               " untuk kasus " + payment.getCases().getIdCases() + " diproses.");
            System.out.println("Anda memiliki sisa pembayaran yang harus dibayarkan ketika kasus selesai.");
            return true;
        }
        System.out.println("Pembayaran gagal untuk kasus " + payment.getCases().getIdCases() + ".");
        return false;
    }
}
