package com.exrule.demotest.service;

import com.exrule.demotest.controller.dto.UserDTO;
import com.exrule.demotest.model.User;

import java.util.Optional;

public interface UserService {
    User registration(UserDTO dto);
    Optional<User> findByUsername(String username);
    String login(UserDTO dto);
}
