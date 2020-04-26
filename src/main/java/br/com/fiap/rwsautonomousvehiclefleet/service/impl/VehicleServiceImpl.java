package br.com.fiap.rwsautonomousvehiclefleet.service.impl;

import br.com.fiap.rwsautonomousvehiclefleet.dto.VehicleDTO;
import br.com.fiap.rwsautonomousvehiclefleet.entity.Vehicle;
import br.com.fiap.rwsautonomousvehiclefleet.repository.VehicleRepository;
import br.com.fiap.rwsautonomousvehiclefleet.service.VehicleService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements VehicleService {

    private VehicleRepository vehicleRepository;

    public VehicleServiceImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public VehicleDTO get(Integer id) {
        return convertToDTO(vehicleRepository.getOne(id));
    }

    @Override
    public VehicleDTO create(VehicleDTO vehicleDTO) {
        return convertToDTO(vehicleRepository.save(convertToEntity(vehicleDTO)));
    }

    @Override
    public VehicleDTO update(Integer id, VehicleDTO vehicleDTO) {

        Vehicle vehicle = vehicleRepository.getOne(id);
        vehicle.setAvailable(vehicleDTO.getAvailable());
        vehicle.setCarBrand(vehicleDTO.getCarBrand());
        vehicle.setCarLicensePlate(vehicleDTO.getCarLicensePlate());
        vehicle.setCarModel(vehicleDTO.getCarModel());
        vehicle.setLocalization(vehicleDTO.getLocalization());
        vehicleRepository.save(vehicle);
        return convertToDTO(vehicle);
    }

    @Override
    public void delete(Integer id) {
        Vehicle vehicle = vehicleRepository.getOne(id);
        vehicleRepository.delete(vehicle);
    }

    @Override
    public VehicleDTO findVehicleAvailable(){
        Pageable topOne = PageRequest.of(0, 1);
        Page pageVehicle = vehicleRepository.findVehicleAvailable(topOne);
        Vehicle vehicle = (Vehicle) pageVehicle.getContent().get(0);
        return convertToDTO(vehicle);
    }

    private VehicleDTO convertToDTO(Vehicle vehicle) {

        VehicleDTO vehicleDTO = new VehicleDTO();
        vehicleDTO.setAvailable(vehicle.getAvailable());
        vehicleDTO.setCarBrand(vehicle.getCarBrand());
        vehicleDTO.setCarLicensePlate(vehicle.getCarLicensePlate());
        vehicleDTO.setCarModel(vehicle.getCarModel());
        vehicleDTO.setLocalization(vehicle.getLocalization());
        return vehicleDTO;
    }

    private Vehicle convertToEntity(VehicleDTO vehicleDTO){

        Vehicle vehicle = new Vehicle();
        vehicle.setAvailable(vehicleDTO.getAvailable());
        vehicle.setCarBrand(vehicleDTO.getCarBrand());
        vehicle.setCarLicensePlate(vehicleDTO.getCarLicensePlate());
        vehicle.setCarModel(vehicleDTO.getCarModel());
        vehicle.setLocalization(vehicleDTO.getLocalization());
        return vehicle;
    }
}
