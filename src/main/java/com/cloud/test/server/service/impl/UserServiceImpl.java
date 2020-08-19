package com.cloud.test.server.service.impl;

import com.cloud.test.server.repository.UserRepository;
import com.cloud.test.server.service.UserService;
import com.cloud.test.server.repository.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}
