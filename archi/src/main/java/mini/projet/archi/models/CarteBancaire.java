package mini.projet.archi.models;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class CarteBancaire {
    @Id
    private String numero_carte;
    private Date date_expiration;
    private String cvv;

    public String getCvv() {
        return cvv;
    }
    public Date getDateExpiration() {
        return date_expiration;
    }
    public String getNumeroCarte() {
        return numero_carte;
    }
    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
     public void setDateExpiration(Date dateExpiration) {
         this.date_expiration = dateExpiration;
     }

     public void setNumeroCarte(String numeroCarte) {
         this.numero_carte = numeroCarte;
     }
}

