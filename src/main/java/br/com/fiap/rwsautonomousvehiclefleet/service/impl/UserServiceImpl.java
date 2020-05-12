package br.com.fiap.rwsautonomousvehiclefleet.service.impl;

import br.com.fiap.rwsautonomousvehiclefleet.dto.UserDTO;
import br.com.fiap.rwsautonomousvehiclefleet.entity.User;
import br.com.fiap.rwsautonomousvehiclefleet.repository.UserRepository;
import br.com.fiap.rwsautonomousvehiclefleet.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDTO> getAll() {

        List<UserDTO> listUserDTO = new ArrayList<UserDTO>();

        for (int i = 0; i < userRepository.findAll().size(); i++) {
            listUserDTO.add(convertToDTO(userRepository.findAll().get(i)));
        }

        return listUserDTO;
    }

    @Override
    public UserDTO get(Integer id) {
        return convertToDTO(userRepository.getOne(id));
    }

    @Override
    public UserDTO create(UserDTO userDTO) {
        return convertToDTO(userRepository.save(convertToEntity(userDTO)));
    }

    @Override
    public UserDTO update(Integer id, UserDTO userDTO) {

        User user = userRepository.getOne(id);
        user.setCpf(userDTO.getCpf());
        user.setName(userDTO.getName());
        userRepository.save(user);
        return convertToDTO(user);
    }

    @Override
    public void delete(Integer id) {
        User user = userRepository.getOne(id);
        userRepository.delete(user);
    }

    private UserDTO convertToDTO(User user) {

        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setCpf(user.getCpf());
        userDTO.setName(user.getName());
        return userDTO;
    }

    private User convertToEntity(UserDTO userDTO) {

        User user = new User();
        user.setCpf(userDTO.getCpf());
        user.setName(userDTO.getName());
        return user;
    }
}
