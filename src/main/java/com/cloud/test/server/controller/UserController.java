package com.cloud.test.server.controller;

import com.cloud.test.server.service.UserService;
import com.cloud.test.server.repository.model.User;
import io.swagger.api.UserApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class UserController implements UserApi {

    @Autowired
    UserService userService;

    @GetMapping("/users/all")
    @Override
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> allUsers = userService.getAllUsers();
        return ResponseEntity.ok(allUsers);
    }
}
