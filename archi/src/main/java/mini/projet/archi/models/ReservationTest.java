package mini.projet.archi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ReservationTest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;
    private Date dateTest;
    private String etat;

    public Date getDateTest() {
        return dateTest;
    }
    public String getEtat() {
        return etat;
    }
    public Long getIdReservation() {
        return idReservation;
    }
    public void setDateTest(Date dateTest) {
        this.dateTest = dateTest;
    }
    public void setEtat(String etat) {
        this.etat = etat;
    }
    public void setIdReservation(Long idReservation) {
        this.idReservation = idReservation;
    }
    
}