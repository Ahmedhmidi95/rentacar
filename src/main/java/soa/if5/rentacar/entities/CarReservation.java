package soa.if5.rentacar.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Date;

@Entity
public class CarReservation implements Serializable {

    @Id
    @GeneratedValue
    private Long idReservation;

    @ManyToOne(targetEntity = Car.class)
    private Car car;

    private Date dateFrom;

    private Date dateTo;

    private String pickupLocation;

    private CarReservation(){

    }
    public CarReservation(Car car, Date dateFrom, Date dateTo, String pickupLocation) {
        this.car = car;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.pickupLocation = pickupLocation;
    }

    public Long getIdReservation() {
        return idReservation;
    }
    public void setIdReservation(Long idReservation) {
        this.idReservation = idReservation;
    }

    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }

    public Date getDateFrom() {
        return dateFrom;
    }
    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }
    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }
    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }
}
