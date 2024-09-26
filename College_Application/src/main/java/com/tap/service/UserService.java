package com.tap.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tap.Entity.User;
import com.tap.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository = null;

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public User save(User user) {
        return userRepository.save(user);
    }
}
