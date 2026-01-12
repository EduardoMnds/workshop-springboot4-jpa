package com.dev.course.services;

import com.dev.course.entities.User;
import com.dev.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User findById(long id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.get();
    }
}
