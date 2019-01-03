package soa.if5.rentacar.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Car implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String matricule;

    private String color;

    @ManyToOne(targetEntity = Marque.class)
    private Marque marque;

    @OneToMany(mappedBy = "idReservation")
    private List<CarReservation> reservationList;

    public Car() {
    }
    public Car(String matricule, String color, Marque marque, List<CarReservation> reservationList) {
        this.matricule = matricule;
        this.color = color;
        this.marque = marque;
        this.reservationList = reservationList;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public Marque getMarque() {
        return marque;
    }
    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    public List<CarReservation> getReservationList() {
        return reservationList;
    }
    public void setReservationList(List<CarReservation> reservationList) {
        this.reservationList = reservationList;
    }
}
