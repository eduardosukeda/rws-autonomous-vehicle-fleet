package br.com.fiap.rwsautonomousvehiclefleet.repository;

import br.com.fiap.rwsautonomousvehiclefleet.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
