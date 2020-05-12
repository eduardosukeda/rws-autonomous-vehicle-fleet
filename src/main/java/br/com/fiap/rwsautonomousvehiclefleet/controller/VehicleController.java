package br.com.fiap.rwsautonomousvehiclefleet.controller;

import br.com.fiap.rwsautonomousvehiclefleet.dto.VehicleDTO;
import br.com.fiap.rwsautonomousvehiclefleet.service.VehicleService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("vehicle")
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping
    public List<VehicleDTO> getAll() {
        return vehicleService.getAll();
    }

    @GetMapping("{id}")
    public VehicleDTO get(@PathVariable Integer id) {
        return vehicleService.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public VehicleDTO create(@RequestBody @Valid VehicleDTO vehicleDTO) {
        return vehicleService.create(vehicleDTO);
    }

    @PutMapping("{id}")
    public VehicleDTO update(@PathVariable Integer id, @RequestBody VehicleDTO vehicleDTO){
        return vehicleService.update(id, vehicleDTO);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id){
        vehicleService.delete(id);
    }
}
