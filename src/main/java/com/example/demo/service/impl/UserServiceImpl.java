package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean isOlderInBrazil(int age) {
        if (age >= 18)
            return true;

        return false;
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

}
