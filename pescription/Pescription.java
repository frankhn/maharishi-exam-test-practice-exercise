import java.util.*;

public class Pescription {
    private String id;
    private String drug;
    private String amount;
    private String patientName;

    public Pescription() {
    
        
    }

    public Pescription(String vitamin) {
        this.drug = vitamin;
    }

    public Pescription(String id, String drug, String amount, String patientName) {
        this.id = id;
        this.drug = drug;
        this.amount = amount;
        this.patientName = patientName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDrug() {
        return drug;
    }

    public void setDrug(String drug) {
        this.drug = drug;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }


    public static void main(String[] args) {
        Pescription p1 = new Pescription("P1", "Synthroid", "$10", "Wanda Lock");
        Pescription p2 = new Pescription("P2", "Vitamin", "$15", "Clarissa Coleman");
        Pescription p3 = new Pescription("P3", "Advil", "$20", "Derek Welborn");
        
        Pescription p4 = new Pescription("Vitamin");

        System.out.println(p2.getAmount());
        System.out.println(p4.getAmount());
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
    }
}
