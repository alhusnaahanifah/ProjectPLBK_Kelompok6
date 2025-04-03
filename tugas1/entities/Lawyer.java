package tugas1.entities;

public class Lawyer {
    private String nama;
    private String spesialisasi;
    private boolean tersedia;

    public Lawyer(String nama, String spesialisasi, boolean tersedia) {
        this.nama = nama;
        this.spesialisasi = spesialisasi;
        this.tersedia = tersedia;
    }

    public String getNama() {
        return nama;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }
}

