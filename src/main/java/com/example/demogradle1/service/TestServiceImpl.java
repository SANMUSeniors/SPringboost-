package com.example.demogradle1.service;

import com.example.demogradle1.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public String doTest() {

        return "";
    }
}
