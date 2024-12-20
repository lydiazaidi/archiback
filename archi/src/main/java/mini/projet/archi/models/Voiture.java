package mini.projet.archi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import mini.projet.archi.enumeration.Disponibilite;

@Entity
public class Voiture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_voiture;
    private String modele;
    private Float prix;

    @Enumerated(EnumType.STRING)
    private Disponibilite disponibilite;
    private Date date_disponibilite;
    private String photo;

    public long getIdVoiture() {
        return id_voiture;
    }

    public void setIdVoiture(long id_voiture) {
        this.id_voiture = id_voiture;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public Disponibilite getDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(Disponibilite disponibilite) {
        this.disponibilite = disponibilite;
    }

    public Date getDateDisponibilite() {
        return date_disponibilite;
    }

    public void setDateDisponibilite(Date date_disponibilite) {
        this.date_disponibilite = date_disponibilite;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }


    
}