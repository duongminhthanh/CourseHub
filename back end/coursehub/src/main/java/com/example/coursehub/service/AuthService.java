package com.example.coursehub.service;

import com.example.coursehub.dto.UserDTO;
import com.example.coursehub.entities.User;
import com.example.coursehub.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

     public User registerUser(UserDTO userDTO){
        User userDetail= User.builder()
                .name(userDTO.getName())
                .email(userDTO.getEmail())
                .password(passwordEncoder.encode(userDTO.getPassword()))
                .build();
        return userRepository.save(userDetail);
     }
}
