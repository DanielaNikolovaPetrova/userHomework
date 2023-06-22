package com.example.homeworkDP.service.impl;

import com.example.homeworkDP.converter.UserConverter;
import com.example.homeworkDP.dto.UserRegisterRequest;
import com.example.homeworkDP.dto.UserResponse;
import com.example.homeworkDP.entity.User;
import com.example.homeworkDP.repository.UserRepository;
import com.example.homeworkDP.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserConverter userConverter;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserConverter userConverter) {
        this.userRepository = userRepository;
        this.userConverter = userConverter;
    }

    @Override
    public UserResponse saveUser(UserRegisterRequest request) {
        User user = userConverter.toUser(request);

        User savedUser = userRepository.save(user);

        return userConverter.toResponse(savedUser);
    }

    @Override
    public UserResponse getUser(Long id) {
        User user = userRepository.findById(id).get();
        return userConverter.toResponse(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
