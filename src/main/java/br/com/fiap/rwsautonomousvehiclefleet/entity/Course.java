package br.com.fiap.rwsautonomousvehiclefleet.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Time;

@Entity
@Table(name = "TB_COURSE")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private User user;
    @OneToOne
    private Vehicle vehicle;
    private BigDecimal price;
    private String departureAddress;
    private String destinationAddress;
    private Time timeToUser;
    private Time timeToDestination;
    private Integer status;

    public Course() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDepartureAddress() {
        return departureAddress;
    }

    public void setDepartureAddress(String departureAddress) {
        this.departureAddress = departureAddress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public Time getTimeToUser() {
        return timeToUser;
    }

    public void setTimeToUser(Time timeToUser) {
        this.timeToUser = timeToUser;
    }

    public Time getTimeToDestination() {
        return timeToDestination;
    }

    public void setTimeToDestination(Time timeToDestination) {
        this.timeToDestination = timeToDestination;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
