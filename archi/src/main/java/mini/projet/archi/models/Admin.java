package mini.projet.archi.models;
import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAdmin;
    private String nom;
    private String motDePasse;

    @Enumerated(EnumType.STRING)
    private Role role;
    public void setIdAdmin(Long idAdmin) {
        this.idAdmin = idAdmin;
    }
    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setRole(Role role) {
        this.role = role;
    }
    public Long getIdAdmin() {
        return idAdmin;
    }
    public String getMotDePasse() {
        return motDePasse;
    }
    public String getNom() {
        return nom;
    }
    public Role getRole() {
        return role;
    }
    
}
