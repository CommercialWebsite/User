package com.user.user;

import com.user.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import com.user.user.UserAdapter;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public List<UserDTO> getList() {
        return UserAdapter.listToUserDTO(userRepository.findAll());
    }

    @Override
    public List<UserDTO> getListAdmin() {
        return UserAdapter.listToUserDTO(userRepository.findByType("admin"));
    }

    @Override
    public UserDTO createAccount(UserDTO userDTO) {
        User user=User.builder().id(userDTO.getId()).email(userDTO.getEmail()).login(userDTO.getLogin()).name(userDTO.getName()).type(userDTO.getType()).lastName(userDTO.getLastName()).cp(userDTO.getCp()).addresse(userDTO.getAddresse()).ville(userDTO.getVille()).build();
        userRepository.insert(user);
        return userDTO;
    }

    @Override
    public UserDTO deleteAccount(String id) {
        User user=userRepository.findById(id);
        UserDTO userDTO = UserAdapter.toUserDTO(user);
        userRepository.delete(user.getId());
        return userDTO;
    }

    @Override
    public UserDTO updateAccount(UserDTO userDTO) {
        User user = UserAdapter.toUserEntity(userDTO);
        userRepository.save(user);
        return userDTO;
    }

    @Override
    public UserDTO getUserByLogin(String login) {
        return UserAdapter.toUserDTO(userRepository.findByLogin(login));
    }
}