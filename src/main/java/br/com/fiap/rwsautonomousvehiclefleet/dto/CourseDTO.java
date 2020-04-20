package br.com.fiap.rwsautonomousvehiclefleet.dto;

import java.math.BigDecimal;
import java.sql.Time;

public class CourseDTO {

    private Integer idUser;
    private Integer idVehicle;
    private BigDecimal price;
    private String departureAddress;
    private String destinationAddress;
    private Time timeToUser;
    private Time timeToDestination;
    private Integer status;

    public CourseDTO() {
    }

    public CourseDTO(Integer idUser, Integer idVehicle, BigDecimal price, String departureAddress, String destinationAddress, Time timeToUser, Time timeToDestination, Integer status) {
        this.idUser = idUser;
        this.idVehicle = idVehicle;
        this.price = price;
        this.departureAddress = departureAddress;
        this.destinationAddress = destinationAddress;
        this.timeToUser = timeToUser;
        this.timeToDestination = timeToDestination;
        this.status = status;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getIdVehicle() {
        return idVehicle;
    }

    public void setIdVehicle(Integer idVehicle) {
        this.idVehicle = idVehicle;
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
