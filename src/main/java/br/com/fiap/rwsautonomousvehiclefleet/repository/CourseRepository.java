package br.com.fiap.rwsautonomousvehiclefleet.repository;

import br.com.fiap.rwsautonomousvehiclefleet.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
