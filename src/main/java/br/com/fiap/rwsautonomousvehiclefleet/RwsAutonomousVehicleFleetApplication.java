package br.com.fiap.rwsautonomousvehiclefleet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class RwsAutonomousVehicleFleetApplication {

	public static void main(String[] args) {
		SpringApplication.run(RwsAutonomousVehicleFleetApplication.class, args);
	}

}
