package br.com.fiap.rwsautonomousvehiclefleet.service;

import br.com.fiap.rwsautonomousvehiclefleet.dto.UserDTO;

public interface UserService {

    public UserDTO get(Integer id);
    public UserDTO create(UserDTO userDTO);
    public UserDTO update(Integer id, UserDTO userDTO);
    public void delete(Integer id);
}
