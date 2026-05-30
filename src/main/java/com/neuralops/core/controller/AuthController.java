package com.neuralops.core.controller;

import com.neuralops.core.dto.RegisterRequest;
import com.neuralops.core.model.User;
import com.neuralops.core.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public User register(@RequestBody RegisterRequest request) {
        return userService.register(request);
    }
}