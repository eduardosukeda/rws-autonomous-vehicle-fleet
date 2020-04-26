package br.com.fiap.rwsautonomousvehiclefleet.repository;

import br.com.fiap.rwsautonomousvehiclefleet.entity.Vehicle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

    @Query(value = "select v from Vehicle v where v.available = true order by v.id desc")
    Page<Vehicle> findVehicleAvailable(Pageable pageable);
}