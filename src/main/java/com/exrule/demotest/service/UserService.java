package com.exrule.demotest.service;

import com.exrule.demotest.controller.dto.UserDto;
import com.exrule.demotest.model.User;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface UserService {
    User registration(UserDto dto);
    Optional<User> findByUsername(String username);
    ResponseEntity<?> login(UserDto dto);
}
