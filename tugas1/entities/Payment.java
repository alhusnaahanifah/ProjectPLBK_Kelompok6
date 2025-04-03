package tugas1.entities;

public class Payment {
    private float jumlah;
    private String status;
    // Payment sekarang terkait langsung dengan Kasus
    private Cases cases;

    public Payment(float jumlah, String status, Cases cases) {
        this.jumlah = jumlah;
        this.status = status;
        this.cases = cases;
    }

    public float getJumlah() {
        return jumlah;
    }

    public String getStatus() {
        return status;
    }
    
    public Cases getCases() {
        return cases;
    }
}