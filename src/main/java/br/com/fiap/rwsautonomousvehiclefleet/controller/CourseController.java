package br.com.fiap.rwsautonomousvehiclefleet.controller;

import br.com.fiap.rwsautonomousvehiclefleet.dto.CourseDTO;
import br.com.fiap.rwsautonomousvehiclefleet.dto.StatusEnum;
import br.com.fiap.rwsautonomousvehiclefleet.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("course")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("{id}")
    public CourseDTO get(@PathVariable String id) {
        return courseService.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CourseDTO create(@RequestParam Integer userId, @RequestParam String departureAddress, @RequestParam String destinationAddress) {
        return courseService.create(userId, departureAddress, destinationAddress);
    }

    @PutMapping("{id}/{status}")
    public CourseDTO update(@PathVariable String id, @PathVariable StatusEnum status){
        return courseService.update(id, status);
    }
}
