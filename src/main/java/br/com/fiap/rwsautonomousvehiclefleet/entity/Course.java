package br.com.fiap.rwsautonomousvehiclefleet.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "TB_COURSE")
public class Course {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String id;
    @OneToOne
    private User user;
    @OneToOne
    private Vehicle vehicle;
    private BigDecimal price;
    private String departureAddress;
    private String destinationAddress;
    private Integer timeToUser;
    private Integer timeToDestination;
    private Integer timeLeftToReachDestination;
    private Integer timeLeftToReachUser;
    private String vehicleStartingLocation;
    private Integer status;

    public Course() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public Integer getTimeToUser() {
        return timeToUser;
    }

    public void setTimeToUser(Integer timeToUser) {
        this.timeToUser = timeToUser;
    }

    public Integer getTimeToDestination() {
        return timeToDestination;
    }

    public void setTimeToDestination(Integer timeToDestination) {
        this.timeToDestination = timeToDestination;
    }

    public Integer getTimeLeftToReachDestination() {
        return timeLeftToReachDestination;
    }

    public void setTimeLeftToReachDestination(Integer timeLeftToReachDestination) {
        this.timeLeftToReachDestination = timeLeftToReachDestination;
    }

    public Integer getTimeLeftToReachUser() {
        return timeLeftToReachUser;
    }

    public void setTimeLeftToReachUser(Integer timeLeftToReachUser) {
        this.timeLeftToReachUser = timeLeftToReachUser;
    }

    public String getVehicleStartingLocation() {
        return vehicleStartingLocation;
    }

    public void setVehicleStartingLocation(String vehicleStartingLocation) {
        this.vehicleStartingLocation = vehicleStartingLocation;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
