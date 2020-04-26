package br.com.fiap.rwsautonomousvehiclefleet.repository;

import br.com.fiap.rwsautonomousvehiclefleet.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

    @Query(value = "select c from Course c where c.id = :id")
    public Course getOne(@Param("id") String id);
}
