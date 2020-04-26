package br.com.fiap.rwsautonomousvehiclefleet.service.impl;

import br.com.fiap.rwsautonomousvehiclefleet.dto.CourseDTO;
import br.com.fiap.rwsautonomousvehiclefleet.dto.StatusEnum;
import br.com.fiap.rwsautonomousvehiclefleet.entity.Course;
import br.com.fiap.rwsautonomousvehiclefleet.entity.User;
import br.com.fiap.rwsautonomousvehiclefleet.entity.Vehicle;
import br.com.fiap.rwsautonomousvehiclefleet.repository.CourseRepository;
import br.com.fiap.rwsautonomousvehiclefleet.repository.UserRepository;
import br.com.fiap.rwsautonomousvehiclefleet.repository.VehicleRepository;
import br.com.fiap.rwsautonomousvehiclefleet.service.CourseService;
import br.com.fiap.rwsautonomousvehiclefleet.util.Util;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

    private CourseRepository courseRepository;
    private VehicleRepository vehicleRepository;
    private UserRepository userRepository;

    public CourseServiceImpl(CourseRepository courseRepository, VehicleRepository vehicleRepository, UserRepository userRepository) {
        this.courseRepository = courseRepository;
        this.vehicleRepository = vehicleRepository;
        this.userRepository = userRepository;
    }

    @Override
    public CourseDTO create(Integer userId, String departureAddress, String destinationAddress) {

        Integer timeToDestination = Util.generateMinutes();
        Integer timeToUser = Util.generateMinutes();
        CourseDTO courseDTO = new CourseDTO();
        courseDTO.setStatus(StatusEnum.EM_ANALISE.getValor());
        courseDTO.setDestinationAddress(destinationAddress);
        courseDTO.setDepartureAddress(departureAddress);
        courseDTO.setTimeToDestination(timeToDestination);
        courseDTO.setTimeToUser(timeToUser);
        courseDTO.setTimeLeftToReachDestination(timeToDestination);
        courseDTO.setTimeLeftToReachUser(timeToUser);
        courseDTO.setPrice(Util.generatePriceCourse());
        User user = userRepository.getOne(userId);
        Vehicle vehicle = findVehicleAvailable();
        courseDTO.setVehicleStartingLocation(vehicle.getLocalization());
        Course course = courseRepository.save(convertToEntity(courseDTO, user, vehicle));
        return convertToDTO(course, user, vehicle);
    }

    @Override
    public CourseDTO get(String id) {
        return convertToGetDTO(courseRepository.getOne(id));
    }

    @Override
    public CourseDTO update(String id, StatusEnum status) {
        return null;
    }

    @Async
    public void start() {
        Integer min = 1;
        Integer max = 5;
        Integer numRandom = (int) (Math.random() * (max - min + 1) + min);
        int minute = 0;
        Integer time = numRandom;

        try {
            for (int i = 1; i <= (numRandom * 60); i++) {
                if (minute == 0) {
                    System.out.println("" + time.toString());
                }
                minute++;

                if (minute == 60) {
                    time--;
                    System.out.println("" + time.toString());
                    minute = 0;
                }
                Thread.sleep(1000);
                Thread.yield();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Vehicle findVehicleAvailable() {
        Pageable topOne = PageRequest.of(0, 1);
        Page pageVehicle = vehicleRepository.findVehicleAvailable(topOne);
        return (Vehicle) pageVehicle.getContent().get(0);
    }

    private Course convertToEntity(CourseDTO courseDTO, User user, Vehicle vehicle) {

        Course course = new Course();
        course.setUser(user);
        course.setVehicle(vehicle);
        course.setPrice(courseDTO.getPrice());
        course.setDepartureAddress(courseDTO.getDepartureAddress());
        course.setDestinationAddress(courseDTO.getDestinationAddress());
        course.setTimeToUser(courseDTO.getTimeToUser());
        course.setTimeToDestination(courseDTO.getTimeToDestination());
        course.setTimeLeftToReachDestination(courseDTO.getTimeLeftToReachDestination());
        course.setTimeLeftToReachUser(courseDTO.getTimeLeftToReachUser());
        course.setVehicleStartingLocation(courseDTO.getVehicleStartingLocation());
        course.setStatus(courseDTO.getStatus());
        return course;
    }

    private CourseDTO convertToDTO(Course course, User user, Vehicle vehicle) {

        CourseDTO courseDTO = new CourseDTO();
        courseDTO.setId(course.getId());
        courseDTO.setUserId(user.getId());
        courseDTO.setVehicleId(vehicle.getId());
        courseDTO.setPrice(course.getPrice());
        courseDTO.setDepartureAddress(course.getDepartureAddress());
        courseDTO.setDestinationAddress(course.getDestinationAddress());
        courseDTO.setTimeToUser(course.getTimeToUser());
        courseDTO.setTimeToDestination(course.getTimeToDestination());
        courseDTO.setTimeLeftToReachDestination(course.getTimeLeftToReachDestination());
        courseDTO.setTimeLeftToReachUser(course.getTimeLeftToReachUser());
        courseDTO.setVehicleStartingLocation(vehicle.getLocalization());
        courseDTO.setStatus(course.getStatus());
        return courseDTO;
    }

    private CourseDTO convertToGetDTO(Course course) {

        CourseDTO courseDTO = new CourseDTO();
        courseDTO.setId(course.getId());
        courseDTO.setUserId(course.getUser().getId());
        courseDTO.setVehicleId(course.getVehicle().getId());
        courseDTO.setPrice(course.getPrice());
        courseDTO.setDepartureAddress(course.getDepartureAddress());
        courseDTO.setDestinationAddress(course.getDestinationAddress());
        courseDTO.setTimeToUser(course.getTimeToUser());
        courseDTO.setTimeToDestination(course.getTimeToDestination());
        courseDTO.setTimeLeftToReachDestination(course.getTimeLeftToReachDestination());
        courseDTO.setTimeLeftToReachUser(course.getTimeLeftToReachUser());
        courseDTO.setVehicleStartingLocation(course.getVehicleStartingLocation());
        courseDTO.setStatus(course.getStatus());
        return courseDTO;
    }
}