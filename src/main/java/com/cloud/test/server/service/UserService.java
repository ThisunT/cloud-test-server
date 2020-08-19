package com.cloud.test.server.service;

import com.cloud.test.server.repository.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
}
