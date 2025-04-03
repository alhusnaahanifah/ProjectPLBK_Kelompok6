# ProjectPLBK_Kelompok6

# Lawyer Hiring System

Sistem ini memungkinkan klien untuk menyewa pengacara dengan pembayaran otomatis.

## Fitur
- **Menambahkan Klien**: Klien dapat ditambahkan ke dalam sistem.
- **Menambahkan Pengacara**: Pengacara dapat didaftarkan dalam sistem.
- **Menyewa Pengacara**: Klien dapat menyewa pengacara dengan pembayaran.
- **Pembatalan Sewa**: Klien dapat membatalkan sewa pengacara.
- **Proses Pembayaran**: Sistem mengelola pembayaran berdasarkan statusnya.

## Struktur Proyek
```
tugas1/
│── business/        # Berisi logika bisnis
│   ├── ClientManager.java
│   ├── LawyerManager.java
│   ├── LawyerHiringSystem.java
│   ├── PaymentSystem.java
│
│── entities/        # Berisi entitas utama
│   ├── Cases.java
│   ├── Client.java
│   ├── Lawyer.java
│   ├── Payment.java
│
│── interfaces/      # Berisi antarmuka (interface)
│   ├── ICancelHire.java
│   ├── IClientMgt.java
│   ├── ILawyerMgt.java
│   ├── IMakeHire.java
│   ├── IPayment.java
│
│── MainPro.java     # Program utama
│── README.md        # Dokumentasi proyek
```

## Cara Menjalankan

1. **Kompilasi semua file Java**:
   ```sh
   javac -d . interfaces/*.java entities/*.java business/*.java MainPro.java
   ```
2. **Jalankan program**:
   ```sh
   java tugas1.MainPro
   ```

## Contoh Penggunaan
Saat program dijalankan, pengguna dapat memasukkan data seperti nama klien, nama pengacara, jumlah pembayaran, dan status pembayaran.

```sh
Masukkan nama klien: Ranti
Masukkan kontak klien: 08123456789
Masukkan nama pengacara: Andi
Masukkan spesialisasi pengacara: Pidana
Masukkan jumlah pembayaran: 5000000
Masukkan status pembayaran (Lunas/Belum Lunas): Lunas
Pengacara Andi berhasil disewa oleh Ranti.
```

## Kontribusi
Jika ingin berkontribusi dalam proyek ini:
1. Fork repository ini.
2. Buat branch baru (`git checkout -b fitur-baru`).
3. Commit perubahan (`git commit -m "Menambahkan fitur baru"`).
4. Push ke branch (`git push origin fitur-baru`).
5. Buat Pull Request.
