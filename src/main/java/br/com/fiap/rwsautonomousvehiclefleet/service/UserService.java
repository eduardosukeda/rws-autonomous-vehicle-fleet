package br.com.fiap.rwsautonomousvehiclefleet.service;

import br.com.fiap.rwsautonomousvehiclefleet.dto.UserDTO;

import java.util.List;

public interface UserService {

    public List<UserDTO> getAll();
    public UserDTO get(Integer id);
    public UserDTO create(UserDTO userDTO);
    public UserDTO update(Integer id, UserDTO userDTO);
    public void delete(Integer id);
}
