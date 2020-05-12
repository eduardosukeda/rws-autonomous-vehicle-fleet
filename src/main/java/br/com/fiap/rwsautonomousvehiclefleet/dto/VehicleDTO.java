package br.com.fiap.rwsautonomousvehiclefleet.dto;

public class VehicleDTO {

    private Integer id;
    private Boolean available;
    private String carBrand;
    private String carModel;
    private String carLicensePlate;
    private String localization;

    public VehicleDTO() {
    }

    public VehicleDTO(Integer id, Boolean available, String carBrand, String carModel, String carLicensePlate, String localization) {
        this.id = id;
        this.available = available;
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carLicensePlate = carLicensePlate;
        this.localization = localization;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarLicensePlate() {
        return carLicensePlate;
    }

    public void setCarLicensePlate(String carLicensePlate) {
        this.carLicensePlate = carLicensePlate;
    }

    public String getLocalization() {
        return localization;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
    }
}
