package mini.projet.archi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;
    private String nom;
    private String email;
    private String motDePasse;
    private String telephone;
    private String adresse;

    public String getAdresse() {
        return adresse;
    }
    public String getEmail() {
        return email;
    }
    public Long getIdClient() {
        return idClient;
    }
    public String getMotDePasse() {
        return motDePasse;
    }
    public String getNom() {
        return nom;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }
    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    
}

