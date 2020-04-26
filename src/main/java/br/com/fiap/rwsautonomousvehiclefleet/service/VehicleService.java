package br.com.fiap.rwsautonomousvehiclefleet.service;

import br.com.fiap.rwsautonomousvehiclefleet.dto.VehicleDTO;

public interface VehicleService {

    public VehicleDTO get(Integer id);
    public VehicleDTO create(VehicleDTO vehicleDTO);
    public VehicleDTO update(Integer id, VehicleDTO vehicleDTO);
    public void delete(Integer id);
    public VehicleDTO findVehicleAvailable();
}