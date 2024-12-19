package mini.projet.archi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Voiture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVoiture;
    private String modele;
    private Float prix;

    @Enumerated(EnumType.STRING)
    private Disponibilite disponibilite;
    private Date dateDisponibilite;
    private String photo;

    
}