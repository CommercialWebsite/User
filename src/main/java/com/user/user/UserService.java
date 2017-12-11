package com.user.user;

import java.util.List;
import java.util.Map;


public interface UserService {
    public List<UserDTO> getList();
    public List<UserDTO> getListAdmin();

    public UserDTO createAccount(UserDTO userDTO);

    public UserDTO deleteAccount(String id);
    public UserDTO updateAccount(UserDTO userDTO);
    public UserDTO getUserByLogin(String login);

}
