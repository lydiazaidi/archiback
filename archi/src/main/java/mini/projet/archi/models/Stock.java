package mini.projet.archi.models;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStock;
    private Integer quantite;

    public void setIdStock(Long idStock) {
        this.idStock = idStock;
    }
    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }
    public Long getIdStock() {
        return idStock;
    }
    public Integer getQuantite() {
        return quantite;
    }
    
}