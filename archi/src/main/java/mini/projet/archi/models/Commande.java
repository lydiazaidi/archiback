package mini.projet.archi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommande;
    private Date dateCommande;
    private Float montantTotal;

    @Enumerated(EnumType.STRING)
    private EtatCommande etatCommande;

    public Date getDateCommande() {
        return dateCommande;
    }
    public EtatCommande getEtatCommande() {
        return etatCommande;
    }
    public Long getIdCommande() {
        return idCommande;
    }
    public Float getMontantTotal() {
        return montantTotal;
    }
    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }
    public void setEtatCommande(EtatCommande etatCommande) {
        this.etatCommande = etatCommande;
    }
    public void setIdCommande(Long idCommande) {
        this.idCommande = idCommande;
    }
    public void setMontantTotal(Float montantTotal) {
        this.montantTotal = montantTotal;
    }
    
}
