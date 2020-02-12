package com.example.demo.service;

import com.example.demo.model.User;

public interface UserService {

    boolean isOlderInBrazil(int age);

    void save(User user);

}
