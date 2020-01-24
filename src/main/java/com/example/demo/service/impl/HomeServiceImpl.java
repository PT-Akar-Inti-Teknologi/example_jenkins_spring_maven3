package com.example.demo.service.impl;

import com.example.demo.service.HomeService;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService {

    @Override
    public boolean isOlderInBrazil(int age) {

        if (age >= 18) {
            return true;
        }

        return false;

    }

}
