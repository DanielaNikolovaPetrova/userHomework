package com.example.homeworkDP.converter;

import com.example.homeworkDP.dto.UserRegisterRequest;
import com.example.homeworkDP.dto.UserResponse;
import com.example.homeworkDP.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    public User toUser(UserRegisterRequest request){
        return User.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .password(request.getPassword())
                .build();
    }

    public UserResponse toResponse(User savedUser){
        return new UserResponse(
                savedUser.getFirstName(),
                savedUser.getLastName(),
                savedUser.getEmail());
    }
}
