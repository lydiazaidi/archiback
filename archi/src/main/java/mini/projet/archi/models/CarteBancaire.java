package mini.projet.archi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CarteBancaire {
    @Id
    private String numeroCarte;
    private Date dateExpiration;
    private String cvv;

    public String getCvv() {
        return cvv;
    }
    public Date getDateExpiration() {
        return dateExpiration;
    }
    public String getNumeroCarte() {
        return numeroCarte;
    }
    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
     public void setDateExpiration(Date dateExpiration) {
         this.dateExpiration = dateExpiration;
     }

     public void setNumeroCarte(String numeroCarte) {
         this.numeroCarte = numeroCarte;
     }
}

