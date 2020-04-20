package br.com.fiap.rwsautonomousvehiclefleet.repository;

import br.com.fiap.rwsautonomousvehiclefleet.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
