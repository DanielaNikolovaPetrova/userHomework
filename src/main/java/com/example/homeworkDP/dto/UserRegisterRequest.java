package com.example.homeworkDP.dto;

import lombok.*;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRegisterRequest {

    @Length(min = 3,message = "Name should contain at least 3 characters")
    private String firstName;
    @Length(min = 3)
    private String lastName;

    private String email;
    @Length(min = 8)
    private String password;
}
