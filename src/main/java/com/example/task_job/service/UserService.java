package com.example.task_job.service;


import com.example.task_job.model.User;
import com.example.task_job.repository.UserRepository;
import org.springframework.stereotype.Service;


import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUser(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }
}


