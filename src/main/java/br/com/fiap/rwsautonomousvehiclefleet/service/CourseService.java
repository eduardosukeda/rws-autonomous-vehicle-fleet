package br.com.fiap.rwsautonomousvehiclefleet.service;

import br.com.fiap.rwsautonomousvehiclefleet.dto.CourseDTO;
import br.com.fiap.rwsautonomousvehiclefleet.dto.StatusEnum;

public interface CourseService {

    public CourseDTO create(Integer userId, String departureAddress, String destinationAddress);
    public CourseDTO get(String id);
    public void update(String id, StatusEnum status);
}
