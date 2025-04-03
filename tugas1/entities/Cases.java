package tugas1.entities;

public class Cases {
    private String idCases;
    private Client client;
    private Lawyer lawyer;
    private String status;

    public Cases(String idCases, Client client, Lawyer lawyer, String status) {
        this.idCases = idCases;
        this.client = client;
        this.lawyer = lawyer;
        this.status = status;
    }
    
    public String getIdCases() {
        return idCases;
    }
    
    public Client getClient() {
        return client;
    }
    
    public Lawyer getPengacara() {
        return lawyer;
    }
}