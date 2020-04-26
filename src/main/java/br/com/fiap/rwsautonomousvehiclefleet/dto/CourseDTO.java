package br.com.fiap.rwsautonomousvehiclefleet.dto;

import java.math.BigDecimal;

public class CourseDTO {

    private String id;
    private Integer userId;
    private Integer vehicleId;
    private BigDecimal price;
    private String departureAddress;
    private String destinationAddress;
    private Integer timeToUser;
    private Integer timeToDestination;
    private Integer timeLeftToReachDestination;
    private Integer timeLeftToReachUser;
    private String vehicleStartingLocation;
    private Integer status;

    public CourseDTO() {
    }

    public CourseDTO(String id, Integer userId, Integer vehicleId, BigDecimal price, String departureAddress, String destinationAddress, Integer timeToUser, Integer timeToDestination, Integer timeLeftToReachDestination, Integer timeLeftToReachUser, String vehicleStartingLocation, Integer status) {
        this.id = id;
        this.userId = userId;
        this.vehicleId = vehicleId;
        this.price = price;
        this.departureAddress = departureAddress;
        this.destinationAddress = destinationAddress;
        this.timeToUser = timeToUser;
        this.timeToDestination = timeToDestination;
        this.timeLeftToReachDestination = timeLeftToReachDestination;
        this.timeLeftToReachUser = timeLeftToReachUser;
        this.vehicleStartingLocation = vehicleStartingLocation;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
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
