package com.example.homeworkDP.service;

import com.example.homeworkDP.dto.UserRegisterRequest;
import com.example.homeworkDP.dto.UserResponse;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserResponse saveUser(UserRegisterRequest request);

    UserResponse getUser(Long id);

    void deleteUser(Long id);
}
