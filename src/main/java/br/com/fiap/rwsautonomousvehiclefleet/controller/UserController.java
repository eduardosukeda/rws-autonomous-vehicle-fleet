package br.com.fiap.rwsautonomousvehiclefleet.controller;

import br.com.fiap.rwsautonomousvehiclefleet.dto.UserDTO;
import br.com.fiap.rwsautonomousvehiclefleet.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("{id}")
    public UserDTO get(@PathVariable Integer id) {
        return userService.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDTO create(@RequestBody @Valid UserDTO userDTO) {
        return userService.create(userDTO);
    }

    @PutMapping("{id}")
    public UserDTO update(@PathVariable Integer id, @RequestBody UserDTO userDTO){
        return userService.update(id, userDTO);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id){
        userService.delete(id);
    }
}
